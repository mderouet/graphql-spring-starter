
FROM eclipse-temurin:17-jdk

EXPOSE 8080

COPY . /
WORKDIR /

RUN ./gradlew --no-daemon --parallel clean assemble

COPY build/libs/*.jar /applications/graphql.jar

ENTRYPOINT ["java","-jar", "graphql.jar"]