package com.company.U1M3SummativePughVelvet;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Word {
    private String word;
    private String definition;

    public Word(){}

    public Word (String word, String definition){
        this.word=word;
        this.definition=definition;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}
