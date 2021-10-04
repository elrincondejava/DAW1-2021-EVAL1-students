import java.util.ArrayList;
import java.util.List;

public class Student {
    private String firstName;
    private String secondName;
    private String studentId;
    private List<Subject> enrollSubjectList;

    public Student() {
    }

    public Student(String firstName, String secondName, String studentId) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.studentId = studentId;
        this.enrollSubjectList = new ArrayList<>();
    }

    public void addSubject(Subject newSubject) {
        boolean encontrado = false;
        for (Subject subject : this.enrollSubjectList) {
            if (newSubject.getName().equals(subject.getName())) {
                encontrado = true;
            }

        }
        if( encontrado == false){
            this.enrollSubjectList.add(newSubject);
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public Student setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getSecondName() {
        return secondName;
    }

    public Student setSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }

    public String getStudentId() {
        return studentId;
    }

    public Student setStudentId(String studentId) {
        this.studentId = studentId;
        return this;
    }

    public List<Subject> getEnrollSubjectList() {
        return enrollSubjectList;
    }


    public Integer getStudentsCredits() {
        Integer creditos = 0;
        for (Subject subject : this.getEnrollSubjectList()) {
            creditos += subject.getCredits();
        }

        return creditos;
    }

    @Override
    public String toString() {
        String resultado = "Student " + " " + firstName + " " + secondName + "\n" +
                "his subjects are: " + "\n";
        for (int i = 0; i < this.enrollSubjectList.size(); i++) {
            resultado += (i + 1) + ". " + enrollSubjectList.get(i).getName();

            for (Teacher teacher : Data.teachList) {
                for (Subject teacherSubject : teacher.getTeachedSubjectList()) {
                    if (teacherSubject.getName().equals(enrollSubjectList.get(i).getName())) {
                        resultado += " impartido por : " + teacher.getFirstName() + " " + teacher.getSecondName() + "\n";
                    }
                }
            }
        }
        return resultado;
    }
}
