@echo off
REM Step 1: Build project, skip tests
call gradlew.bat clean build -x test

REM Step 2: Run docker compose
docker-compose -f "%~dp0docker-compose.yml" up --build