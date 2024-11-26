//package com.prince.QuizApp.entity;
//
//import jakarta.persistence.*;
//
//import java.util.List;
//
//@Entity
//public class Question {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long questionId;
//
//    private String questionText;
//
//    private String correctAnswer;
//
//    @OneToMany(mappedBy = "question",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//    private List<Options> options;
//
//    public Long getId() {
//        return questionId;
//    }
//
//    public void setId(Long id) {
//        this.questionId = id;
//    }
//
//    public String getQuestionText() {
//        return questionText;
//    }
//
//    public void setQuestionText(String questionText) {
//        this.questionText = questionText;
//    }
//
//    public String getCorrectAnswer() {
//        return correctAnswer;
//    }
//
//    public void setCorrectAnswer(String correctAnswer) {
//        this.correctAnswer = correctAnswer;
//    }
//
//    public List<Options> getOptions() {
//        return options;
//    }
//
//    public void setOptions(List<Options> options) {
//        this.options = options;
//    }
//}
