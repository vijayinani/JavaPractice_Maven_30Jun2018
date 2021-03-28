package com.inani.vijay.tambola_game;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static com.inani.vijay.tambola_game.TambolaGameConstants.*;
import static com.inani.vijay.tambola_game.TambolaGameUtils.copyWords;
import static com.inani.vijay.tambola_game.TambolaGameUtils.selectRandomWords;

public class TambolaGeneratorImpl implements TambolaGenerator {
    private int counter = 0;
    private Map<String, String> englishToHindiMap;

    public TambolaGeneratorImpl(Map<String, String> englishToHindiMap) {
        this.englishToHindiMap = englishToHindiMap;
    }

    private void tambolaStringGenerator(List<String> finalWords, StringBuilder stringBuilder) {
        Iterator<String> iterator = finalWords.iterator();
        for (int i = 0; i < ROWS; i++) {
            List<String> hindiWords = new ArrayList<>(COLUMNS);
            for (int j = 0; j < COLUMNS; j++) {
                String word = iterator.next();
                hindiWords.add(englishToHindiMap.get(word));
                stringBuilder.append(word).append(COMMA);
            }
            stringBuilder.append(NEW_LINE);
            hindiWords.forEach(word -> stringBuilder.append(word).append(COMMA));
            stringBuilder.append(NEW_LINE).append(NEW_LINE);
        }
    }

    @Override
    public void generateTambolaGame() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(TAMBOLA_OUTPUT));
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < NO_OF_SHEETS; i++) {
            List<String> finalWords = selectRandomWords(copyWords(englishToHindiMap.keySet()));
            stringBuilder = writeTambola(finalWords, stringBuilder);
        }
        bufferedWriter.write(stringBuilder.toString());
        bufferedWriter.close();
    }

    private StringBuilder writeTambola(List<String> finalWords, StringBuilder stringBuilder) throws IOException {
        tambolaStringGenerator(finalWords, stringBuilder);
        counter++;
        if (counter % 5 != 0) {
            stringBuilder.append(SEPARATOR).append(NEW_LINE);
        } else {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        return stringBuilder;
    }
}
