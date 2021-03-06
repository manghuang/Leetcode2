## 并发
前提：
1. 线程和任务绑定
2. 一个线程对应一个共享实例的方法或者多个线程对应一个共享实例的方法
3. 线程之间的关系：  
   1.没有任何关系  
   2.有关系，是竞争关系  
   3.有关系，是协作关系
   


## 竞争
```
特点：
1. 临界区每次可以允许多个线程同时进入
2. 进入后同一个条件下可以执行的线程有多个条件或者没有条件
```
#### 情况一：最后结果是不固定的，约束弱(是一定范围内输出的约束，比如三个一组输出，顺序不限制)
1. 使用synchronized+自带的一个条件对象
2. 使用Lock+创建的一个条件对象
```
方法特点：
1. 临界区每次只允许一个线程进入，限制条件复原的时机
```

#### 情况二：最后结果是不固定的，约束弱(是可能出现死锁的约束，比如哲学家就餐)
1. 使用synchronized
2. 使用Lock
```
方法特点：
1. 临界区每次只允许一个线程进入
```

#### 情况三：最后结果是不固定的，没有约束（对输出顺序没有任何限制，且不会出现死锁）
1. 使用synchronized
2. 使用Lock
3. 使用信号量控制进入的线程数量
```
方法特点：
1. 临界区每次可以允许多个线程进入
```


## 协作
```
特点：
1. 临界区每次只允许一个线程进入
2. 进入后同一个条件下可以执行的线程只有一个
```

####情况一：最后结果是固定的，约束最强(可以预测线程的执行顺序，执行顺序如ABC等)
1. 使用volatile
2. 使用synchronized+自带的一个条件对象
3. 使用Lock+创建的一个条件对象
4. 使用Lock+创建的多个条件对象，可以使用多个条件对象指定线程执行顺序
5. 使用信号量（限制数量1）控制线程执行顺序

####情况二：最后结果是固定的，约束最强(可以预测线程的执行顺序，执行顺序如ABAC、AABC等)
1. 使用volatile
2. 使用synchronized+自带的一个条件对象
3. 使用Lock+创建的一个条件对象
4. 使用Lock+创建的多个条件对象，可以使用多个条件对象指定线程执行顺序
5. 使用信号量（限制数量1）控制线程执行顺序

####情况三：最后结果是固定的，约束最强(不能预测线程的执行顺序)
1. 使用synchronized+自带的一个条件对象
2. 使用Lock+创建的一个条件对象







