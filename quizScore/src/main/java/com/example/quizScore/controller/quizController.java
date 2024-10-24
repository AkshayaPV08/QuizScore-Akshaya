package com.example.quizScore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.quizScore.model.quiz;
import com.example.quizScore.service.quizService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;




@RestController
@RequestMapping("/quiz")
@CrossOrigin(origins = "http://localhost:3000")

public class quizController {
    @Autowired
    private quizService QuizService;

    @PostMapping("/create")
    public quiz createQuiz(@RequestBody quiz Quiz){
        return QuizService.createQuiz(Quiz);
    }
    @GetMapping("/get")
    public List<quiz> getQuizList(){
        return QuizService.getQuizzes();
    }
    


    
    
}
