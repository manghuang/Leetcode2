package leetcode12.Solution0.demo3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/*
    无共享变量
 */
public class Foo {
    // 锁对象
    // 可以处理竞争关系线程的问题
    private Lock lock = new ReentrantLock();
    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        lock.lock();
        printFirst.run();
        lock.unlock();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        lock.lock();
        printSecond.run();
        lock.unlock();
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        lock.lock();
        printThird.run();
        lock.unlock();
    }
}
