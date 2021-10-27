package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        strToUnix();
    }

    public static void strToUnix() throws IOException {
        int cur = System.in.read();
        while (cur != -1) {
            int next = System.in.read();
            if (next == -1) {
                System.out.write(cur);
            } else if (cur == 13 && next == 10) {
                System.out.write(next);
                next = System.in.read();
            } else {
                System.out.write(cur);
            }
            cur = next;
        }
        System.out.flush();
    }
}