package com.demo.unitTests;

import com.demo.service.RestTemplateService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class RestTemplateServiceTest {

    @Mock
    private RestTemplate restTemplate;
    private ObjectMapper objectMapper = new ObjectMapper();
    private final String mockApiUrl = "https://jsonplaceholder.typicode.com/posts";
    @InjectMocks
    private RestTemplateService restTemplateService;

    @Test
    void testFetchData() throws Exception {
        String jsonResponse = "[{" +
                "    \"userId\": 1," +
                "    \"id\": 1," +
                "    \"title\": \"sunt aut facere repellat provident occaecati excepturi optio reprehenderit\"," +
                "    \"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"" +
                "  }]";

        when(restTemplate.getForObject(mockApiUrl, String.class)).thenReturn(jsonResponse);

        RestTemplateService restTemplateService1 = new RestTemplateService(restTemplate, objectMapper, mockApiUrl);
        JsonNode result = restTemplateService1.fetchData();

        assertNotNull(result);
        assertEquals("sunt aut facere repellat provident occaecati excepturi optio reprehenderit", result.get(0).get("title").asText());
        // verify(objectMapper).readTree(jsonResponse);
    }
}
