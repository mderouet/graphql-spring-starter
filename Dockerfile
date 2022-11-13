
FROM eclipse-temurin:17-jdk

EXPOSE 8080

COPY . /usr/src/app

WORKDIR /usr/src/app

RUN ./gradlew --no-daemon --parallel clean app:assemble

COPY build/libs/*.jar /applications/graphql.jar

ENTRYPOINT ["java","-jar", "graphql.jar"]