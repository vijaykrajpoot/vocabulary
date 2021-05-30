package com.vijay.vocabulary;

/**
 * @author vkumar1 created on 5/23/21
 */
public class Word {
    String word;
    String meaning;
    String sentence;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public Word word(String word){
        this.word=word;
        return this;
    }

    public Word sentence(String sentence){
        this.sentence=sentence;
        return this;
    }
    public Word meaning(String meaning){
        this.meaning=meaning;
        return this;
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                ", meaning='" + meaning + '\'' +
                ", sentence='" + sentence + '\'' +
                '}';
    }
}
