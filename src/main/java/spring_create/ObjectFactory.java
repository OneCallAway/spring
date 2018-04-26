package spring_create;

/**
 * @author OneCallAway
 * @create 2018-04-18 下午3:54
 * @desc 工厂创建对象
 **/

public class ObjectFactory {
    //实例方法调用对象
    public user getInstance(){
        return new user(100,"调用实例方法");
    }

    //静态方法创建对象
    public static user getStaticInstance(){
        return new user(101,"调用静态方法");
    }
}
