import java.time.LocalDateTime;

public class Exam  {
    private LocalDateTime datetime;
    private Subject subject;
    private double nota;

    public Exam() {
    }

    public Exam(LocalDateTime datetime, Subject subject) {
        this.datetime = datetime;
        this.subject = subject;

    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public Subject getSubject() {
        return subject;
    }

    public double getNota() {
        return nota;
    }

    public Exam setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
        return this;
    }

    public Exam setSubject(Subject subject) {
        this.subject = subject;
        return this;
    }

    public Exam setNota(double nota) {
        this.nota = nota;
        return this;
    }

    @Override
    public String toString() {
        return   subject.getName() + " " + datetime.getDayOfMonth() + "/" + datetime.getMonth() + "/" + datetime.getYear()
                + " las " + datetime.getHour() + ":" + datetime.getMinute() + ","
               + " nota: " + nota + " puntos" + "\n";
    }

}
