package com.example.task04;

import java.io.IOException;
import java.util.Locale;

public class Task04Main {
    public static void main(String[] args) throws IOException {

        if (System.in == null) {
            throw new IllegalArgumentException();
        }

        double result = 0;
        StringBuilder stringBuilder = new StringBuilder();

        for (int c = System.in.available(); c > -1; c--) {
            char current = (char) System.in.read();
            if (current == ' ' || current == '\n' || c == 0) {
                try {
                    result += Double.parseDouble(stringBuilder.toString());
                } catch (NumberFormatException e) {

                }
                stringBuilder.setLength(0);
            } else {
                stringBuilder.append(current);
            }
        }
        System.out.format(Locale.US, "%.6f", result);
    }
}
