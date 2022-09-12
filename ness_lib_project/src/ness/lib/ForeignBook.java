package ness.lib;

import java.text.MessageFormat;

public class ForeignBook extends Book{
    String language;
    public ForeignBook(String name, String author, int pages) {
        super(name, author, pages);
        language = "English";
    }

    public ForeignBook(String name, String author, int pages, String language) {
        super(name, author, pages);
        this.language = language;
    }

    @Override
    public String toString() {
        return MessageFormat.format("language: {0}\nname: {1}\nauthor: {2}\npages: {3}",
                language,name,author,pages);
    }
}
