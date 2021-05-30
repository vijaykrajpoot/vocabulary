package com.vijay.vocabulary.build;

import com.vijay.vocabulary.builder.BusinessVocabularyBuilder;
import com.vijay.vocabulary.Vocabulary;
import com.vijay.vocabulary.VocabularyBuilder;
import com.vijay.vocabulary.Word;
import com.vijay.vocabulary.builder.reader.VocabularyFileReader;
import com.vijay.vocabulary.builder.reader.VocabularyReader;

import java.io.InputStream;
import java.util.List;

public class TestVocabulary {

    public static void main(String[] args) {
        InputStream inputStream = getFileFromResourceAsStream("words.txt");
        VocabularyReader vocabularyReader = new VocabularyFileReader(inputStream);
        VocabularyBuilder vocabularyBuilder = new BusinessVocabularyBuilder(vocabularyReader);
        Vocabulary vocabulary = vocabularyBuilder.build();
        List<Word> words = vocabulary.getWords();
        words.forEach(word -> {
            System.out.println("---------------------------------------------------------");
            System.out.println("Word        : " + word.getWord());
            System.out.println("Meaning     : " + word.getMeaning());
            if (word.getSentence() != null)
                System.out.println("Sentence    : " + word.getSentence());
        });
    }

    // get a file from the resources folder
    // works everywhere, IDEA, unit test and JAR file.
    private static InputStream getFileFromResourceAsStream(String fileName) {

        // The class loader that loaded the class
        ClassLoader classLoader = TestVocabulary.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(fileName);

        // the stream holding the file content
        if (inputStream == null) {
            throw new IllegalArgumentException("file not found! " + fileName);
        } else {
            return inputStream;
        }

    }
}
