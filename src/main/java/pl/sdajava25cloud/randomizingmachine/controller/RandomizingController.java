package pl.sdajava25cloud.randomizingmachine.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomizingController {

    @Value("${random.words")
    private String[] words;

    @Value("${random.numbers")
    private String[] numbers;


    // wylosuj słowo

    @GetMapping("/word")
    public String randomWord(){

    }


    //wylosuj liczbę

    @GetMapping("/number")
    public String randomWord(){

    }
}
