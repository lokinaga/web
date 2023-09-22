FROM eclipse-temurin:17
COPY target/webclient.jar webclient.jar
CMD ["java","-jar","webclient.jar"]