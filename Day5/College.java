

public class College {
    public static void main(String[] args){
        Student student1 = new Student(101, "Alice", "Computer Science", "Sophomore");
        Student student2 = new Student(102, "Bob", "Mathematics", "Junior");

        Teacher teacher1 = new Teacher("Dr. Smith", "Physics", 10, "Science");
        Teacher teacher2 = new Teacher("Prof. Johnson", "History", 15, "Arts");

        // Call display() methods
        student1.display();
        student2.display();
        teacher1.display();
        teacher2.display();
    }
}

class Student {
    int Id;
    String Name;
    String Course;
    String Year;

    Student(int Id, String Name, String Course, String Year) {
        this.Id = Id;
        this.Name = Name;
        this.Course = Course;
        this.Year = Year;
    }

    void display() {
        System.out.println("Student Id: " + Id);
        System.out.println("Student Name: " + Name);
        System.out.println("Course: " + Course);
        System.out.println("Year: " + Year);
        System.out.println("--------------------------");
    }
}

class Teacher {
    String Name;
    String Subject;
    int Experience;
    String Department;

    Teacher(String Name, String Subject, int Experience, String Department) {
        this.Name = Name;
        this.Subject = Subject;
        this.Experience = Experience;
        this.Department = Department;
    }

    void display() {
        System.out.println("Teacher Name: " + Name);
        System.out.println("Subject: " + Subject);
        System.out.println("Experience: " + Experience + " years");
        System.out.println("Department: " + Department);
        System.out.println("--------------------------");
    }
}

