package com.example.quizScore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quizScore.model.quiz;
import com.example.quizScore.repository.quizRepo;

@Service

public class quizService {


    @Autowired
    private quizRepo QuizRepo;


    public quiz createQuiz( quiz Quiz){
        return QuizRepo.save(Quiz);
    }

    public List<quiz> getQuizzes(){
        return QuizRepo.findAll();
    }


}
