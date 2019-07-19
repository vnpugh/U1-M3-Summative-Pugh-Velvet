package com.company.U1M3SummativePughVelvet;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Quote {
    private String quote;
    private String author;

public Quote(){}

public Quote (String quote, String author) {
    this.author=author;
    this.quote=quote;
}
    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}


//requesmap value = method
//list x = random.naigiclist.nextint(magiclist.size)