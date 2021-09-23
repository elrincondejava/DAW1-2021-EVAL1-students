import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Subject math = new Subject("math",50);
        Subject english = new Subject("english",80);
        Subject informatic = new Subject("informatic",30);
        List<Subject> subjectListManolo = new ArrayList<>();
        List<Subject> subjectListMatilda = new ArrayList<>();
        List<Subject> subjectListJosefa = new ArrayList<>();
        subjectListManolo.add(math);
        Student manolo = new Student("Manolo","Garcia","4568P",subjectListManolo);
        subjectListJosefa.add(english);
        Student josefa = new Student("Josefa","Garcia","4568Q",subjectListJosefa);
        subjectListMatilda.add(informatic);
        subjectListMatilda.add(english);
        Student matilda = new Student("Matilda","Garcia","4568A",subjectListMatilda);
        Data.addStudent(manolo);
        Data.addStudent(matilda);
        Data.addStudent(josefa);
        Data.showAllStudents();
        Data.showStudent("4568P");
        Data.showStudentByEnrollSubject("english");

    }
}
