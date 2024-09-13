package com.csc340HW2.HW2_api;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class controllerClass {


   @GetMapping("/hello")
   public String hello() {
           return "Hello! ";
           //for testing purposes
       //this works!
   }


   @GetMapping("/joke")
   public Jokes getJoke() throws JsonProcessingException {
      // Jokes jk = new Jokes();//create object
       String url = "https://official-joke-api.appspot.com/random_joke";//api
       RestTemplate restTemplate = new RestTemplate();
       ObjectMapper objectMapper = new ObjectMapper();

        //THIS API WILL RETURN RANDOM JOKES
       String jsonRespon = restTemplate.getForObject(url, String.class);
       JsonNode root = objectMapper.readTree(jsonRespon);
       Jokes jk = new Jokes(root.get("setup").asText(), root.get("punchline").asText(),
               root.get("type").asText(), root.get("id").asInt());

       return jk;

   }

}
