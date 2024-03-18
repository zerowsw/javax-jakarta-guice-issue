# Sample Project: Javax to Jakarta Migration Issue

## Overview

This sample project demonstrates a potential issue that may arise when migrating from Javax annotations to Jakarta annotations using OpenRewrite, particularly in conjunction with a lower version of a dependency injection framework like Guice. The issue arises due to the lack of support for Jakarta annotations in older versions of Guice, leading to potential failures or errors in the application.

## Purpose

The purpose of this project is to showcase a real-world scenario where changing source code using the OpenRewrite `JavaxMigrationToJakarta` recipe can cause issues, specifically when the application relies on a dependency injection framework like Guice that does not support Jakarta annotations.

## Problem Statement

When migrating from Javax annotations to Jakarta annotations using tools like OpenRewrite, it's essential to consider the compatibility with other frameworks and libraries used in the application. In this case, older versions of Guice may not support Jakarta annotations, leading to compilation errors or runtime failures when Jakarta annotations are introduced into the codebase.

## How to Use

1. Clone or download the sample project repository.
2. Review the source code in the project, paying particular attention to the usage of annotations and the dependency injection framework (Guice).
3. Run `mvn clean install` to observe its behavior before migration.
4. Use the OpenRewrite `JavaxMigrationToJakarta` recipe to migrate from Javax to Jakarta. Command is `mvn -U org.openrewrite.maven:rewrite-maven-plugin:run -Drewrite.recipeArtifactCoordinates=org.openrewrite.recipe:rewrite-migrate-java:RELEASE -Drewrite.activeRecipes=org.openrewrite.java.migrate.jakarta.JavaxMigrationToJakarta`
5. Run `mvn clean install` to build the project again to observe unit test failures caused by the migration.