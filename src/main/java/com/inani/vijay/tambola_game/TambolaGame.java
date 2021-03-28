package com.inani.vijay.tambola_game;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static com.inani.vijay.tambola_game.TambolaGameUtils.generateEnglishToHindiMap;
import static com.inani.vijay.tambola_game.TambolaGameUtils.loadInputWords;

public class TambolaGame {
    public static void main(String[] args) throws Exception {
        generateTambola();
    }

    private static void generateTambola() throws IOException {
        List<String> words = loadInputWords();
        Map<String, String> englishToHindiMap = generateEnglishToHindiMap(words);
        TambolaGenerator tambolaGenerator = new TambolaGeneratorImpl(englishToHindiMap);
        tambolaGenerator.generateTambolaGame();
    }
}
