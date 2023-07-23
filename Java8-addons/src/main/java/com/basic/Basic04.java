package com.basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Basic04 {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("C:\\MyPortfolio\\Java8-addons\\target\\classes\\com\\basic\\file.txt");
        BufferedReader br = new BufferedReader(fr);

        char[] c = new char[20];

        // illustrating markSuported() method
        if(br.markSupported()){
            System.out.println("mark() method is supported");

            br.mark(100);
        }

        br.skip(8);

        if(br.ready()){
            System.out.println(br.readLine());
            br.read(c);

            for (int i = 0; i < 20 ; i++) {
                System.out.print(c[i]);
            }

            System.out.println();

            br.reset();
            for (int i = 0; i < 8; i++) {
                System.out.print((char) br.read());
            }
        }

    }
}
