package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/backend")
public class BackendController {

    private final BackendClient backendClient;

    public BackendController(BackendClient backendClient) {
        this.backendClient = backendClient;
    }

    @Get("/health")
    public String health() {
        return backendClient.health();
    }
}
