import java.util.List;

public class Student {
    private String firstName;
    private String secondName;
    private String studentId;
    private List<Subject> enrollSubjectList;

    public Student() {
    }

    public Student(String firstName, String secondName, String studentId, List<Subject> enrollSubjectList) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.studentId = studentId;
        this.enrollSubjectList = enrollSubjectList;
    }

    private void addSubject(Subject subject) {

        this.enrollSubjectList.add(subject);


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

    public Student setEnrollSubjectList(List<Subject> enrollSubjectList) {
        this.enrollSubjectList = enrollSubjectList;
        return this;
    }

    @Override
    public String toString() {
        String resultado = "Student " + " " + firstName + " " + secondName + "\n" +
                "his subjects are: " + "\n";
        for (int i = 0; i < this.enrollSubjectList.size(); i++) {
            resultado += (i + 1) + ". " + enrollSubjectList.get(i).getName() + "\n";
        }
        return resultado;
    }
}
