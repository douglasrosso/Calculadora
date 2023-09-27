package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class Senha {

    private static final String MINUSCULOS = "abcdefghijklmnopqrstuvwxyz";
    private static final String MAIUSCULOS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMEROS = "0123456789";
    private static final String SIMBOLOS = "!@#$%&*()_+-=[]|,./?><";

    public String generate(int length, boolean minusculos, boolean maiusculos, boolean numeros, boolean simbolos) {
        if (length <= 0) {
            return "";
        }

        StringBuilder password = new StringBuilder(length);
        Random random = new Random(System.nanoTime());

        List<String> charCategories = new ArrayList<String>(4);
        if (minusculos) {
            charCategories.add(MINUSCULOS);
        }
        if (maiusculos) {
            charCategories.add(MAIUSCULOS);
        }
        if (numeros) {
            charCategories.add(NUMEROS);
        }
        if (simbolos) {
            charCategories.add(SIMBOLOS);
        }

        for (int i = 0; i < length; i++) {
            String charCategory = charCategories.get(random.nextInt(charCategories.size()));
            int position = random.nextInt(charCategory.length());
            password.append(charCategory.charAt(position));
        }
        return new String(password);
    }
}