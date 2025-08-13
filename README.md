# API Gateway Service

**© 2025 Jyotirmay Gupta**

[![Build Status](https://github.com/jyotirmay-gupta/api-gateway-service/actions/workflows/maven.yml/badge.svg)](https://github.com/jyotirmay-gupta/api-gateway-service/actions/workflows/maven.yml)
[![License](https://img.shields.io/badge/License-Apache%202.0-brightgreen.svg)](LICENSE)
[![GitHub stars](https://img.shields.io/github/stars/jyotirmay-gupta/api-gateway-service.svg)](https://github.com/jyotirmay-gupta/api-gateway-service/stargazers)
[![GitHub commits](https://img.shields.io/github/commit-activity/y/jyotirmay-gupta/api-gateway-service.svg)](https://github.com/jyotirmay-gupta/api-gateway-service/commits)
[![GitHub last commit](https://img.shields.io/github/last-commit/jyotirmay-gupta/api-gateway-service.svg)](https://github.com/jyotirmay-gupta/api-gateway-service/commits)
[![Contributors](https://img.shields.io/github/contributors/jyotirmay-gupta/api-gateway-service.svg)](https://github.com/jyotirmay-gupta/api-gateway-service/graphs/contributors)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-v3.5.3-brightgreen)](https://spring.io/projects/spring-boot)
[![Spring Cloud Gateway](https://img.shields.io/badge/Spring%20Cloud%20Gateway-v2025.0.0-brightgreen)](https://spring.io/projects/spring-cloud-gateway)
[![Java](https://img.shields.io/badge/Java-21-brightgreen)](https://www.oracle.com/java/)

**Project:** API Gateway Service

**Description:** This is a personal Spring Cloud API Gateway implementation by Jyotirmay Gupta. It serves as a reactive, non-blocking entry point for routing and filtering HTTP requests to microservices using Spring Cloud Gateway and WebFlux.

The project demonstrates key cloud-native patterns like service discovery, centralized routing, and non-blocking request handling in microservice environments.

Licensed under the Apache License Version 2.0. See [LICENSE](LICENSE) for more details.

---

## 🧭 Overview

**API Gateway Service** acts as the main gateway for routing HTTP requests to backend services.

It uses [Spring Cloud Gateway](https://spring.io/projects/spring-cloud-gateway) with **Spring WebFlux** for fully non-blocking, reactive request handling. The gateway dynamically discovers services by their service IDs and forwards traffic accordingly.

---

## ✅ Features

- Reactive, non-blocking routing using Spring WebFlux
- Dynamic service discovery via Eureka
- Lightweight gateway setup with minimal configuration
- Execution time logging filter for all requests
- Centralized traffic entry point for microservices
- Easily extensible for rate-limiting, security, and filtering

---

## 🛠 Technologies Used

- Java 21
- Spring Boot
- Spring Cloud Gateway
- Spring WebFlux (Reactive)

---

## Request Logging Filter
All incoming requests are timed using a custom global filter.

Example log:

```pgsql
INFO  - Request to [/user-service/api/users] completed in 35 ms with signal [ON_COMPLETE]
ERROR - Request to [/order-service/api/orders] failed after 12 ms with error: Connection refused
```
---


## 📄 License
Licensed under the Apache License Version 2.0. See the LICENSE file for details.

---

*Created by Jyotirmay Gupta — 2025*

