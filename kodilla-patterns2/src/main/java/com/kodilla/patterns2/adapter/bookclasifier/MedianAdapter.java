package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> booksMap = new HashMap<>();
        for (com.kodilla.patterns2.adapter.bookclasifier.librarya.Book theBook : bookSet) {
            booksMap.put(new BookSignature(theBook.getSignature()),
                    (new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(theBook.getAuthor(), theBook.getTitle(), theBook.getPublicationYear())));
        }
        return medianPublicationYear(booksMap);
    }
}
