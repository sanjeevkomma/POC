FROM eclipse-temurin:21-jdk
WORKDIR /app
RUN mkdir -p logs

# COPY relative to build context (project root)
COPY build/libs/user-management-service-0.0.1-SNAPSHOT.jar ./user-management-service.jar

#EXPOSE 7200
#ENTRYPOINT ["java", "-jar", "user-management-service.jar"]

EXPOSE 7200 5005
ENTRYPOINT ["java","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005","-jar","user-management-service.jar"]