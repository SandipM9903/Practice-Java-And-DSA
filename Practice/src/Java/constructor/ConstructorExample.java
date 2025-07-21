package Java.constructor;

public class ConstructorExample {
    String name;
    int age;

    ConstructorExample(String name, int age){
        this.name = name;
        this.age = age;

        System.out.println("My name is : " + name + " and age is " + age);
    }
}
