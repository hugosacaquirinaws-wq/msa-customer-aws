FROM eclipse-temurin:17-jre-alpine
RUN addgroup -S javaapp && adduser -S javaapp -G javaapp
WORKDIR /app
COPY --chown=javaapp:javaapp target/application.jar app.jar
USER javaapp
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]