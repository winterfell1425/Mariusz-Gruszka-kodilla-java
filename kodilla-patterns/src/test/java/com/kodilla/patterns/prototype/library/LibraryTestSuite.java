package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Book book1 = new Book("Empires of The Sea", "Roger Crowley", LocalDate.of(2011,11,11));
        Book book2 = new Book("Bleak House","Charles Dickens", LocalDate.of( 1853, 3,7));
        Book book3 = new Book("The Eye of the World","Robert Jordan", LocalDate.of( 1990, 2,4));
        Book book4 = new Book("World Without End","Ken Follett", LocalDate.of(2007, 7, 6));
        Book book5 = new Book("A Storm of Swords","George Martin", LocalDate.of( 2000, 4,5));

        Library myLibrary = new Library("English Library");
        myLibrary.getBooks().add(book1);
        myLibrary.getBooks().add(book2);
        myLibrary.getBooks().add(book3);
        myLibrary.getBooks().add(book4);
        myLibrary.getBooks().add(book5);

        Library clonedLibrary = null;
        try {
            clonedLibrary = myLibrary.shallowCopy();
            clonedLibrary.setName("English Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = myLibrary.deepCopy();
            deepClonedLibrary.setName("English Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        myLibrary.getBooks().remove(book4);

        //Then
        System.out.println(myLibrary);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(4, myLibrary.getBooks().size());
        Assert.assertEquals(4, clonedLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), myLibrary.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), myLibrary.getBooks());
    }
}

