# ProductService_FakeStore
# Cart Service API

This is a Java Spring Boot application that provides a RESTful API for a Cart Service. It interacts with the FakeStoreApi to perform various operations related to a shopping cart.

## Endpoints

1. **Get All Cart Items**
    - Endpoint: `/carts`
    - Method: `GET`
    - Description: Fetches all cart items.
    - Response: Array of `FakeStoreApi` objects.
    ![alt text]![Screenshot from 2024-03-12 17-28-53](https://github.com/ruthwikchikoti/FakeStroreApi_CartService_MidTerm/assets/145591715/f21f736f-56f2-420d-8ce3-d1690932f123)

2. **Get Cart Item**
    - Endpoint: `/carts/{id}`
    - Method: `GET`
    - Description: Fetches a specific cart item by its ID.
    - Parameters: `id` (Long) - ID of the cart item.
    - Response: `FakeStoreApi` object.
    ![alt text]![Screenshot from 2024-03-12 17-31-18](https://github.com/ruthwikchikoti/FakeStroreApi_CartService_MidTerm/assets/145591715/58596bc1-8c1d-442e-ab06-78cbbd1f4871)

3. **Get Cart By User**
    - Endpoint: `/carts/user/{id}`
    - Method: `GET`
    - Description: Fetches a cart by a specific user ID.
    - Parameters: `id` (Long) - ID of the user.
    - Response: `FakeStoreApi` object.
    ![alt text]![Screenshot from 2024-03-12 17-31-46](https://github.com/ruthwikchikoti/FakeStroreApi_CartService_MidTerm/assets/145591715/c312e393-7f23-406d-84f6-26ddc05d5f14)


4. **Get Carts In Range**
    - Endpoint: `/carts?startdate={startDate}&enddate={endDate}`
    - Method: `GET`
    - Description: Fetches all carts within a specific date range.
    - Parameters: `startDate` (String), `endDate` (String) - Start and end dates in 'yyyy-MM-dd' format.
    - Response: Array of `FakeStoreApi` objects.
    ![alt text]![Screenshot from 2024-03-12 17-36-03](https://github.com/ruthwikchikoti/FakeStroreApi_CartService_MidTerm/assets/145591715/1929c398-0e0c-4531-b883-8341526421df)


5. **Update Cart Item**
    - Endpoint: `/carts/{id}`
    - Method: `PATCH`
    - Description: Updates a specific cart item.
    - Parameters: `FakeStoreApi` object.
    - Response: `FakeStoreApi` object.

6. **Add Cart Item**
    - Endpoint: `/carts/`
    - Method: `POST`
    - Description: Adds a new cart item.
    - Parameters: `FakeStoreApi` object.
    - Response: `FakeStoreApi` object.

7. **Delete Cart Item**
    - Endpoint: `/carts/{id}`
    - Method: `DELETE`
    - Description: Deletes a specific cart item.
    - Parameters: `id` (Long) - ID of the cart item.

these endpoints are the base URL of the FakeStoreApi, which is `https://fakestoreapi.com/`.


## Dependencies

This controller depends on the `CartService` for performing operations on the cart. The `CartService` is injected into the controller via the constructor.

## Data Transfer Object

The `FakeStoreApi` class is used as a Data Transfer Object (DTO) for cart items. It represents the structure of the data that is sent and received in HTTP requests and responses.

