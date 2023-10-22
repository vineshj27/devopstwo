FROM eclipse-temurin:17
COPY target/devopstwo.jar devopstwo.jar]
CMD [ "java", "-jar", "devopstwo.jar" ]
