import java.util.List;

public class Teacher {
    private String firstName;
    private String secondName;
    private List<Teacher> teachedSubjectList;

    public Teacher() {
    }

    public Teacher(String firstName, String secondName, List<Teacher> teachedSubjectList) {
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

    public List<Teacher> getTeachedSubjectList() {
        return teachedSubjectList;
    }

    public Teacher setTeachedSubjectList(List<Teacher> teachedSubjectList) {
        this.teachedSubjectList = teachedSubjectList;
        return this;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", teachedSubjectList=" + teachedSubjectList +
                '}';
    }
}
