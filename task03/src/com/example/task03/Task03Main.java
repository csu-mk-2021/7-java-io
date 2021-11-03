package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.io.*;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
        */
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        ByteArrayOutputStream byte_array = new ByteArrayOutputStream();
        byte[] bytes = new byte[500];
        int count = 0;

        if (inputStream == null || charset == null){
            throw new IllegalArgumentException("Null argument value");
        }

        while ((count = inputStream.read(bytes)) != -1) {
            byte_array.write(bytes, 0, count);
        }
        return new String(byte_array.toByteArray(), charset);
    }
}
