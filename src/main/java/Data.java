import java.util.ArrayList;
import java.util.List;

public class Data {
    private static List<Student> studenList = new ArrayList<>();
    private static List<Teacher> teachList = new ArrayList<>();



    public static void addStudent(Student student) {

        Data.studenList.add(student);
    }

    public static void addTeacher(Teacher teacher) {

        Data.teachList.add(teacher);
    }


    public static  void showAllStudents() {
        for(Student student : studenList) {
            System.out.println(student.toString());
        }
    }

    public static void showStudent(String studentId) {
        for (Student student : Data.studenList) {
            if (student.getStudentId().equals(studentId)) {
                System.out.println(student);
            }
        }
    }
    public static void showTeacher(Teacher teacher) {
        for (Teacher teachers : Data.teachList) {
                System.out.println(teacher);
            }
        }




    public static void showStudentByEnrollSubject(String subjectName){
        for (Student student : Data.studenList) {
            List<Subject> subjectStudentList = student.getEnrollSubjectList();
            for (Subject subject : subjectStudentList) {
                if(subject.getName().equals(subjectName)){
                    System.out.println(student);
                }

            }
        }

    }
}
