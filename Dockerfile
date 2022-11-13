
FROM eclipse-temurin:17-jdk

EXPOSE 8080

COPY . /
WORKDIR /

RUN ./gradlew --no-daemon --parallel clean assemble

ENTRYPOINT ["java","-jar", "build/libs/*.jar"]