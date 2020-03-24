package Exception.Test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Customer c = new Customer();
        Scanner s = new Scanner(System.in);
        String name = s.next();
        String password = s.next();
        try {
            c.regsiter(name, password);
        } catch (IllegalNameException e) {
            System.out.println(e);
        }
    }
}

