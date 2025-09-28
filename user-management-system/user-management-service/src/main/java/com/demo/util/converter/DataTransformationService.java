package com.demo.util.converter;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataTransformationService {

    public List<String> extractTitles(JsonNode jsonNode) {
        List<String> titles = new ArrayList<>();
        if(jsonNode.isArray()) {
            for (int i = 0; i < jsonNode.size(); i++) {
                titles.add(jsonNode.get(i).get("title").textValue());
            }
        }
        return titles;
    }
}