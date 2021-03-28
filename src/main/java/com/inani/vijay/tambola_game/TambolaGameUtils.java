package com.inani.vijay.tambola_game;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

import static com.inani.vijay.tambola_game.TambolaGameConstants.*;

public class TambolaGameUtils {

    public static List<String> loadInputWords() throws IOException {
        return Files.readAllLines(Paths.get(TAMBOLA_INPUT));
    }

    public static Map<String, String> generateEnglishToHindiMap(List<String> words) {
        return words.stream().map(element -> element.split(SPLITTER)).collect(Collectors.toMap(element -> element[0], element -> element[1], (e, f) -> e));
    }

    public static List<String> selectRandomWords(List<String> wordsList) {
        Random random = new Random();
        Collections.shuffle(wordsList);
        List<String> currentWords = new ArrayList<>(NO_OF_ELEMENTS_TO_BE_SELECTED);
        for (int i = 0; i < NO_OF_ELEMENTS_TO_BE_SELECTED; i++) {
            String word = wordsList.get(random.nextInt(wordsList.size() - 1));
            currentWords.add(word);
            wordsList.remove(word);
        }
        Collections.sort(currentWords);
        return currentWords;
    }

    public static List<String> copyWords(Set<String> words) {
        return new ArrayList<>(words);
    }
}
