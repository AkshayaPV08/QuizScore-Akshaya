package com.example.quizScore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quizScore.model.score;
import com.example.quizScore.repository.scoreRepo;

@Service
public class scoreService {
    @Autowired
    private scoreRepo scoreRepository;

    public score saveScore(score Score){
        return scoreRepository.save(Score);
    }
    


    
}
