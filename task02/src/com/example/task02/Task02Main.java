package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        WinStrToUnixStr();
    }

    public static void WinStrToUnixStr() throws IOException {


        int current_symb = System.in.read();


        while (current_symb != -1) {

            int next_symb = System.in.read();

            if (next_symb == -1) {
                System.out.write(current_symb);
            } else if (current_symb == 13 && next_symb == 10) {
                System.out.write(next_symb);
                next_symb = System.in.read();
            } else {
                System.out.write(current_symb);
            }

            current_symb = next_symb;

        }

        System.out.flush();

    }
}
