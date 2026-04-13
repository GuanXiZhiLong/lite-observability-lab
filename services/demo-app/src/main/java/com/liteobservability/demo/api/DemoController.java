package com.liteobservability.demo.api;

import com.liteobservability.demo.api.model.ApiResponse;
import com.liteobservability.demo.error.DemoControlledException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private static final Logger log = LoggerFactory.getLogger(DemoController.class);

    @GetMapping(path = "/health", produces = MediaType.TEXT_PLAIN_VALUE)
    public String health() {
        return "OK";
    }

    @GetMapping(path = "/api/success", produces = MediaType.APPLICATION_JSON_VALUE)
    public ApiResponse success() {
        log.info("Processed success endpoint");
        return ApiResponse.success("success");
    }

    @GetMapping(path = "/api/error", produces = MediaType.APPLICATION_JSON_VALUE)
    public ApiResponse error() {
        log.error("Controlled error endpoint invoked");
        throw new DemoControlledException("controlled failure");
    }

    @GetMapping(path = "/api/slow", produces = MediaType.APPLICATION_JSON_VALUE)
    public ApiResponse slow() throws InterruptedException {
        Thread.sleep(2000L);
        log.info("Processed slow endpoint");
        return ApiResponse.success("slow");
    }
}
