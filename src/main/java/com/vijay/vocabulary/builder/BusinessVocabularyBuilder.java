package com.vijay.vocabulary.builder;

import com.vijay.vocabulary.BusinessVocabulary;
import com.vijay.vocabulary.Vocabulary;
import com.vijay.vocabulary.VocabularyBuilder;
import com.vijay.vocabulary.Word;
import com.vijay.vocabulary.builder.reader.VocabularyReader;

import java.util.List;

public class BusinessVocabularyBuilder extends VocabularyBuilder {
    private VocabularyReader vocabularyReader;

    public BusinessVocabularyBuilder(VocabularyReader vocabularyReader) {
        this.vocabularyReader = vocabularyReader;
    }

    @Override
    protected Vocabulary prepare() {
        BusinessVocabulary vocabulary = new BusinessVocabulary();
        List<Word> words=vocabularyReader.read();
        vocabulary.setWords(words);
        return vocabulary;
    }
}
