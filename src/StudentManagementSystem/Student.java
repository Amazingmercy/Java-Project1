package StudentManagementSystem;

public class Student extends User {
    int id;
    String matricNumber;
    String department;

    public Student(String myMatricNumber, String myDepartment, String myName, int myAge){
        super(myName, myAge);
        id = 1;
        matricNumber = myMatricNumber;
        department = myDepartment;
    }

    public void update(String myMatricNumber, String myDepartment){
        matricNumber = myMatricNumber;
        department = myDepartment;
    }


    public void update(String myMatricNumber){
        matricNumber = myMatricNumber;
    }


    @Override
    public String display(){
        return "Name: " + getName() + " Age: " + getAge() + " MatricNumber: " + matricNumber + " Department: " + department;
    }

}