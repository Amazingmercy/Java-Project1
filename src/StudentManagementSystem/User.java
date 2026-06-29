package StudentManagementSystem;

public class User {
    private String name;
    private int age;

    //Constructor
    public User(String myName, int myAge) {
        name = myName;
        age = myAge;
    }

    //getters
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    //setters
    public void setName(String myName){
        name = myName;
    }

    public void setAge(int myAge){
        age = myAge;
    }


    public String display(){
        return "Name: " + name + " Age: " + age;
    }



}