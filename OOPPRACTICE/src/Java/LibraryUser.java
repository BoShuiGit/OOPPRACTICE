package java;
import java.util.Date;
import java.util.HashMap;

public class LibraryUser {

    String userName;
    int id;
    HashMap<String, Date> borrowedBook;
    

    public LibraryUser(int id, String userName) {
        this.id = id;
        this.userName = userName;
        this.borrowedBook = new HashMap<>();
    }

    public LibraryUser() {
    }

    public String getName() {
        return userName;
    }

    public void setName(String userName) {
        this.userName = userName;
    }

    public void setId(int id){
        this.id = id;
    }






}
