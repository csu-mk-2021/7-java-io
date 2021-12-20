package com.example.task02;

import java.io.IOException;
import java.io.InputStream;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        InputStream is = System.in;
        int b_number = is.read();
        int number;
        while (b_number > 0) {
            number = is.read();
            if (b_number != 13 || number != 10)
                System.out.write(b_number);
            b_number = number;
        }
        System.out.flush();
    }
}
