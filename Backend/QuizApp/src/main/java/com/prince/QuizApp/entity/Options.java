//package com.prince.QuizApp.entity;
//
//import jakarta.persistence.*;
//
//import java.util.List;
//
//@Entity
//public class Options {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long optionId;
//
//    private String optionText;
//    @ManyToOne
//    @JoinColumn(name ="question_id",nullable = true)
//   private Question question;
//
//    public Long getOptionId() {
//        return optionId;
//    }
//
//    public void setOptionId(Long optionId) {
//        this.optionId = optionId;
//    }
//
//    public String getOptionText() {
//        return optionText;
//    }
//
//    public void setOptionText(String optionText) {
//        this.optionText = optionText;
//    }
//
//    public Question getQuestion() {
//        return question;
//    }
//
//    public void setQuestion(Question question) {
//        this.question = question;
//    }
//}
