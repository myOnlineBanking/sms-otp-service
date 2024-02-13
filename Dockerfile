FROM java:8
LABEL maintainer="contacthamza.tahri@gmail.com"
WORKDIR /app
COPY target/sms-otp-service-0.0.1-SNAPSHOT.jar /app/spring-boot-app.jar
ENTRYPOINT ["java","-jar","spring-boot-app.jar"]
EXPOSE 8080