FROM openjdk:11-jdk-slim
WORKDIR /home/mmonteiro/cit/abi/training/git2/abi-mongodb-training

COPY target/abi-mongodb-training-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [“java”,”-jar”,”app.jar”]