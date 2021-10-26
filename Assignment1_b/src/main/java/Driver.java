import org.joda.time.DateTime;

public class Driver {

    public Driver (){}

    public void print()
    {
        //create datetime
        DateTime startDate = new DateTime(2018, 9, 6, 0, 0);
        DateTime endDate = new DateTime(2022, 5, 6,0,0);

        //create students
        Student student1 = new Student("John", "01-01-2001", 20, 001);
        Student student2 = new Student("Anne", "12-08-1999", 22, 002);
        Student student3 = new Student("David", "05-03-2000", 21, 003);

        //create course
        Course course1 = new Course("CSIT", startDate, endDate);

        //create modules
        Module module1 = new Module("Software Engineering", "CT417");
        Module module2 = new Module("Systems Modelling", "CT561");
        Module module3 = new Module("Machine Learning", "CT4101");

        //add modules to course
        course1.addModule(module1);
        course1.addModule(module2);
        course1.addModule(module3);

        //add students to module 1
        module1.addStudent(student1);
        module1.addStudent(student2);

        //add students to module 2
        module2.addStudent(student2);
        module2.addStudent(student3);

        //add students to module 3
        module3.addStudent(student1);
        module3.addStudent(student3);

        //set course for student
        student1.setCourse(course1);
        student2.setCourse(course1);
        student3.setCourse(course1);

        //Course Details
        String courseDetails = "Name: " + course1.getCourseName() + "\nModules: " + module1.getiD() +
                ", " + module2.getiD() + ", " + module3.getiD() + "\nNumber of students enrolled: " +
                course1.getStudents().size();

        //Module 1 Details
        String module_one_details = "Name: " + module1.getModuleName() + "\nID: " + module1.getiD() +
                "\nNumber Of Students: " + module1.getStudents().size() + "\nStudent Names: " + module1.getStudents().get(0).getName() +
                ", " + module1.getStudents().get(1).getName();

        //Module 1 Details
        String module_two_details = "Name: " + module2.getModuleName() + "\nID: " + module2.getiD() +
                "\nNumber Of Students: " + module2.getStudents().size() + "\nStudent Names: " + module2.getStudents().get(0).getName() +
                ", " + module2.getStudents().get(1).getName();

        //Module 1 Details
        String module_three_details = "Name: " + module3.getModuleName() + "\nID: " + module3.getiD() +
                "\nNumber Of Students: " + module3.getStudents().size() + "\nStudent Names: " + module3.getStudents().get(0).getName() +
                ", " + module3.getStudents().get(1).getName();

        //Student 1 Details
        String student_one_details = "Name: " + student1.getName() + "\tUsername: " + student1.getUsername() + "\nAge: " + student1.getAge() +
                "\t\tDate of Birth: " + student1.getDob() + "\nCourse: " + student1.getCourses().getCourseName() + "\nModules: " + student1.getModules().get(0).getModuleName() + ", " +
                student1.getModules().get(1).getModuleName();

        //Student 1 Details
        String student_two_details = "Name: " + student2.getName() + "\tUsername: " + student2.getUsername() + "\nAge: " + student2.getAge() +
                "\t\tDate of Birth: " + student2.getDob() + "\nCourse: " + student2.getCourses().getCourseName() + "\nModules: " + student2.getModules().get(0).getModuleName() + ", " +
                student2.getModules().get(1).getModuleName();

        //Student 1 Details
        String student_three_details = "Name: " + student3.getName() + "\tUsername: " + student3.getUsername() + "\nAge: " + student3.getAge() +
                "\t\tDate of Birth: " + student3.getDob() + "\nCourse: " + student3.getCourses().getCourseName() + "\nModules: " + student3.getModules().get(0).getModuleName() + ", " +
                student3.getModules().get(1).getModuleName();

        //Print out
        System.out.println("\n---------------------------------------------------------\nCOURSE DETAILS \n");
        System.out.println(courseDetails);
        System.out.println("\n---------------------------------------------------------\nMODULE 1 DETAILS \n");
        System.out.println(module_one_details);
        System.out.println("\n---------------------------------------------------------\nMODULE 2 DETAILS \n");
        System.out.println(module_two_details);
        System.out.println("\n---------------------------------------------------------\nMODULE 3 DETAILS \n");
        System.out.println(module_three_details);
        System.out.println("\n---------------------------------------------------------\nSTUDENT 1 DETAILS \n");
        System.out.println(student_one_details);
        System.out.println("\n---------------------------------------------------------\nSTUDENT 2 DETAILS \n");
        System.out.println(student_two_details);
        System.out.println("\n---------------------------------------------------------\nSTUDENT 3 DETAILS \n");
        System.out.println(student_three_details);


    }

    public static void main(String[] args)
    {
        Driver driver = new Driver();
        driver.print();
    }

}
