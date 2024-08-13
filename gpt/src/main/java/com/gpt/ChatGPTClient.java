package com.gpt;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ChatGPTClient {

    private static final String API_KEY = "e1ba5f5dcd7f4bc199810dd01002d33d"; // Reemplaza con tu API key
    private static final String API_URL = "https://api.aimlapi.com/chat/completions";

    public static void main(String[] args) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            ObjectMapper objectMapper = new ObjectMapper();

            // Construir el cuerpo de la solicitud
            Map<String, Object> requestBody = Map.of(
                "model", "mistralai/Mistral-7B-Instruct-v0.2",
                "messages", List.of(
                    Map.of("role", "system", "content", "You are a travel agent. Be descriptive and helpful"),
                    Map.of("role", "user", "content", "Tell me about San Francisco")
                ),
                "temperature", 0.7,
                "max_tokens", 128
            );

            String requestBodyJson = objectMapper.writeValueAsString(requestBody);

            HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(API_URL))
                .header("Authorization", "Bearer " + API_KEY)
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(requestBodyJson))
                .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Manejo de la respuesta
            ObjectMapper responseMapper = new ObjectMapper();
            Map<String, Object> responseBody = responseMapper.readValue(response.body(), Map.class);
            List<Map<String, Object>> choices = (List<Map<String, Object>>) responseBody.get("choices");
            String responseMessage = (String) ((Map<String, Object>) choices.get(0).get("message")).get("content");

            System.out.println("AI/ML API:\n" + responseMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
