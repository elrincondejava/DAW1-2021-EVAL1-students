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


        // CREATING SUBJECTS LIST FOR TEACHERS
        List<Subject> subjectListAntonio = new ArrayList<>();
        List<Subject> subjectListJennifer = new ArrayList<>();
        List<Subject> subjectListJuan = new ArrayList<>();
        List<Subject> subjectListMiguel = new ArrayList<>();
        List<Subject> subjectListMariajo = new ArrayList<>();


        // ADD SUBJECTS TO TEACHER SUBJECTS LIST

        //TODO Aquí faltaba añadir a los listados de asignatura de los profesores las asignaturas que va a impartir sólo teníamos las de los alumnos

        subjectListAntonio.add(math);
        subjectListJennifer.add(english);
        subjectListJuan.add(computing);
        subjectListMiguel.add(dataBase);
        subjectListMariajo.add(java);
        subjectListMariajo.add(html);


        // CREATING STUDENTS WITH THEIR SUBJECTS LIST
        Student manolo = new Student("Manolo", "García", "4568P");
        Student josefa = new Student("Josefa", "García", "4568Q");
        Student matilda = new Student("Matilda", "García", "4568A");
        Student alex = new Student("Alex", "Martel", "5432B");
        Student javier = new Student("Javier", "Hernández", "8765K");
        Student samuel = new Student("Samuel", "Martín", "4321Z");

        // ADD SUBJECTS TO STUDENT SUBJECTS LIST
        manolo.addSubject(math);
        manolo.addSubject(math);//repetida
        josefa.addSubject(english);
        matilda.addSubject(computing);
        matilda.addSubject(english);
        alex.addSubject(dataBase);
        alex.addSubject(java);
        javier.addSubject(java);
        javier.addSubject(html);
        samuel.addSubject(math);
        samuel.addSubject(dataBase);
        samuel.addSubject(computing);
        samuel.addSubject(computing);//repetida


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
        Data.showAllStudents();
        // Data.showStudent("4568P");
        // Data.showStudentByEnrollSubject("english");
        //Data.showAllTeachers();
        //Data.showMatriculationStudent(josefa);

        //USING METHODS OF Student CLASS


        //System.out.println(alex.getStudentsCredits());

    }
}
