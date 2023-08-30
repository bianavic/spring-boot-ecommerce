package br.com.mtanuri.ada.t1043.web2.projeto.user.controller;

import br.com.mtanuri.ada.t1043.web2.projeto.user.dto.NewUserDTO;
import br.com.mtanuri.ada.t1043.web2.projeto.user.model.User;
import br.com.mtanuri.ada.t1043.web2.projeto.user.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Collections;
import java.util.List;

@Tag(name = "User Api", description = "This service is responsible for managing users.")
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final UserService userService;

    @Operation(
            summary = "Register a new user")
    @ApiResponses(
            value = {
                    @ApiResponse(responseCode = "201", description = "Registration of new users")
//            @ApiResponse(responseCode = "404", content = {@Content(schema = @Schema())}),
//            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema())})
            })
    @PostMapping(consumes="application/json")
    public ResponseEntity<User> saveUser(@RequestBody @Valid NewUserDTO newUser) {

        User user = userService.save(newUser);
        logger.info("Saving a new user. Response: {}", newUser);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
                        .buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(uri).body(user);

    }

    @Operation(
            summary = "Get a list of all users")
    @ApiResponses(
            value = {
                    @ApiResponse(responseCode = "200", description = "List of all registered users")
//            @ApiResponse(responseCode = "404", content = {@Content(schema = @Schema())}),
//            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema())})
            })
    @GetMapping("/list")
    public ResponseEntity<List<List<User>>> listAllUsers() {

        List<User> response = userService.getAll();
        logger.info("Getting the list of users. Response: {}", response);
        return ResponseEntity.ok(Collections.singletonList(response));

    }

//    @GetMapping("/{id}")
//    public ResponseEntity<UserDTO> getUserById(@PathVariable(value = "id") Long userId){
//
//        UserDTO user = userRepository.findById(userId)
//                .orElseThrow(() -> new NoSuchElementException("User not available for Id :"+userId));
//
//        return ResponseEntity.ok().body(user);
//    }

}
