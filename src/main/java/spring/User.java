package spring;

/**
 * @author OneCallAway
 * @create 2018-04-14 下午10:33
 * @desc springIOC
 **/

public class User {
    private int id;
    private String name;


    public void init_user(){
        System.out.println("创建对象之后初始化");
    }

    public void destory_user(){
        System.out.println("IOC容器销毁,user对象回收");
    }

    public User() {
        super();
        System.out.println("----user对象创建----");
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
