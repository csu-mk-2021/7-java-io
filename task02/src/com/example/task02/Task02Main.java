package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        WindowsStringToUnix();
    }
    public static void WindowsStringToUnix() throws IOException {
        int current_buffer = System.in.read();
        int next = 0;


        while (current_buffer != -1){
            next = System.in.read();
            if(next == -1){
                System.out.write(current_buffer);
            }
            else if (current_buffer == 13 && next == 10){
                System.out.write(next);
                next = System.in.read();
            } else {
                System.out.write(current_buffer);
            }
            current_buffer = next;
        }
        System.out.flush();
    }
}
