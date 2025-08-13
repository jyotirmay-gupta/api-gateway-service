/*
 * Copyright (c) 2025 Jyotirmay Gupta
 *
 * Project: API Gateway Service
 * Description: This is a personal project by Jyotirmay Gupta that implements an
 * API Gateway using Spring Cloud Gateway. It serves as a centralized entry point
 * to route and manage all REST APIs built for personal learning and use.
 *
 * This code is intended for educational and personal use, demonstrating core backend
 * concepts such as API routing, request filtering, load balancing, and integration
 * with microservices using Spring Boot.
 *
 * Licensed under the Apache License Version 2.0. See LICENSE file for more details.
 */

package com.jyotirmay.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiGatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayServiceApplication.class, args);
    }

}
