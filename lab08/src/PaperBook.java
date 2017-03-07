/**
 * Created by jay on 2017/3/6.
 */
public class PaperBook extends Book {
    int bookmark;

    public PaperBook(String name, int pages, String author, int bookmark) {
        super(name, pages, author);
        this.bookmark = bookmark;
    }

    public void changeBookmark(int newBookmark) {
        if (newBookmark < 0 || newBookmark > this.pages) {
            System.out.println("Error");
            return;
        } else {

            this.bookmark = newBookmark;
            System.out.println(newBookmark);
        }
    }

    @Override
    public void printBookDetails() {
        super.printBookDetails();
        System.out.println("Your last bookmark was at page " + bookmark);

    }

}
