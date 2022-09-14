package ness.lib;


import java.text.MessageFormat;

public class Book {
     String name;
     String author;
     int pages;

    public Book(String name, String author, int pages) {
        this.name = name;
        this.author = author;
        this.pages = pages;
    }
    @SuppressWarnings("unused")
    public String getName() {
        return name;
    }
    @SuppressWarnings("unused")
    public void setName(String name) {
        this.name = name;
    }
    @SuppressWarnings("unused")
    public String getAuthor() {
        return author;
    }
    @SuppressWarnings("unused")
    public void setAuthor(String author) {
        this.author = author;
    }
    @SuppressWarnings("unused")
    public int getPages() {
        return pages;
    }
    @SuppressWarnings("unused")
    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return MessageFormat.format("name: {0}\nauthor: {1}\npages: {2}",
                name,author,pages);
    }
}



