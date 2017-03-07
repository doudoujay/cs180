/**
 * Created by jay on 2017/3/6.
 */
public class eBook extends Book{
    float size;
    String[] comments;
    public eBook(String name, int pages, String author, float size) {
        super(name,pages,author);
        this.size = size;
        this.comments = new String[pages];
        for (int i = 0; i < pages; i++) {
            comments[i] = "";
        }

    }

    public void addComments(int page, String newComment) {
        if(page<0 || page>this.pages){
            System.out.println("Error");
            return;
        }else {
            comments[page] = newComment +", "+comments[page];
            System.out.println(comments[page]);
        }
    }

    @Override
    public void printBookDetails() {
        super.printBookDetails();
        System.out.println("Book size: "+size+"mb");
        for (int i = 0; i < pages; i++) {
            if (!comments[i].equals("")){
                System.out.println("Page "+i+": "+comments[i]);
            }
        }
    }
}
