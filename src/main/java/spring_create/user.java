package spring_create;

/**
 * @author OneCallAway
 * @create 2018-04-18 下午2:42
 * @desc IOC容器创建对象
 **/

public class user {


    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public user() {
        super();
        System.out.println("无参数构造器");
    }

    public user(int id, String name) {
        System.out.println("有参数构造器");
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
