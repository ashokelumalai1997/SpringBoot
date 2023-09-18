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
