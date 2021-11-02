package com.example.task03;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:


        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if (inputStream == null || charset == null){
            throw new IllegalArgumentException("NULL");
        }
        ByteArrayOutputStream bytes_mass = new ByteArrayOutputStream();
        byte[] bytes = new byte[500];
        int count;
        while ((count = inputStream.read(bytes)) != -1) {
            bytes_mass.write(bytes, 0, count);
        }
        return new String(bytes_mass.toByteArray(), charset);
    }
}
