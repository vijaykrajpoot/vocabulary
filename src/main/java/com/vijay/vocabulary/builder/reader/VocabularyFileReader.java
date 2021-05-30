package com.vijay.vocabulary.builder.reader;

import com.vijay.vocabulary.Word;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class VocabularyFileReader implements VocabularyReader {
    private InputStream inputStream;

    public VocabularyFileReader(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public List<Word> read() {
        List<Word> words = new LinkedList<>();
        try (InputStreamReader inputStreamReader =
                     new InputStreamReader(inputStream, "UTF-8");
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            String line = null;
            Word word = null;
            boolean newWord = false;
            int lineNo = 0;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.contains(" ")) {
                    lineNo = 1;
                    if (word != null) {
                        words.add(word);
                    }
                    word = new Word();
                    word.setWord(line);
                } else if (lineNo == 1) {
                    word.setMeaning(line);
                    lineNo = 2;
                } else if (lineNo == 2) {
                    word.setSentence(line);
                    lineNo = 2;
                }
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return words;
    }
}
