package com.example.api;

import com.example.common.BooleanValue;
import com.example.common.NumberValue;
import com.example.common.StringValue;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Patch;

@Controller("/api/test1")
public interface Test1Api {
    @Get(value = "available", processes = "application/json")
    BooleanValue isAvailable();

    @Patch(value = "availability", processes = "application/json")
    StringValue avail(BooleanValue status, @Body NumberValue number);
}
