FROM java:8
LABEL maintainer="asalome01@gmail.com"
WORKDIR /app2
COPY target/peopledocker-0.0.1-SNAPSHOT.jar /app2/peopledocker-app.jar
ENTRYPOINT ["java","-jar","peopledocker-app.jar"]