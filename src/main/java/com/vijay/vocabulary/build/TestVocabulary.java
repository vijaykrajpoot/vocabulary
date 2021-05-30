package com.vijay.vocabulary.build;

import com.vijay.vocabulary.builder.BusinessVocabularyBuilder;
import com.vijay.vocabulary.Vocabulary;
import com.vijay.vocabulary.VocabularyBuilder;
import com.vijay.vocabulary.Word;
import com.vijay.vocabulary.builder.reader.VocabularyFileReader;
import com.vijay.vocabulary.builder.reader.VocabularyReader;

import java.util.List;

public class TestVocabulary {

    public static void main(String[] args) {
        VocabularyReader vocabularyReader = new VocabularyFileReader();
        VocabularyBuilder vocabularyBuilder = new BusinessVocabularyBuilder(vocabularyReader);
        Vocabulary vocabulary = vocabularyBuilder.build();
        List<Word> words = vocabulary.getWords();
        System.out.println("words:" + words);
    }
}
