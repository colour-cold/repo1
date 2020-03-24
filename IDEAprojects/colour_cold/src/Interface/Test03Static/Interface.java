package Interface.Test03Static;

/*
    从Java8开始，接口中允许定义静态方法。
    格式：
    public[可省略] static 返回值类型 方法名称(参数列表){
        方法体
    }

    Tips:就是将abstract或者default换成static即可，带上方法体
 */
public interface Interface {
    public static void method01() {
        System.out.println("接口的静态方法");
    }
}
