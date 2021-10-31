package com.example.task04;

import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900

        System.out.println("0.0");
        SumOfDubles();
    }

    public static void SumOfDubles() {
        Scanner scan = new Scanner(System.in);
        double result = 0;

        while (scan.hasNext()) {
            String buff = scan.next();
            try {
                result += Double.parseDouble(buff);
            } catch (Exception exept) {
            }
        }
        System.out.printf(Locale.ENGLISH, "%.6f", result);
    }
}
