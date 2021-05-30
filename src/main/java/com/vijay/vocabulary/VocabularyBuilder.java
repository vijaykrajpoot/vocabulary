package com.vijay.vocabulary;

import java.util.List;

public abstract class VocabularyBuilder {

    public List<Word> build() {
        return prepare();
    }

    abstract protected List<Word> prepare();

}
