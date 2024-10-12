FROM openjdk:17-alpine
EXPOSE 8080
ADD target/spring-docker-ec2.jar spring-docker-ec2.jar
ENTRYPOINT ["java","-jar","/spring-docker-ec2.jar"]