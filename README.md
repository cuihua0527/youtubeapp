# youtubeApp

Spring Boot, Thymeleaf, PostgreSQL based login sample project.

## Stack

- Java 17
- Spring Boot 3.3.5
- Thymeleaf
- PostgreSQL
- Gradle

## Features

- `/login` login page
- layered flow: `Controller -> Service -> ServiceImp -> Dao`
- PostgreSQL based admin lookup
- redirect from `/` to `/login`

## Run

If Gradle is installed locally:

```powershell
gradle bootRun
```

If you add a Gradle wrapper later:

```powershell
.\gradlew.bat bootRun
```

Open:

```text
http://localhost:8080/login
```

## Build

```powershell
gradle build
```

## Main Paths

```text
src/main/java/com/saika
src/main/resources/templates
src/main/resources/static/css
```
