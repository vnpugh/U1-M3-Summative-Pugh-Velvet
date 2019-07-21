package com.company.U1M3SummativePughVelvet;
import com.sun.org.apache.xpath.internal.operations.Quo;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class Controller {
    private List<Quote> Quote;
    private List<EightBall> EightBall;
    private List<Word> Word;

public Controller() {
        Quote = new ArrayList<>();
    Quote.add(new Quote("Keep your friends close, but your enemies closer.","Michael Corleone" ));
    Quote.add(new Quote("As if!","Cher Horowitz" ));
    Quote.add(new Quote("Did Doogie Houser just steal my car?","Harold Lee" ));
    Quote.add(new Quote("As my plastic surgeon always said, if you gotta go, go with a smile.","The Joker" ));
    Quote.add(new Quote("It’s not a man purse. It’s called a satchel. Indiana Jones wears one.","Alan Garner "));
    Quote.add(new Quote("I’m in a glass case of emotion!","Ron Burgundy" ));
    Quote.add(new Quote("No wire hangers, ever!","Mommie Dearest" ));
    Quote.add(new Quote("Nobody puts Baby in a corner.","Johnny Castle" ));
    Quote.add(new Quote("I am serious. And don’t call me Shirley.","Dr. Rumack" ));
    Quote.add(new Quote("There's no crying in baseball!","Jimmy Dugan" ));

    EightBall = new ArrayList<>();
    EightBall.add(new EightBall(null, "Never in a billion years!"));
    EightBall.add(new EightBall(null, "Don't count on it!"));
    EightBall.add(new EightBall(null, "Reply hazy, try again later."));
    EightBall.add(new EightBall(null, "All signs point to Yes!"));
    EightBall.add(new EightBall(null, "My sources say No."));
    EightBall.add(new EightBall(null, "Without a doubt."));

    Word = new ArrayList<>();
    Word.add(new Word("Elucidate", "To explain or make something clear."));
    Word.add(new Word("Malaise", "Physical discomfort or a general feeling of being under the weather."));
    Word.add(new Word("Obfuscate", "To confuse someone."));
    Word.add(new Word("Perfunctory", "Something done without much care or attention."));
    Word.add(new Word("Quid Pro Quo", "Giving something in exchange for getting something."));
    Word.add(new Word("Scintillating", "Something fascinating or brilliantly clever."));
    Word.add(new Word("Sycophant", "A person who tries to gain attention by flattering powerful people."));
    Word.add(new Word("Accolade", "A tangible symbol signifying approval or distinction."));
    Word.add(new Word("Brogue", "A thick and heavy shoe."));
    Word.add(new Word("Cacophony", "Loud, confusing, disagreeable sounds."));

}

                            //URI
    @RequestMapping(value="/magic", method=RequestMethod.POST)
    public EightBall EightBall(@RequestBody @Valid String question) {
        Random random = new Random();
        int x = random.nextInt(EightBall.size());
        this.EightBall.get(x).getResponse();
        this.EightBall.get(x).setQuestion(question);
        return this.EightBall.get(x);

}

        @RequestMapping(value="/quote", method=RequestMethod.GET)
        public Quote Quote(@RequestBody String quote) {
            Random Random = new Random();
            int x = Random.nextInt(Quote.size());
            this.Quote.get(x).getQuote();
            return this.Quote.get(x);

        }

    @RequestMapping(value="/word", method=RequestMethod.GET)
    public Word Word(@RequestBody String word) {
        Random Random = new Random();
        int x = Random.nextInt(Word.size());
        this.Word.get(x).getWord();
        return this.Word.get(x);

    }
    }


