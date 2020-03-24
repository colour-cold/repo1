package ForTest;

/**
 * 模拟栈
 * 模拟栈的压入与弹出
 */
public class Stack {
    Object[] elements;
    int index; //指向栈顶元素上方的一个帧

    Stack() {
        this(5);
    }

    Stack(int max) {
        elements = new Object[max];
    }

    //栈应该对外提供一个压栈的方法
    public void push(Object element) throws StackException {
        /*elements [index] = elements;
          index++;
        */
        if (index == elements.length) {
            throw new StackException("栈已满");
        }
        elements[index++] = element;
    }

    //弹栈
    public Object pop() throws StackException {//栈顶元素往外弹
        //index--;
        //return elements [index];
        if (index <= 0) {
            throw new StackException("栈已空");
        }
        return elements[--index];
    }
}
