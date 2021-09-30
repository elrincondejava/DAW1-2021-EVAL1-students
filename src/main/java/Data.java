import java.util.ArrayList;
import java.util.List;

public class Data {
    public static List<Student> studenList = new ArrayList<>();
    public static List<Teacher> teachList = new ArrayList<>();
    public static final int  MINIMO_CREDITOS = 100;



    public static void addStudent(Student student) {
        Data.studenList.add(student);
    }

    public static void addStudents(List<Student> studenList) {
        Data.studenList.addAll(studenList);
    }

    public static void addTeacher(Teacher teacher) {
        Data.teachList.add(teacher);
    }

    public static void addTeachers(List<Teacher> teachList) {
        Data.teachList.addAll(teachList);
    }

    public static  void showAllStudents() {
        for(Student student : studenList) {
            System.out.println(student.toString());
        }
    }

    public static void showStudent(String studentId) {
        for (Student student : Data.studenList) {
            if (student.getStudentId().equals(studentId)) {
                System.out.println(student.toString());
            }
        }
    }

    public static void showMatriculationStudent(Student student){
            if(student.getStudentsCredits() >= Data.MINIMO_CREDITOS){
                System.out.println( student.getFirstName() + " ya está matriculado con " +  student.getStudentsCredits() + " créditos");
            }else{
                System.out.println( student.getFirstName() + " NO está matriculado, tiene " +  student.getStudentsCredits() +  " créditos");
            }
    }


    public static void showAllTeachers() {
        for (Teacher teachers : Data.teachList) {
                System.out.println(teachers);
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
