package com.prince.QuizApp.service;

//import com.prince.QuizApp.entity.Question;
import com.prince.QuizApp.entity.QuizQuestion;
import com.prince.QuizApp.repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepo questionRepo;

   public List<QuizQuestion> getAllQuestions(){
       List<QuizQuestion> all = questionRepo.findAll();
        return all;
       //return Arrays.asList(new Question("What is default value of boolean value in java",new String[]{"true","false","null","0"}, "false"));
   }

    public QuizQuestion saveQuestion(QuizQuestion question){
        QuizQuestion sav = questionRepo.save(question);
        return sav;
    }

}
