package com.example.quizScore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.quizScore.model.score;
@Repository

public interface scoreRepo extends JpaRepository<score,Long>{


    
} 