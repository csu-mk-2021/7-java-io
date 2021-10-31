package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test

        //создание массива байтов длинны потока(in - поток, avalible - количество чисел, которое можно считать)
        byte[] bytes = new byte[System.in.available()];
        System.in.read(bytes);
        System.out.append(new String(bytes).replaceAll("\r\n","\n"));
    }
}
