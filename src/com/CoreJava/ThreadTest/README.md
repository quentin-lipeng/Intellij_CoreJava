# 线程测试

## 实现线程的两个方式
### 
    1. 通过继承Thread类编写run方法 再通过Start实现创建线程开辟新栈
    2. 通过实现Runnable接口 实现run方法 把实现Runnable接口的类传到Thread对象构造器中
## Thread下的方法
    1. sleep()