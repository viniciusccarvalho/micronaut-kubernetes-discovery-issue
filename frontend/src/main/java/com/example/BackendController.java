package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("/backend")
@ExecuteOn(TaskExecutors.IO)
public class BackendController {

    private final BackendClient backendClient;
    private final Logger logger = LoggerFactory.getLogger(BackendController.class);

    public BackendController(BackendClient backendClient) {
        this.backendClient = backendClient;
    }

    @Get("/health")
    public String health() {
        logger.info("Calling backend service");
        return backendClient.health();
    }

    @Get("/hi")
    public String hi() {return "hello";}

}
