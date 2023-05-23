import java.util.Arrays;

public class Book {
    private String bookName;
    private int page;
    private boolean isActive;
    private Library library;
    private long bookId;

    public Book(String bookName, int page, boolean isActive, Library library, long bookId) {
        this.bookName = bookName;
        this.page = page;
        this.isActive = isActive;
        this.library = library;
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return "book: " + bookName;
//                "page='" + page + '\'' +
//                ", isActive=" + isActive +
//                ", library=" + library +
//                ", id="+bookId+
//                '}';

}
}