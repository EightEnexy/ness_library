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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return MessageFormat.format("name: {0}\nauthor: {1}\npages: {2}",
                name,author,pages);
    }
}



