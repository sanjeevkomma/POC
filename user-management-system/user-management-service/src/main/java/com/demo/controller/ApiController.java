package com.demo.controller;


import com.demo.service.RestTemplateService;

import com.demo.util.converter.DataTransformationService;
import com.fasterxml.jackson.databind.JsonNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {

    private final RestTemplateService restTemplateService;
    private final DataTransformationService transformationService;

    private static final Logger log = LogManager.getLogger(ApiController.class);

    public ApiController(RestTemplateService restTemplateService,DataTransformationService transformationService) {
        this.restTemplateService = restTemplateService;
        this.transformationService = transformationService;
    }

    @GetMapping("/api/data")
    public @ResponseBody List<String> getTransformedData() {
        JsonNode jsonNode = restTemplateService.fetchData();
        log.info("getTransformedData method :: Fetched JSON Data::");
        return transformationService.extractTitles(jsonNode);
    }
}