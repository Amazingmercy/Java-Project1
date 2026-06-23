import java.util.Scanner;

public class Main{
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Student student = null;

    int choice;

    boolean running = true;


    IO.print("Welcome to Amazing Student Management System");
    IO.print("\nSelect what you would like to do?");


    while (running) {
      IO.print("\n1. Add Student\n2. Update Student\n3. View all students\n4. Update Matric Number \n5. exit\nResponse:  ");
      choice = scanner.nextInt();
      scanner.nextLine();


      switch (choice) {
        case 1: {
          IO.print("Enter the Student Name: ");
          String name = scanner.nextLine();
          IO.print("Enter the Student Age: ");
          int age = scanner.nextInt();
          scanner.nextLine();
          IO.print("Enter the Student Matric Number: ");
          String matricNo = scanner.nextLine();
          IO.print("Enter the Student Department: ");
          String department = scanner.nextLine();
          student = new Student(matricNo, department, name, age);
          IO.print("Student added Successfully");
          break;
        }
        case 2: {
          if(student != null){
            IO.print("Enter the Student Department: ");
            String department = scanner.nextLine();
            IO.print("Enter the Student Matric Number: ");
            String matricNumber = scanner.nextLine();
            student.update(matricNumber, department);
          }else{
            IO.print("No student has been added yet.");
          }
          IO.print("Student Course updated successfully");
          break;
        }
        case 3: {
          if(student != null){
            IO.print(student.display());
          }else{
            IO.print("No student has been added yet.");
          }
          break;
        }
        case 4: {
          if(student != null){
            IO.print("Enter the Student Matric Number: ");
            String matricNumber = scanner.nextLine();
            student.update(matricNumber);
          }else{
            IO.print("No student has been added yet.");
          }
          IO.print("Student Matric Number updated successfully");
          break;
        }
        case 5: {
          running = false;
          IO.println("Exiting.....");
          break;
        }
        default:
          IO.print("Invalid selection, choose options 1-4");
      }

    }

    scanner.close();
  }
}