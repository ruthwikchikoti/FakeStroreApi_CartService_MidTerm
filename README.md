# ProductService_FakeStore
# Cart Service API

This is a Java Spring Boot application that provides a RESTful API for a Cart Service. It interacts with the FakeStoreApi to perform various operations related to a shopping cart.

## Endpoints

1. **Get All Cart Items**
    - Endpoint: `/carts`
    - Method: `GET`
    - Description: Fetches all cart items.
    - Response: Array of `FakeStoreApi` objects.
    ![alt text](image.png)
2. **Get Cart Item**
    - Endpoint: `/carts/{id}`
    - Method: `GET`
    - Description: Fetches a specific cart item by its ID.
    - Parameters: `id` (Long) - ID of the cart item.
    - Response: `FakeStoreApi` object.
    ![alt text](image-1.png)
3. **Get Cart By User**
    - Endpoint: `/carts/user/{id}`
    - Method: `GET`
    - Description: Fetches a cart by a specific user ID.
    - Parameters: `id` (Long) - ID of the user.
    - Response: `FakeStoreApi` object.
    ![alt text](image-2.png)

4. **Get Carts In Range**
    - Endpoint: `/carts?startdate={startDate}&enddate={endDate}`
    - Method: `GET`
    - Description: Fetches all carts within a specific date range.
    - Parameters: `startDate` (String), `endDate` (String) - Start and end dates in 'yyyy-MM-dd' format.
    - Response: Array of `FakeStoreApi` objects.
    ![alt text](image-3.png)

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

