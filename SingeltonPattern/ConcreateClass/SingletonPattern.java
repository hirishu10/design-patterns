package SingeltonPattern.ConcreateClass;

public class SingletonPattern {

    public static SingletonPattern instance = new SingletonPattern();

    private SingletonPattern() {}// In Singleton Pattern we can't initialise new Object we return instance of previous pattern.

    public static SingletonPattern getInstance(){
        return instance;
    }

    public void displayMessage(){
        System.out.println("This is Singleton Pattern!");
    }

}