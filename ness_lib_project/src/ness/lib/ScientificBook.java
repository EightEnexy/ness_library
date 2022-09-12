package ness.lib;

public class ScientificBook extends Book{
    String scientificArea;
    public ScientificBook(String name, String author, int pages,String scientificArea) {
        super(name, author, pages);
        this.scientificArea = scientificArea;
    }
}
