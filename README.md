# Student API
The purpose of this API is to create, read, update and delete a student from a database.

## Set up
```shell
git clone https://github.com/alisboam/studentAPI.git
```

#### Requirements
- PostgreSQL

#### Running

```sh
cd student
./mvnw spring-boot:run
```
### Sample request

```shell
curl --location --request GET 'http://localhost:8080/api/v1/student'
```

```shell
curl --location --request POST 'http://localhost:8080/api/v1/student' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Marcos",
    "email": "marcos@email.com",
    "birthDate": "2000-01-05"
  }'
```
```shell
curl --location --request DELETE 'http://localhost:8080/api/v1/student/3'
```
```shell
curl --location --request PUT 'http://localhost:8080/api/v1/student/1?name=Ana&email=ana@email.com'
```
Params
 - name: Ana
 - email: ana@email.com

### Sample response

```json
{
    "id": 2,
    "name": "Alex",
    "email": "alex@email.com",
    "birthDate": "2002-01-05",
    "age": 20
  }
```
