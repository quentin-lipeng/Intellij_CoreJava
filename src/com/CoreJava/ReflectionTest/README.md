# 反射
    利用Field类获取成员变量
    
    
## 1. 获取成员变量
1. 使用Field类
2. 忽略安全检查 可以访问非public的成员变量
void setAccessible()
## 2. 获取构造器
- 使用Constructor类
- 创建类对象
    1. Constructor.newInstance()
    2. 或使用Class类提供的方法 但不能传参
    如果使用**无惨构造器推荐这个**
    Class.newInstance()
## 3. 获取成员方法
- 使用getMethod()方法
## 4. 获取类名
- getName()方法
- 类名.class
    多用于参数传递
- Class.forName()
    + 多用于配置文件
- getClass()
    + 多用于获取对象的字节码

## 5. 实用技巧
- ClassLoader类


### 总结
1. 方法
    1. 带Declared字段的方法可以获取所有变量（包括非public的）
    2. 只要调用setAccessible()方法 什么属性的变量都可以调用
2. 建议
    1. 通过改配置文件来实现代码的多元化
    就是不改代码的情况下只改配合文件就可以呈现不同效果