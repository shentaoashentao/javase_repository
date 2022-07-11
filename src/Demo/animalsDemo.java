package Demo;

//多态实现
class animals{
    void run(){
        System.out.println("animals is running");
    }
    void eat(){
        System.out.println("animals is eating");
    }
}
class Dog extends animals{
    void run(){
        System.out.println("dog is running");
    }
    void eat(){
        System.out.println("dog is eating");
    }
}
class Cat extends animals{
    void run(){
        System.out.println("cat is running");
    }
}
public class animalsDemo {
    public static void main(String[] args){
        animals dog =new Dog();
        animals cat =new Cat();
        dog.run();
        cat.eat();
    }
}