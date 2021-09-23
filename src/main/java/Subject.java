public class Subject {
    private String name;
    private Integer credits;

    public Subject() {
    }

    public Subject(String name, Integer credits) {
        this.name = name;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public Subject setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getCredits() {
        return credits;
    }

    public Subject setCredits(Integer credits) {
        this.credits = credits;
        return this;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", credits='" + credits + '\'' +
                '}';
    }
}
