package com.vijay.vocabulary;

public abstract class VocabularyBuilder {

    public Vocabulary build() {
        return prepare();
    }

    abstract protected Vocabulary prepare();

}
