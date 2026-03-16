package PackageAssignment.college;
import PackageAssignment.college.student.Student;
import PackageAssignment.college.faculty.Faculty;
public class Runner{
    public static void main(String[] args) {
        Student s = new Student();
        Faculty f = new Faculty();
        s.displayStudent();
        f.displayFaculty();
    }
}