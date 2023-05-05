# Dynamo DB integration with Spring Boot

How to easily integrate DynamoDB with a Spring Boot application.

## Prerequisites
* Apache Maven
* Docker Desktop
* AWS CLI

## Build/Run Instruction

* Run : `docker-compose up`

* Once the docker container for DynamoDB is successfully started, create DynamoDB table using AWS CLI.
```
create-table --table-name LibraryCatalog --attribute-definitions AttributeName=author,AttributeType=S AttributeName=topic,AttributeType=S --key-schema AttributeName=author,KeyType=HASH AttributeName=topic,KeyType=RANGE --provisioned-throughput ReadCapacityUnits=5,WriteCapacityUnits=5 --endpoint-url http://localhost:8000
```
*  Start Spring Boot application