package single;
//懒汉  要用的时候去new  INSTANCE
public class  LazySingleton {
    private static volatile LazySingleton INSTANCE;  //一开始不创建对象  volatile用于线程安全

    private LazySingleton(){}

    public static synchronized LazySingleton getInstance(){  //将对象的创建延后到需要时再进行
        if(INSTANCE==null){//实例为空（第一次使用） 就创建 不为空就说明已经创建过了直接返回
            synchronized (LazySingleton.class) {//线程安全加锁 每次只有一个线程进去
                if(INSTANCE==null) {//内层再检查一次 双重检查锁定
                    INSTANCE = new LazySingleton();
                }
            }
        }
        return INSTANCE;
    }
}
