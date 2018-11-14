package com.george.dev.jokeappapi.controller;

import com.george.dev.jokeappapi.service.JokeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
public class JokeApiController {

    private JokeService jokeService;

    public JokeApiController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/joke")
    public Map getJoke(){
        return Collections.singletonMap("joke", jokeService.getJoke());
    }
}