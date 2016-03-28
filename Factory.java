package util;

import dao.impl.EmployeeDAOJdbcImpl;
/**
 * 工厂类
 * 工厂是一种设计模式（所谓设计模式是为解决相同或者相似的问题提出的一套解决方案，并且会对这个解决
 * 方案命名，比如工厂模式就是一个常用的设计模式）
 * 工厂为调用着提供符合接口要求的对象（这个对象一般称为产品），这样做的好处是，调用者不用了解对象的
 * 创建细节，这样当对象的创建过程发生改变，不会影响到调用者。
 * 可以使用配置文件来获得接口与对应实现类的对应关系，当实现类发生改变，不用再去修改工厂类的源代码 
 */
public class Factory {
  public static Object getInstance(String type){
    Object obj = null;
    if("EmployeeDAO".equals(type)){
      obj = new EmployeeDAOJdbcImpl();
    }
    return obj;
  }
}
