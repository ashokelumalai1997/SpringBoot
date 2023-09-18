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

