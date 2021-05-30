package com.vijay.vocabulary;

import java.util.List;

public abstract class VocabularyBuilder {

    public Vocabulary build() {
        return prepare();
    }

    abstract protected Vocabulary prepare();

}
