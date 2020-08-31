package com.example;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client("backend")
public interface BackendClient {
    @Get("/health")
    public String health();
}
