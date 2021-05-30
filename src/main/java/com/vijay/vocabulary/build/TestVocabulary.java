package com.vijay.vocabulary.build;

import com.vijay.vocabulary.BusinessVocabularyBuilder;
import com.vijay.vocabulary.Vocabulary;
import com.vijay.vocabulary.VocabularyBuilder;
import com.vijay.vocabulary.Word;

import java.util.List;

public class TestVocabulary {

    public static void main(String[] args) {
        VocabularyBuilder vocabularyBuilder = new BusinessVocabularyBuilder();
        Vocabulary vocabulary = vocabularyBuilder.build();
        List<Word> words = vocabulary.getWords();
        System.out.println("words:" + words);
    }
}
