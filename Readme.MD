

## Running the Application

To run the Spring Boot application, use the following command:

```shell
./gradlew bootRun
```

On Windows, use:

```shell
gradlew.bat bootRun
```

## Creating a Notification

You can create a notification by making a `POST` request to the `/notification` endpoint. Below is an example using `curl`.

### Example Request

```sh
curl --location 'http://localhost:8080/notification' \
--header 'Content-Type: application/json' \
--data '{
    "currency": "Bitcoin",
    "price": 100.0,
    "highPrice": 101.0,
    "volume": 99,
    "marketCap": 87
}'
```

### Request Body Parameters

- `currency` (string): The name of the currency (e.g., "Bitcoin").
- `price` (number): The current price of the currency.
- `highPrice` (number): The highest price of the currency.
- `volume` (number): The trading volume of the currency.
- `marketCap` (number): The market capitalization of the currency.

## Endpoints

### POST /notification

Creates a new notification with the provided details.

#### Request

- Method: `POST`
- URL: `http://localhost:8080/notification`
- Headers:
    - `Content-Type: application/json`
- Body:
  ```json
  {
      "currency": "Bitcoin",
      "price": 100.0,
      "highPrice": 101.0,
      "volume": 99,
      "marketCap": 87
  }
  ```

## Creating Subscription

You can create a subscription by making a `POST` request to the `/subscription` endpoint. Below is an example using `curl`.

### Example Request

```sh
curl --location 'http://localhost:8080/subscription' \
--header 'Content-Type: application/json' \
--data-raw '{
    "currency": "Bitcoin",
    "emailAddress": "abc@gmail.com"
}'
```

## Notification Status


### Example Request

```sh
curl --location 'http://localhost:8080/notification?currency=Bitcoin'
```

```sh
curl --location 'http://localhost:8080/notification?notificationId=1'
```

## Delete Notification
```sh
curl --location --request DELETE 'http://localhost:8080/notification/4'
```
