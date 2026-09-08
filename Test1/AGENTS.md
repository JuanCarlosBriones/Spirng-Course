# AGENTS.md

## Project

Spring Boot 4.0.8 web app (Maven, Java 17). Uses Spring WebMVC + Thymeleaf.
Base package: `fes.aragon`. Entry point: `test1/src/main/java/fes/aragon/Test1Application.java`.

## Layout

The actual project lives inside `test1/` — all Maven commands must run from that directory.

```
test1/
  pom.xml
  src/main/java/fes/aragon/   # application code
  src/main/resources/          # properties, templates
  src/test/java/fes/aragon/   # tests
```

## Commands

Run from `test1/` directory:

```bash
./mvnw spring-boot:run          # dev server
./mvnw test                     # run tests
./mvnw package                  # build JAR (skips tests)
./mvnw package -DskipTests=false # build including tests
```

The Maven wrapper (`mvnw`) is included — use it instead of a system `mvn`.

## Conventions

- Tab indentation in Java files (matches existing code).
- Single test class exists: `Test1ApplicationTests` with a context-loads smoke test.
