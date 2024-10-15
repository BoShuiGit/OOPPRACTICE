package ooppractice;
import java.util.Date;
import java.util.HashMap;


public class LibraryUser {

    String userName;
    String passWord;
    int id;
    HashMap<String, Date> borrowedBook;
    

    public LibraryUser(int id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.passWord = password;

        this.borrowedBook = new HashMap<>();
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

    public String getPassWord (){
        return passWord;
    }






}
