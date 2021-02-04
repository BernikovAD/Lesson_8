package com.bernikov;

import java.io.*;
import java.util.Random;

public class Main {
    public static String text = "12314125tgdfgdfg343434gdfgdfxvthdfhdfhdfhjHelloS23234235dsfs3232323fsd234234";
    public static String text1 = "Hello World I am Sasha I am a beginner android developer I am learning java languague in geekbrains";
    static String textName1 = "text1.txt";
    static String textName2 = "text2.txt";
    static String textName3 = "text3.txt";

    public static void main(String[] args) {
        writeFile ();
        readAndWriteInNewFile (textName1);
        readAndWriteInNewFile (textName2);
    }

    public static void writeFile() {
        try (FileOutputStream fos = new FileOutputStream (textName1);
             PrintStream printStream = new PrintStream (fos)) {
            printStream.println (text);
        } catch (IOException ex) {
            System.out.println (ex.getMessage ());
        }
        try (FileOutputStream fos = new FileOutputStream (textName2);
             PrintStream printStream = new PrintStream (fos)) {
            printStream.println (text1);
        } catch (IOException ex) {
            System.out.println (ex.getMessage ());
        }
    }

    public static void readAndWriteInNewFile(String name) {
        try (FileInputStream fin = new FileInputStream (name);
             FileOutputStream fos = new FileOutputStream (textName3,true)) {
            byte[] buffer = new byte[fin.available()];
            fin.read(buffer, 0, buffer.length);
            fos.write(buffer, 0, buffer.length);
        } catch (IOException e) {
            System.out.println (e.getMessage ());
        }
    }
}

