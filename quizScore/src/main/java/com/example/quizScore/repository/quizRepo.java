package com.example.quizScore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.quizScore.model.quiz;
@Repository

public interface quizRepo  extends JpaRepository<quiz,Long>{
    
}
