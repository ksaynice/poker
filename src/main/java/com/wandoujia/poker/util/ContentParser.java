package com.wandoujia.poker.util;

import java.util.regex.Pattern;

import com.sun.tools.javac.util.Pair;

/**
 * @author chentian
 */
public class ContentParser {
    private static final Pattern PLAYER_PATTERN = Pattern.compile("\\s+");

    public static Pair<String, Double> getPlayerInfo(String line) {
        String[] items = PLAYER_PATTERN.split(line.trim());
        if (items.length != 2) {
            return null;
        }
        try {
            return new Pair<String, Double>(items[0].trim(), Double.valueOf(items[1]));
        } catch (NumberFormatException e) {
            return null;
        }
    }
}