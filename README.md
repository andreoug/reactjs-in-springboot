# ReactJS in SpringBoot

ReactJS webapp in SpringBoot is a webapp that is running inside Spring Boot as any other Javascript library with the use of Thymeleaf.

![Component Diagram](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/andreoug/reactjs-in-springboot/main/UML/component-diagram.puml)

## Use of Spring Boot's Thymeleaf Template
Thymeleaf in Spring Boot requires static/index.html file, which is defined in [application.properties](src/main/resources/application.properties) file.

```properties
    spring.thymeleaf.prefix=classpath:/static/
```
With this, instead of defining a static index.html, we drive spring's thymeleaf to target's [static](target/classes/static/index.html) directory that maven builds while preparing reactJS integration in Spring Boot.

As you can see on [pom.xml](pom.xml), you can create your own reactJS application instead of the current, as long as it use npm & yarn node package managers, which maven will prepare for you during the packaging.

```xml
    <frontend-src-dir>${project.basedir}/reactjs</frontend-src-dir>
```

## Prerequisites
1. java 8
2. maven
3. npx (if you want to create you own webapp from scratch)

## Installing / Getting Started
### Spring Boot Server Build and Run Instructions
To build the server, we will need to execute the following lines:

```bash
    mvn clean package
```
To run the server, we will need only java

```bash
    java -jar target/reactjs-in-springboot-0.0.1-SNAPSHOT.jar 
```

### Spring Boot Server Docker Build and Run Instructions
To build the server in Docker, we will need to execute the following lines:

```bash
    ./local.build.and.run.sh
```

Beware that if you use your own reactjs in different directory than *reactjs*, you need to update [Dockerfile](Dockerfile) with the respective directory name. Otherwise, your reactjs app won't copied on the container.

### ReactJS Server Build and Run Instructions

As you already know, the command to create a new reactjs app from scratch with npx is:
```bash
    npx create-react-app yourreactjs
```

You can proceed with your development with reactJS separately at [localhost:3000](http://localhost:3000/) by starting the reactjs with the following command:

```bash
    npm start 
    # or
    yarn start 
```

## Issues and Feature Requests
- Please, provide your issues or feature requests at reactjs-in-springboot [issues](https://github.com/andreoug/reactjs-in-springboot/issues) page.
  )
