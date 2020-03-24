package AnonymousInnerClass;

/*
    匿名内部类，指的的是类没有名字
 */
public class Test {
    //静态方法
    public static void t(CustomerService cs) {
        cs.logout();
    }

    //入口
    public static void main(String[] args) {
        //调用t方法
        //t(new CustomerServiceImpl());
        //使用匿名内部类方法
        //整个“new CustomerService(){}”就是个匿名内部类
        t(new CustomerService() {
            public void logout() {
                System.out.println("退出系统");
            }
        });
        //匿名内部类的优点是：少定义一个类。
        //缺点是无法重复利用
    }
}

//接口
interface CustomerService {
    //退出系统
    void logout();
}

//创建一个类用于实现接口
//        class CustomerServiceImpl implements CustomerService {
//            public void logout() {
//                System.out.println("退出系统");
//            }
//        }
