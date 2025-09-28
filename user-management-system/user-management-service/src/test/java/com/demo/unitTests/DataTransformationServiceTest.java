package com.demo.unitTests;

import com.demo.util.converter.DataTransformationService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
class DataTransformationServiceTest {

    private final DataTransformationService service = new DataTransformationService();

    @Test
    void testExtractTitles() throws Exception {
        String jsonResponse = "[{" +
                "    \"userId\": 1," +
                "    \"id\": 1," +
                "    \"title\": \"sunt aut facere repellat provident occaecati excepturi optio reprehenderit\"," +
                "    \"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"" +
                "  }]";
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode mockJson = objectMapper.readTree(jsonResponse);

        List<String> titles = service.extractTitles(mockJson);

        assertEquals(1, titles.size());
        assertEquals("sunt aut facere repellat provident occaecati excepturi optio reprehenderit", titles.get(0));

    }
}