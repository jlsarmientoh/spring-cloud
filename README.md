# Spring Cloud Workshop

This workshop explores main features of Spring Cloud that enables developers to build cloud native applications and following a microservices architectural style.

## How to walkthroug this repository

Master branch has the final state of the code with all the features in the scope.  The idea is to start from scratch by creating a micro service and then evolve the project.

Project development has been split in 5 stages, there's a branch for each stage.  Each stage groups and introduces Spting Cloud features to the code base

Here's the list of branches:

- stage-1-configurable-properties
- stage-2-config-server
- stage-3-currency-exchange-micro-services
- stage-4-scaling-services
- stage-5-api-gateway

### Stage 1

- Bootstrap a micro service application that uses configurable properties
- Explores basic features of Spring Boot

### Stage 2

- Introduces a Configuration Server from which micro services get their reuntime configurations

### Stage 3

- Introduces 2 micro services:
  * A currency conversion micro service with acces to in memmory database that hold currency conversion tables
  * A currency exhange service that calculates money conversion based on user's input

### Stage 4

- Introduces features for scaling up/down our micro services:
  * Service discovery
  * Load balancing
  * Naming service
  * REST template clients

### Stage 5

- Introduces advanced features
  * API Gateway
  * Distributed logging
  * Distibuted tracing
  * Event bus integration
