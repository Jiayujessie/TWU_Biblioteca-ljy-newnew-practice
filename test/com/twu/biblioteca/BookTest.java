package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void customer_get_bookName_after_see_welcomeMessage() {

        Book book = new Book();
        book.name = "N1";
        book.seeBookList();
        String result = book.seeBookList();


        assertEquals(result,
                "N1");

    }

}
