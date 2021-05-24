package com.vijay.vocabulary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * @author vkumar1 created on 5/23/21
 */
public class Vocabulary {

    public static void main(String[] args) {
        Vocabulary vocabulary = new Vocabulary();
        InputStream inputStream = vocabulary.getFileFromResourceAsStream("words.txt");
        List<Word> words = vocabulary.readFile(inputStream);
        words.forEach(word -> {
            System.out.println("---------------------------------------------------------");
            System.out.println("Word        : " + word.getWord());
            System.out.println("Meaning     : " + word.getMeaning());
            if (word.getSentence() != null)
                System.out.println("Sentence    : " + word.getSentence());
        });
    }


    private List<Word> readFile(InputStream inputStream) {
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


    // get a file from the resources folder
    // works everywhere, IDEA, unit test and JAR file.
    private InputStream getFileFromResourceAsStream(String fileName) {

        // The class loader that loaded the class
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(fileName);

        // the stream holding the file content
        if (inputStream == null) {
            throw new IllegalArgumentException("file not found! " + fileName);
        } else {
            return inputStream;
        }

    }
}
