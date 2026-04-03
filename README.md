# youtubeApp

Spring Boot와 Thymeleaf로 구성한 로그인 페이지 예제 프로젝트입니다.

## 기술 스택

- Java 17
- Spring Boot 3
- Thymeleaf
- Maven

## 기능

- `/login` 로그인 화면 제공
- `/` 접속 시 `/login`으로 리다이렉트
- 반응형 UI 적용

## 실행 방법

```powershell
mvn spring-boot:run
```

브라우저에서 아래 주소로 접속합니다.

```text
http://localhost:8080/login
```

## 빌드 방법

```powershell
mvn -DskipTests package
```

## 프로젝트 구조

```text
src/main/java/com/youtubuapp
src/main/resources/templates
src/main/resources/static/css
```

## 참고

현재 로그인 화면은 UI 예제이며, 실제 인증 로직은 아직 연결되어 있지 않습니다.
