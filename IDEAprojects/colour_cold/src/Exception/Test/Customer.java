package Exception.Test;


public class Customer {
    public void regsiter(String name, String password) throws IllegalNameException {
        if (name.length() < 6 || password.length() < 8) {
            throw new IllegalNameException("用户名不能小于6位数，密码不能小于8位数");
        }
        boolean s = false;
        for (int i = 0; i < password.length(); i++) {
            if ((int) password.charAt(i) >= 65 && (int) password.charAt(i) <= 90) {
                s = true;
                break;
            }
        }
        if (!s) {
            throw new IllegalNameException("密码必须有大写字符");

        }
        System.out.println("注册成功");
    }
}
