package single;
//饿汉式
public class Singleton {
    private final static Singleton INSTANCE = new Singleton();//用于引用全局的唯一的单例对象，在一开始就创建好
//一开始就创建好的饿汉式
    private Singleton(){
    }//不允许随便new 需要对象直接找getInstance

    public static Singleton getInstance(){  //获取全局唯一的单例对象
        return INSTANCE;
    }
}
