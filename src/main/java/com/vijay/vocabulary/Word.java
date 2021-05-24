package com.vijay.vocabulary;

/**
 * @author vkumar1 created on 5/23/21
 */
public class Word implements Comparable<Word> {
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

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                ", meaning='" + meaning + '\'' +
                ", sentence='" + sentence + '\'' +
                '}';
    }


    @Override
    public int compareTo(Word s) {
        return this.word.compareTo(s.word);
    }
}
