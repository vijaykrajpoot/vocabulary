package com.vijay.vocabulary.builder.reader;

import com.vijay.vocabulary.Word;

import java.io.InputStream;
import java.util.List;

public interface VocabularyReader {
    List<Word> read();
}
