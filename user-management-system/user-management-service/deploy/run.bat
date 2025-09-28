@echo off
REM Build Spring Boot JAR
call "%~dp0..\gradlew.bat" clean build

REM Build and run Docker
REM docker-compose -f "%~dp0docker-compose.yml" up --build -d  #To run in detached mode
docker-compose -f "%~dp0docker-compose.yml" up --build