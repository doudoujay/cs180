/**
 * Created by jay on 3/7/17.
 */
public class Book {
    String name;
    int pages;
    String author;

    public Book(String name, int pages, String author) {
        this.name = name;
        this.pages = pages;
        this.author = author;
    }

    public void printBookDetails(){
        System.out.println("*********************************************");
        System.out.println("Name :"+name);
        System.out.println("No of Pages :"+pages);
        System.out.println("Author :"+author);
    }
}
