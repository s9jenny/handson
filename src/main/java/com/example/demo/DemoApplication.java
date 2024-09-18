package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/carles")
    public String carles(@RequestParam(value = "name", defaultValue = "carles") String name) {
        return "<html>" +
                "<head>" +
                "<style>" +
                "body { font-family: Arial, sans-serif; background-color: #f4f4f4; padding: 20px; }" +
                "h1 { color: #4CAF50; }" +
                "p { font-size: 18px; }" +
                ".message { background-color: #e7f3fe; border-left: 6px solid #2196F3; padding: 10px; }" +
                "</style>" +
                "</head>" +
                "<body>" +
                "<h1>Hello, " + name + "!</h1>" +
                "<p class='message'>Good job so far from Carles. Keep up the spirit, you're doing great!</p>" +
                "</body>" +
                "</html>";
    }
}
