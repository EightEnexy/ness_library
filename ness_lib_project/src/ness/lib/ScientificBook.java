package ness.lib;
import java.text.MessageFormat;

public class ScientificBook extends Book{
    String scientificArea;
    public ScientificBook(String name, String author, int pages,String scientificArea) {
        super(name, author, pages);
        this.scientificArea = scientificArea;
    }

    @Override
    public String toString() {
        return MessageFormat.format("scientificArea: {0}\nname: {1}\nauthor: {2}\npages: {3}",
                scientificArea,name,author,pages);
    }
}
