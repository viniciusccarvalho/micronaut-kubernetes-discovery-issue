FROM openjdk:14-alpine
COPY build/libs/frontend-*-all.jar frontend.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "frontend.jar"]