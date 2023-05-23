import java.util.Arrays;

public class Library {
    private String libraryName;
    private String address;
    private Book[]booksMassive=new Book[20];
    private int bookIndex=0;
    public Library(String libraryName,String address){
        this.libraryName=libraryName;
        this.address=address;
    }
    public Library(){

    }
    public void setLibraryName(String libraryName){
        this.libraryName=libraryName;
    }
    public String getLibraryName(){
        return libraryName;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return address;
    }

    public void addBookToLibrary(Book book){
        booksMassive[bookIndex]=book;
        bookIndex++;
    }
    @Override
    public String toString() {
        return "library name: " + libraryName+
                ",address='" + address + '\'' +
                ", booksMassive=" + Arrays.toString(booksMassive);
    }
}

