package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books = new HashMap<>();

        for(Book book : bookSet) {
            BookSignature bookSignatureB = new BookSignature(book.getSignature());
            com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book bookB = new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(book.getAuthor(), book.getTitle(), book.getPublicationYear());
            books.put(bookSignatureB, bookB); //Konwertuje format A na B Step 1.
        }
        return medianPublicationYear(books);
    }
}
