package Thread.ThreadPool14;

/*
    线程池容器-->集合(ArrayList、HashSet、【LinkedList<Thread>】、HashMap)

    当程序第一次启动的时候，创建多个线程，保存到一个集合中
    当我们想要使用线程的时候，就可以从集合中取出来线程使用
    Thread t = list.remove(0) 返回的是被移除的元素(线程只能被一个任务使用)
    Thread t = linked.removeFirst();
    当我们使用完毕线程，需要把线程归还给线程池
    list.add(t);
    list.addFirst(t);

    在JDK1.5之后，JDK内置了线程池，我们可以直接使用
 */
public class ThreadPoolTest01 {
}
