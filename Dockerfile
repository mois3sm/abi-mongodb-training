#FROM openjdk:11-jdk-slim
#WORKDIR /home/mmonteiro/cit/abi/training/git2/abi-mongodb-training
#
#COPY target/abi-mongodb-training-0.0.1-SNAPSHOT.jar app.jar
#ENTRYPOINT [“java”,”-jar”,”app.jar”]


FROM maven:3.5-jdk-8 AS build
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean package

FROM gcr.io/distroless/java
COPY --from=build /usr/src/app/target/abi-mongodb-training-1.0.0-SNAPSHOT.jar /usr/app/abi-mongodb-training-1.0.0-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/app/abi-mongodb-training-1.0.0-SNAPSHOT.jar"]