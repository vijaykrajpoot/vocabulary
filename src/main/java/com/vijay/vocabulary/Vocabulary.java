package com.vijay.vocabulary;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author vkumar1 created on 5/23/21
 */
public class Vocabulary {

    public static void main(String[] args) {
        Vocabulary vocabulary = new Vocabulary();

        List<Word> words = vocabulary.readFile("words.txt");
        System.out.println(words);

    }


    private List<Word> readFile(String fileName) {
        List<Word> words = new LinkedList<>();
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {


        } catch (Exception ex) {
            System.out.println(ex);
        }
        return words;
    }
}
