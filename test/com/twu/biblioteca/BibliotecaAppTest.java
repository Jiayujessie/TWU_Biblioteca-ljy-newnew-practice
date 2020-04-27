package com.twu.biblioteca;


import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

    @Test
    public void see_welcome_message_when_start_app() {

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BibliotecaApp bibliotecaApp = new BibliotecaApp(new PrintStream(byteArrayOutputStream));
        bibliotecaApp.seeWelcome();
        String result = byteArrayOutputStream.toString().trim();

        assertEquals(result,
                "Welcome to Biblioteca. You one-stop-one for great book titles in Bangalore!");
    }
}
