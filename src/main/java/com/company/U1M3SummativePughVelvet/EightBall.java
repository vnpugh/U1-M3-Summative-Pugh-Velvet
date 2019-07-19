package com.company.U1M3SummativePughVelvet;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EightBall {
    private String question;
    private String response;

    public EightBall() { //Empty constructor
    }

    public EightBall(String question, String response) {
        this.question = question;
        this.response = response;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}










