package com.tingyun.asmtest.test;

import org.objectweb.asm.ClassReader;

import java.io.IOException;

/**
 * Created by spark on 17-7-19.
 */
public class ClassPrinterTest {

    public static void main(String args[]) throws IOException {
        ClassReader classReader = new ClassReader("java.lang.Runnable");
        ClassPrinter cp = new ClassPrinter();
        classReader.accept(cp, 0);
    }
}
