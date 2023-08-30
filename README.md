# ada-turma1043-web2-projeto

### [WIP]

Implementar uma API RESTful para receber pedidos de compras. Devem ser criadas as entidades: 
- Usuário, Endereço, Produto, Pedido, ItemPedido.

Deve ser disponibilizado as seguintes funcionalidades:
- Cadastrar o usuário, Validar nome, cpf, email e endereço.
- Recuperar e salvar os produtos de uma API externa
- Listar os produtos disponíveis
- Finalizar o pedido de compras
- O usuário (cliente) precisa realizar login (JWT)
- Salvar o pedido
- Validar o estoque
- Dar baixa no estoque
- Enviar um email de confirmação para o cliente
- Enviar um email para o responsável do departamento de vendas
- Os dados devem ser armazenados em um banco de dados Postgres
- A API deve ter pelo menos a autenticação básica.

-------- 


### ENDPOINTS

### Products
- ### Save a product
```bash
curl --location 'http://localhost:8081/products' \
--header 'Content-Type: application/json' \
--data '{
    "title": "Product 1",
    "price": 100.99,
    "description": "description 1",
    "image": "image 1",
    "category": "category 1"
}'
```

###### Resposta da requisição 201 CREATED

``` json
{
   "id":1,
   "title":"Product 1",
   "description":"description 1",
   "price":100.99,
   "image":"image 1",
   "category":"category 1",
   "createdAt":null,
   "updatedAt":null
}
```


- ### List all products
```bash
curl --location 'http://localhost:8081/products/list'
```

###### Resposta da requisição 200 OK

``` json
[
  [
    {
      "title": "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
      "price": 109.95,
      "description": "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
      "image": "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
      "category": "men's clothing"
    },
    {
      "title": "Mens Casual Premium Slim Fit T-Shirts ",
      "price": 22.3,
      "description": "Slim-fitting style, contrast raglan long sleeve, three-button henley placket, light weight & soft fabric for breathable and comfortable wearing. And Solid stitched shirts with round neck made for durability and a great fit for casual fashion wear and diehard baseball fans. The Henley style round neckline includes a three-button placket.",
      "image": "https://fakestoreapi.com/img/71-3HjGNDUL._AC_SY879._SX._UX._SY._UY_.jpg",
      "category": "men's clothing"
    },
    {
      "title": "Mens Cotton Jacket",
      "price": 55.99,
      "description": "great outerwear jackets for Spring/Autumn/Winter, suitable for many occasions, such as working, hiking, camping, mountain/rock climbing, cycling, traveling or other outdoors. Good gift choice for you or your family member. A warm hearted love to Father, husband or son in this thanksgiving or Christmas Day.",
      "image": "https://fakestoreapi.com/img/71li-ujtlUL._AC_UX679_.jpg",
      "category": "men's clothing"
    }, 
    ...
  ]
]
```

### Users

- ### Save a user

```bash
curl --location 'http://localhost:8081/users' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Nome 1",
    "cpf": "121.318.350-27",
    "email": "email1@email.com",
    "birthDate": "2012-02-22",
    "phone": "111111"
}'
```

###### Resposta da requisição 201 CREATED

``` json
{
   "id":1,
   "name":"Nome 1",
   "cpf":"121.318.350-27",
   "email":"email1@email.com",
   "birthDate":"2012-22-02",
   "phone":"111111"
}
```

- ### List all users
```bash
curl --location 'http://localhost:8081/users/list'
```

###### Resposta da requisição 200 OK

``` json
[
   {
      "id":1,
      "name":"Nome 1",
      "cpf":"121.318.350-27",
      "email":"email1@email.com",
      "birthDate":"2012-02-22",
      "phone":"111111"
   },
   {
      "id":2,
      "name":"Nome 2",
      "cpf":"288.271.360-61",
      "email":"email2@email.com",
      "birthDate":"2022-12-22",
      "phone":"22222"
   }
]
```

## [wip] Documentação do Swagger
Para visualizar a documentação da API e realizar testes, acesse: [Documentação do Swagger](http://localhost:8081/swagger-ui/index.html#/)