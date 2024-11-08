FROM maven:3.9.9-eclipse-temurin-17-alpine AS build
WORKDIR /usr/app
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17-slim
WORKDIR /usr/app
COPY --from=build /usr/app/target/practice1-0.0.1-SNAPSHOT.jar app.jar
CMD [ "java","-jar","app.jar" ]