package ness.lib;

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

}
