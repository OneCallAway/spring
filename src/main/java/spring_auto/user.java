package spring_auto;

/**
 * @author OneCallAway
 * @create 2018-04-26 下午2:08
 * @desc 对象属性
 **/

public class user {
    public int id;
    public String name;

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
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
