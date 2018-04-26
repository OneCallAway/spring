package spring_property;

/**
 * @author OneCallAway
 * @create 2018-04-18 下午5:29
 * @desc 对象属性
 **/

public class user {
    private int id;
    private String name;

    public user() {
        super();
        System.out.println("无参数");
    }

    public user(int id, String name) {
        System.out.println("有参数");
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
