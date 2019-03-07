package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;
import java.util.HashSet;
import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();

        Book book1 = new Book("Roger Crowley", "Empires of The Sea", 2011, "00001");
        Book book2 = new Book("Charles Dickens", "Bleak House", 1853, "00002");
        Book book3 = new Book("Robert Jordan", "The Eye of the World", 1990,"00003");
        Book book4 = new Book("Ken Follett", "World Without End", 2007,"00004");
        Book book5 = new Book("George Martin", "A Storm of Swords", 2000,"00005");

        HashSet<Book> booksSet = new HashSet<>();
        booksSet.add(book1);
        booksSet.add(book2);
        booksSet.add(book3);
        booksSet.add(book4);
        booksSet.add(book5);
        //When
        int medianYear = medianAdapter.publicationYearMedian(booksSet);
        //Then
        assertEquals(medianYear, 2000);
    }
}