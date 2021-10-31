package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

import java.io.*;//для работы со всем вводом/выводом

public class Task03Main {
    public static void main(String[] args) throws IOException {
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if (inputStream == null || charset == null){
            throw new IllegalArgumentException("some of argument is NULL");
        }
        ByteArrayOutputStream bytes_mass = new ByteArrayOutputStream(); //поток байтов, записываемые в буфер для чтения и записи
        byte[] bytes = new byte[500];
        int count;
        while ((count = inputStream.read(bytes)) != -1) {
            bytes_mass.write(bytes, 0, count);//(byte[] array, int start, int limit)
        }
        return new String(bytes_mass.toByteArray(), charset); //charset - выбор кодировки

    }
}
