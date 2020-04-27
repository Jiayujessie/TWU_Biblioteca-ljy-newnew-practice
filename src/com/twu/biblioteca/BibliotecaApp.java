package com.twu.biblioteca;

import java.io.PrintStream;

public class BibliotecaApp {

    private PrintStream printStream;

    public BibliotecaApp(PrintStream printStream) {
        this.printStream = printStream;
    }

    public static void main(String[] args) {

        new BibliotecaApp( System.out ).seeWelcome();


    }

    public void seeWelcome() {

        printStream.println("Welcome to Biblioteca. You one-stop-one for great book titles in Bangalore!");

    }
}
