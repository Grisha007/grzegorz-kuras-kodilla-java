package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    private final Statistics theStatistics = new Statistics();

    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        Statistics theStatistics = new Statistics();
        return theStatistics.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        Statistics theStatistics = new Statistics();
        return theStatistics.medianPublicationYear(books); //Wywołuje przekonwertowane A na B Step 2
    }
}
