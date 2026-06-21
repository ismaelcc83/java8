# Java 8 Features

![Maven Build](https://github.com/ismaelcc83/java8/actions/workflows/maven.yml/badge.svg)

Practical exploration of some relevant features introduced in Java 8.

This repository contains small, focused and executable examples designed to understand the main programming improvements
introduced with Java 8, including lambda expressions, streams, the new Date and Time API, `Optional` and default methods
in interfaces.

## Author

Created by [Ismael Castro Capafons](https://github.com/ismaelcc83)

## Features included

- **JEP 126** - Lambda Expressions
- **JEP 107** - Bulk Data Operations for Collections / Streams
- **JEP 150** - Date and Time API
- **Optional** - Safer handling of nullable values
- **Default Methods** - Method implementations inside interfaces

## Project structure

```text
src
├── main
│   └── java
│       └── dev
│           └── eltiempovuela
│               └── java8
│                   └── jeps
│                       ├── App.java
│                       ├── DefaultMethods.java
│                       ├── Jep107.java
│                       ├── Jep126.java
│                       ├── Jep150.java
│                       └── OptionalDemo.java
└── test
    └── java
        └── dev
            └── eltiempovuela
                └── java8
                    └── jeps
                        ├── DefaultMethodsTest.java
                        ├── Jep107Test.java
                        ├── Jep126Test.java
                        ├── Jep150Test.java
                        └── OptionalDemoTest.java
```

## Requirements

- JDK 8
- Maven is not required locally because this project includes the Maven Wrapper.

## Maven Wrapper

This project includes the Maven Wrapper, so the build can be executed without installing Maven manually.

On Linux or macOS, use:

```bash
./mvnw
```

On Windows, use:

```bash
mvnw.cmd
```

## How to compile

On Linux or macOS:

```bash
./mvnw clean compile
```

On Windows:

```bash
mvnw.cmd clean compile
```

## How to run

Run the `App` class from your IDE.

The application shows a simple console menu where each option executes one Java 8 example.

## How to test

On Linux or macOS:

```bash
./mvnw clean test
```

On Windows:

```bash
mvnw.cmd clean test
```

## How to verify

Run the full Maven verification lifecycle.

On Linux or macOS:

```bash
./mvnw clean verify
```

On Windows:

```bash
mvnw.cmd clean verify
```

This command compiles the project, runs the tests and executes the configured quality checks, including Spotless.

## How to format

Format the code with Spotless.

On Linux or macOS:

```bash
./mvnw spotless:apply
```

On Windows:

```bash
mvnw.cmd spotless:apply
```

To check formatting without modifying files, run:

On Linux or macOS:

```bash
./mvnw spotless:check
```

On Windows:

```bash
mvnw.cmd spotless:check
```

## Continuous Integration

This project includes a GitHub Actions workflow that runs the Maven build automatically on pushes and pull requests.

The workflow executes the full Maven verification lifecycle:

```bash
mvn clean verify
```

If desired, the workflow can also be changed to use the Maven Wrapper:

```bash
./mvnw clean verify
```

## Purpose

The goal of this project is to explore and understand Java 8 features through small, simple and executable code
examples.

The examples are intentionally simple, but the project also includes unit tests, code formatting and build automation to
keep the repository clean, maintainable and closer to a professional Java project structure.

## Notes

Java 8 introduced important changes to the language and the standard library. The examples in this repository focus on
the most relevant additions for day-to-day backend development:

- using lambda expressions to make code more expressive;
- using streams to process collections declaratively;
- using the Date and Time API instead of older date classes;
- using `Optional` to represent optional values more explicitly;
- using default methods to evolve interfaces without breaking implementations.
