package org.java.books;

import java.util.InputMismatchException;

public class Book {
    private String title;
    private int numberPages;

    private String author;

    private String editor;


    public Book(String title, int numberPages, String author, String editor) throws IllegalArgumentException {

        if (numberPages <= 0) {
            throw new IllegalArgumentException("Il numero di pagine deve essere <= 0");
        } else if (title == null || author == null || editor == null) {
            throw new IllegalArgumentException("Attenzione, titolo autore ed editore non possono essere vuoti");
            
        }
        this.title= title;
        this.numberPages=numberPages;
        this.author=author;
        this.editor= editor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws IllegalArgumentException {
        if (title == null) {
            throw new IllegalArgumentException("Attenzione, titolo non possono essere vuoti");
        }

        this.title = title;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) throws IllegalArgumentException {

        if (numberPages <= 0) {
            throw new IllegalArgumentException("Il numero di pagine deve essere <= 0");
        }
        this.numberPages = numberPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws IllegalArgumentException {
        if (author == null) {
            throw new IllegalArgumentException("Attenzione, autore non possono essere vuoti");
        }

        this.author = author;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) throws IllegalArgumentException {
        if (editor == null) {
            throw new IllegalArgumentException("Attenzione, titolo non possono essere vuoti");
        }
        this.editor = editor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", numberPages=" + numberPages +
                ", author='" + author + '\'' +
                ", editor='" + editor + '\'' +
                '}';
    }
}
