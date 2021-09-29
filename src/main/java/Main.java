import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // CREATING SUBJECTS
        Subject math = new Subject("math", 50);
        Subject english = new Subject("english", 80);
        Subject computing = new Subject("computing", 30);
        Subject dataBase = new Subject("data base", 60);
        Subject java = new Subject("java", 90);
        Subject html = new Subject("html", 40);


        // CREATING SUBJECTS LIST FOR STUDENTS
        List<Subject> subjectListManolo = new ArrayList<>();
        List<Subject> subjectListMatilda = new ArrayList<>();
        List<Subject> subjectListJosefa = new ArrayList<>();
        List<Subject> subjectListAlex = new ArrayList<>();
        List<Subject> subjectListJavier = new ArrayList<>();
        List<Subject> subjectListSamuel = new ArrayList<>();

        // ADD SUBJECTS TO STUDENT SUBJECTS LIST
        subjectListManolo.add(math);
        subjectListJosefa.add(english);
        subjectListMatilda.add(computing);
        subjectListMatilda.add(english);
        subjectListAlex.add(dataBase);
        subjectListAlex.add(java);
        subjectListJavier.add(java);
        subjectListJavier.add(html);
        subjectListSamuel.addAll(List.of(math, dataBase, computing));


        // CREATING SUBJECTS LIST FOR TEACHERS
        List<Subject> subjectListAntonio = new ArrayList<>();
        List<Subject> subjectListJennifer = new ArrayList<>();
        List<Subject> subjectListJuan = new ArrayList<>();
        List<Subject> subjectListMiguel = new ArrayList<>();
        List<Subject> subjectListMariajo = new ArrayList<>();


        // ADD SUBJECTS TO TEACHER SUBJECTS LIST

        //TODO Aquí faltaba añadir a los listados de asignatura de los profesores las asignaturas que va a impartir sólo teníamos las de los alumnos


        // CREATING STUDENTS WITH THEIR SUBJECTS LIST
        Student manolo = new Student("Manolo", "García", "4568P", subjectListManolo);
        Student josefa = new Student("Josefa", "García", "4568Q", subjectListJosefa);
        Student matilda = new Student("Matilda", "García", "4568A", subjectListMatilda);
        Student alex = new Student("Alex", "Martel", "5432B", subjectListAlex);
        Student javier = new Student("Javier", "Hernández", "8765K", subjectListJavier);
        Student samuel = new Student("Samuel", "Martín", "4321Z", subjectListSamuel);

        // CREATING TEACHERS WITH THEIR SUBJECTS LIST
        Teacher antonio = new Teacher("Antonio", "Fernández", subjectListAntonio);
        Teacher jennifer = new Teacher("Jennifer", "Sunder", subjectListJennifer);
        Teacher juan = new Teacher("Juan", "Navarro", subjectListJuan);
        Teacher miguel = new Teacher("Miguel", "Hernández", subjectListMiguel);
        Teacher mariaJose = new Teacher("María José", "Hernández", subjectListMariajo);

        // ADD STUDENTS AND TEACHERS TO DATA CLASS
        Data.addStudents(List.of(manolo, matilda, josefa, alex, javier, samuel));
        Data.addTeachers(List.of(antonio, jennifer, juan, miguel, mariaJose));

        //USING METHODS OF DATA CLASS
        // Data.showAllStudents();
        // Data.showStudent("4568P");
        // Data.showStudentByEnrollSubject("english");
        Data.showAllTeachers();

    }
}
