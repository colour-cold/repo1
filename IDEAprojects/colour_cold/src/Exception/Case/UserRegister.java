package Exception.Case;

import java.util.Scanner;

public class UserRegister {
    private String userName;

    public UserRegister() {
    }

    public UserRegister(String userName) {
        this.userName = userName;
    }

    public String method() {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        return str;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
