# Spring boot sample

A spring boot project which shows how to use authorization server on microservice architecture.

## Running Locally

Make sure you have Docker with docker-compose and Java 17+ installed.

```sh
git clone https://github.com/xtreme-uz/spring-auth-server.git
gradlew clean bootJar
docker-compose up
```