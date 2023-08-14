package com.example.api;

import io.micronaut.context.annotation.Factory;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Factory
@OpenAPIDefinition(info = @Info(title = "demo1-test1", version = "0.0"))
public class ApiConfiguration {
}
