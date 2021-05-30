package com.vijay.vocabulary.builder;

import com.vijay.vocabulary.BusinessVocabulary;
import com.vijay.vocabulary.Vocabulary;
import com.vijay.vocabulary.VocabularyBuilder;
import com.vijay.vocabulary.Word;
import com.vijay.vocabulary.builder.reader.VocabularyReader;

public class BusinessVocabularyBuilder extends VocabularyBuilder {
    private VocabularyReader vocabularyReader;

    public BusinessVocabularyBuilder(VocabularyReader vocabularyReader) {
        this.vocabularyReader = vocabularyReader;
    }

    @Override
    protected Vocabulary prepare() {
        BusinessVocabulary vocabulary = new BusinessVocabulary();
        Word word = new Word()
                .word("hi")
                .meaning("say hi")
                .sentence("Hi how are you");
        vocabulary.addWord(word);
        return vocabulary;
    }
}
