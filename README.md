# Java 8 Features

Practical exploration of some relevant features introduced in Java 8.

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
└── main
    └── java
        └── dev
            └── eltiempovuela
                └── java8
                    └── jeps
                        ├── App.java
                        ├── Jep126.java
                        ├── Jep107.java
                        ├── Jep150.java
                        ├── OptionalDemo.java
                        └── DefaultMethods.java
```

## Requirements

- JDK 8
- Maven 3.8 or higher

## How to compile

```bash
  mvn clean compile
```

## How to run

Run the `App` class.

If the Maven Exec Plugin is configured, you can also run:

```bash
  mvn exec:java
```

The application shows a simple menu where each option executes one Java 8 example.

## Purpose

The goal of this project is to explore and understand Java 8 features through small, simple and executable code
examples.