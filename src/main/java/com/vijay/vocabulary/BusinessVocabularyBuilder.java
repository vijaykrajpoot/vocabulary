package com.vijay.vocabulary;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BusinessVocabularyBuilder extends VocabularyBuilder {
    @Override
    protected Vocabulary prepare() {
        BusinessVocabulary vocabulary = new BusinessVocabulary();
        Word word = new Word().word("hi").meaning("say hi").sentence("Hi how are you");
        vocabulary.addWord(word);
        return vocabulary;
    }
}
