package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {
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
