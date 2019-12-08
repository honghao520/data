package structure.reflection;

public class Reflection implements ReflectionDome{
    private int id ;
    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void reflectionMethod(int i){
        System.out.println("我是reflection接口的实现类的方法1");
    }
}
