import java.util.List;

public class Teacher {
    private String firstName;
    private String secondName;
    private List<Subject> teachedSubjectList;

    public Teacher() {
    }

    public Teacher(String firstName, String secondName, List<Subject> teachedSubjectList) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.teachedSubjectList = teachedSubjectList;
    }

    public String getFirstName() {
        return firstName;
    }

    public Teacher setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getSecondName() {
        return secondName;
    }

    public Teacher setSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }

    public List<Subject> getTeachedSubjectList() {
        return teachedSubjectList;
    }

    public Teacher setTeachedSubjectList(List<Subject> teachedSubjectList) {
        this.teachedSubjectList = teachedSubjectList;
        return this;
    }

    @Override
    public String toString() {
        String resultado = "Teacher " + " " + firstName + " " + secondName + "\n" +
                "his subjects are: " + "\n";
        for (int i = 0; i < this.teachedSubjectList.size(); i++) {
            resultado += (i + 1) + ". " + this.teachedSubjectList.get(i).getName() + "\n";


        }
        return resultado;
    }
}
