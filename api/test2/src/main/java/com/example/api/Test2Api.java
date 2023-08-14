package com.example.api;

import com.example.common.StringValue;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

@Controller("/api/test2")
public interface Test2Api {
    @Post(value = "/update", processes = "application/json")
    String updateValue(@Body StringValue value);
}
