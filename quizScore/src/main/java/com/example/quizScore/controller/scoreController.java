package com.example.quizScore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.quizScore.model.score;
import com.example.quizScore.service.scoreService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/quizScore")

@CrossOrigin("http://localhost:3000")

public class scoreController {
    @Autowired
    private scoreService scoreServices;

@PostMapping("/score")
public score postScore(@RequestBody score Score){
    return scoreServices.saveScore(Score);
}


   


    
}
