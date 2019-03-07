package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

import java.util.Map;

public interface BookStatistics {
    int averagePublicationYear(Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books);
    int medianPublicationYear(Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books);
}
