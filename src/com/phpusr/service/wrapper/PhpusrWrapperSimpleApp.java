package com.phpusr.service.wrapper;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * @author phpusr
 * Date: 07.06.13
 * Time: 16:37
 */
public class PhpusrWrapperSimpleApp {
    public static void main(String[] args) {
        try {
            System.out.println(">>begin...");
            FileWriter f = new FileWriter("PhpusrService.txt", true);
            PrintWriter out = new PrintWriter(f);
            out.println(new Date()+": test");
            out.close();
            System.out.println(">>end...");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void stop() {
        System.out.println(">>Program stop...");
    }
}
