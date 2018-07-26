package com.kodilla.testing.library;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class BookDirectoryTestSuite {
    @Test
    public void testListBooksWithConditionsReturnList(){
        //Given
        LibraryDatabase libraryDatabaseMoc = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMoc);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMoc.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

        //Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        //Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListOfBooksInHandsOf(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        LibraryUser libraryUser1 = new LibraryUser("John1", "Smith1", "1111111");
        LibraryUser libraryUser2 = new LibraryUser("John2", "Smith2", "2222222");
        LibraryUser libraryUser3 = new LibraryUser("John3", "Smith3", "3333333");

        List<Book> resultListOf0BooksInHandsOf = new ArrayList<>();

        List<Book> resultListOf1BooksInHandsOf = new ArrayList<>();
        Book book0 = new Book("Secrets of Alamo", "John Smith", 2008);
        resultListOf1BooksInHandsOf.add(book0);

        List<Book> resultListOf5BooksInHandsOf = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        Book book5 = new Book("Secrets of the Nile", "Carolyn Keene", 1995);
        resultListOf5BooksInHandsOf.add(book1);
        resultListOf5BooksInHandsOf.add(book2);
        resultListOf5BooksInHandsOf.add(book3);
        resultListOf5BooksInHandsOf.add(book4);
        resultListOf5BooksInHandsOf.add(book5);

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1)).thenReturn(resultListOf0BooksInHandsOf);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser2)).thenReturn(resultListOf1BooksInHandsOf);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser3)).thenReturn(resultListOf5BooksInHandsOf);

        //When
        List<Book> listOf0BooksInHandsOf = bookLibrary.listBooksInHandsOf(libraryUser1);
        List<Book> listOf1BooksInHandsOf = bookLibrary.listBooksInHandsOf(libraryUser2);
        List<Book> listOf5BooksInHandsOf = bookLibrary.listBooksInHandsOf(libraryUser3);

        //Then
        assertEquals(0, listOf0BooksInHandsOf.size());
        assertEquals(1, listOf1BooksInHandsOf.size());
        assertEquals(5, listOf5BooksInHandsOf.size());
    }
}