package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("Author 1", "Title 1", 2007, "Signature 1");
        Book book2 = new Book("Author 2", "Title 2", 2003, "Signature 2");
        Book book3 = new Book("Author 3", "Title 3", 1997, "Signature 3");
        Book book4 = new Book("Author 4", "Title 4", 1999, "Signature 4");
        Book book5 = new Book("Author 5", "Title 5", 2009, "Signature 5");

        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int medianYear = medianAdapter.publicationYearMedian(books);
        //Then
        System.out.println("Year median: " + medianYear);
        assertEquals(2003, medianYear);
    }
}
