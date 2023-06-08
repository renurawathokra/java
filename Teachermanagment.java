
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Integer choice = 0;
        ArrayList<Teacher> allTeacher = new ArrayList<Teacher>();
        do {
            Scanner obj = new Scanner(System.in);
            System.out.println("___teacher Management System___");
            System.out.println("Press 0 to exit");
            System.out.println("Press 1 to add Teacher");
            System.out.println("Press 2 to remove Teacher");
            System.out.println("Press 3 to view all Teacher");
            choice = obj.nextInt();
            switch (choice) {
                case 1:
                    // teacher TeacherObj = new Teacher();
                    System.out.println("Name : ");
                    String name = obj.next();
                    System.out.println("id : ");
                    int id = obj.nextInt();
                    System.out.println("subject : ");
                    String subject = obj.next();
                    System.out.println("techaer sallary  : ");
                    int sal = obj.nextInt();
                    int salary = sal * 1000;

                    allTeacher.add(new Teacher(name, id, subject, salary));
                    break;
                case 2:
                    System.out.println("remove teacher");
                    System.out.println("id : ");
                    int Deleteid = obj.nextInt();
                    for (int i = 0; i < allTeacher.size(); i++) {
                        if (Deleteid == allTeacher.get(i).id) {
                            allTeacher.remove(i);
                        }
                    }
                    break;
                case 3:
                    System.out.println("show all Teacher");
                    System.out.println("name \t\t id \tsubject \t Teacher salary");
                    for (Teacher TeacherObj : allTeacher) {
                        System.out.println(TeacherObj.name + " \t\t " + TeacherObj.id + " \t" + TeacherObj.subject
                                + "\t\t" + TeacherObj.salary);

                    }
                    break;

            }
            System.out.println("------------------------------");
        } while (choice != 0);
    }
}

class Teacher {
    public int id;

    public String name;
    public String subject;
    public int salary;

    public Teacher(String name, int id, String subject, int salary) {
        this.name = name;
        this.id = id;
        this.subject = subject;
        this.salary = salary;

    }
}
