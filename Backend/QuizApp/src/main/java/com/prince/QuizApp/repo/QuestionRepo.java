package com.prince.QuizApp.repo;

//import com.prince.QuizApp.entity.Question;
import com.prince.QuizApp.entity.QuizQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepo extends JpaRepository<QuizQuestion,Long> {
}
