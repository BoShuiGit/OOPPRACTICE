package ooppractice;
import java.util.HashMap;

public class UserList {

    String password;

    HashMap<String, LibraryUser> userList;

    public UserList(){
        this.userList = new HashMap<>();
    }

    public void createUser (LibraryUser user){
        this.userList.put(user.getName(), user);
    }

}
