# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jre-alpine
# copy JAR into image
COPY /target /target 
# run application with this command line 
EXPOSE 8092
CMD ["/usr/bin/java", "-cp", "target/swagger-spring-1.0.0.jar", "org.springframework.boot.loader.JarLauncher"]
