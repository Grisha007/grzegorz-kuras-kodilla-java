package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Book book1 = new Book("Title 1", "Author 1", LocalDate.of(2015, 5, 23));
        Book book2 = new Book("Title 2", "Author 2", LocalDate.of(2003, 11, 15));
        Book book3 = new Book("Title 3", "Author 3", LocalDate.of(2009, 9, 5));

        Library library = new Library("Library 1 - basic");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("Library 2 - shallow copy");
        } catch (CloneNotSupportedException e) {
            System.out.println("Exception has been occured: " + e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 3 - deep copy");
        } catch (CloneNotSupportedException e) {
            System.out.println("Exception has been occured: " + e);
        }
        //When
        library.getBooks().remove(book1);
        //Then
        System.out.println(library);
        System.out.println(shallowClonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, shallowClonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}
