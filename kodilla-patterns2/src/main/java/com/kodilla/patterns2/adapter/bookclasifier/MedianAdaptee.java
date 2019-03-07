package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;
import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    @Override
    public int averagePublicationYear(Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books){
        Statistics theStatistics2 = new Statistics();
        return theStatistics2.medianPublicationYear(books);
    }
    @Override
    public int medianPublicationYear(Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books) {
        Statistics theStatistics = new Statistics();
        return  theStatistics.medianPublicationYear(books);
    }
}
