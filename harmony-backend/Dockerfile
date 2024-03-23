FROM gradle:8.3.0-jdk17 AS Builder

WORKDIR /app/harmony

COPY --chown=gradle:gradle . .

#RUN gradle nativeCompile
RUN gradle clean build --no-daemon -x test

FROM openjdk:17-alpine

WORKDIR /app/harmony

COPY --from=Builder /app/harmony/build/libs/harmony*.jar app.jar

EXPOSE 8080

CMD ["java", "-Dspring.profiles.active=prod", "-jar", "./app.jar"]
