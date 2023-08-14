package com.example.api;

import com.example.common.NumberValue;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;

@Controller("/api/test3")
public interface Test3Api {
    @Delete("/{value}")
    Object deleteValue(NumberValue value);
}
