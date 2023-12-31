# Getting started with SpringBoot

## Why SpringBoot?
You can build web apps and REST API w/o Spring Boot as well
What is the need of Spring Boot
What are the goals of Spring Boot?
How Spring Boot work
Compare Spring Boot vs Spring MVC vs Spring

# Approach
Understand the world before SB
Create a SB Project
Build a simple REST API using SB
Understand the MAGIC of Spring Boot
    - Spring Initializr
    - Starter Projects
    - Auto Configuration
    - Developer Tools
    - Actuator
    - ...

## World Before SB
1. Dependency management
- Setting up Spring Projects before SB was not easy
  - Need spring, log4j, jackson etc
- Manage frameworks and versions
  - REST API - Spring framework, Spring MVC, JSON binding framework
  - Unit tests - Spring Test, Mockito, Junit, ...

2. web.xml
- Configure DispatcherServlet for S MVC

3. Define Spring Config
- Component Scan
- View Resolver

4. Non Func Req - manual impl
- Logging
- Error Handling 
- Monitoring


And repeat this for every new project!
Lot of time - few days to setup. Maintenances work as well!

## How SB makes them easy?
1. Create a SB project
2. Build a simple REST API using SB

## Most important goal of SB
1. Help you Build Production ready apps Quickly
   - Build Quickly
     - Spring Initializr
     - Spring Boot Starter Projects
     - Spring Boot Auto Configuration
     - Spring Boot DevTools
   - Be Prod Ready
     - Logging
     - Different configurations for Different Environments
       - Profiles, ConfigurationProperties
     - Monitoring(Spring Boot Actuator)

## Spring Boot Starter Projects
- I need a lot of frameworks to build application features:
  - Build a REST API: I need Spring, Spring MVC, Tomcat, JSON conversion
  - Write unit tests: I need spring test, junit, mockito...
- How can I group them and make it easy to build apps
  - Starters: **Convenient dependency descriptors** for diff. features
- Spring Boot provides variety of starter projects:
  - Web Apps & REST API - Spring Boot Starter web(spring-webmvc, spring-web, springboot-starter-tomcat, spring-boot-starter-json)
  - Unit tests -  Spring Boot Starter Test
  - Talk to database using JPA - Spring Boot Starter Data JPA
  - Talk to database using JDBC - Spring Boot Starter JDBC
  - Secure your web app or REST API -  Spring Boot Starter Security

## Spring Boot Auto Configuration
- I need lot of configuration to build Spring app:
  - Component Scan, DispatchServlet, Data Sources, JSON Conversion
- How can I simplify this?
  - Auto Configuration: Automated configuration for your app
    - Decided based on
      - Which framework are in the class path
      - What is the existing config(Annotations etc)?
- All auto config related to are defined in Spring Boot Auto Confgire.jar
  - Can customize using application.properties under resources folder
- Example: Spring Boot Starter Web
  - Dispatcher Servlet (DispatcherServletAutoConfiguration)
  - Embedded Servlet Container - Tomcat is the default
  - Default Error Pages
  - Bean <-> JSON (Jackson)

## Build faster with Spring Boot DevTools
- Increase Developer Productivity
- Why do you need to restart the server manually for every code change?
- Easy to test the changes locally
- Any change in pom.xml needs manual restart. For most other files like properties, it works automatically

# Prod Ready

## Managing App. Config using Profiles
- Applications have diff env: Dev, QA, Stage, Prod...
- Different environments need different configuration:
  - Different Databases
  - Different webservices
- How can you provide diff config for diff environments
  - Profiles :  Environment specific configuration
- How can you define externalized configuration for your application


- Create different profiles for each:

**Dev**
**QA**
**Stage**
**Prod**


- Say we want to log trace in dev and info in prod
- create application-dev.properties, *-prod.properties etc and set "spring.profile.active=<env>" in application.properties
- If any field in properties is found in env.properties, it will be replaced


Order - includes all below

trace 
debug
info
warning
error

## Simplify Deployment with Spring Boot Embedded Servers

- How do you deploy your application
  - Step 1 : Install java
  - Step 2 : Install Web/Application Server
  - Step 3: Deploy the WAR(Web ARchive) 
    - This is the OLD WAR approach
    - Complex to setup

- Embedded Server - Simpler alternative
  - Step 1: Install Java
  - Step 2: Run JAR file
  - Make JAR not WAR (Credit: JosH Long!)
  - Embedded Server Examples:
    - spring-boot-starter-tomcat
    - spring-boot-starter-jetty
    - spring-boot-starter-undertow

## Monitor Applications using Spring Boot Actuator
- Monitor and manage your application in your production
- Provides a number of endpoints
  - beans - Complete list of Spring beans in your app
  - health - Application health information
  - metrics - Application metrics
  - mappings - Details around request mappings
  - etc
- "management.endpoints.web.exposure.include=*" in properties

## Understanding Spring Boot vs Spring MVC vs Spring
- Spring Boot vs Spring MVC vs Spring: what's in it
  - Spring Framework : Dependency Injection
    - @Component, @Autowired, Component Scan etc..
    - Just Dependency Injection is NOT sufficient (you need other frameworks to build apps)
      - Spring Modules and Spring Projects: Extend Spring Eco System
        - Provide good integration with other frameworks (Hibernate/JPA, JUnit & Unit Testing)
  - Spring MVC (Spring Module) : Simplify building web apps and REST API
    - Building web aps with Struts was very complex
    - @Controller, @RestController, @RequestMapping("/courses")
  - Spring Boot (Spring Project) : Build Prod ready apps quickly
    - Starter projects - Make it easy to build variety of applications
    - Auto configuration - Eliminate configuration of setup Spring, Spring MVC and other frameworks!
    - Enable non functional requirements (NFRs):
      - Actuator: Enables Advanced Monitoring of Applciations
      - Embedded servers : No need for separate application servers
      - Logging and Error handling
      - Profiles and ConfigurationProperties
