package com.example.api;

import com.example.common.StringValue;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.swagger.v3.oas.annotations.tags.Tag;

@Controller("/api/test2")
@Tag(name = "Test2")
public interface Test2Api {
    @Post(value = "/update", processes = "application/json")
    String updateValue(@Body StringValue value);
}
