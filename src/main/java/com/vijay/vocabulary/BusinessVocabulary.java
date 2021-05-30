package com.vijay.vocabulary;

import java.util.LinkedList;
import java.util.List;

public class BusinessVocabulary implements Vocabulary {

    private List<Word> words = new LinkedList<>();


   public BusinessVocabulary addWord(Word word) {
        words.add(word);
        return this;
    }

    @Override
    public List<Word> getWords() {
        return words;
    }
}
