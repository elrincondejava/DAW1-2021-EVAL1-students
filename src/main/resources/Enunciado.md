## Clase Student
Añadir los atributos:
- **firstName**
- **secondName**
- **studentId**
- **enrollSubjectList**, es un listado de las asignaturas donde está matriculado

Inlcuir un método que añada asinaturas al listado de asignaturas matriculadas

---
## Clase Subject
Añadir los atributos:
- **name**
- **credits**

las clases deben tener sus:
- getter / setter / toString
- contructor vacío y otro con todos los atributos

---
## Clase Data
Creamos un atributo:
- **studenList**, listado de estudiantes

Debe tener los métodos:
- **addStudent(Student student)**, añadir estudiante a listado
- **showAllStudents()**, mostrar todos los estudiantes
- **showStudent(String studentId)**, mostrar un estudiante por su identificador 
- **showStudentByEnrollSubject(String subjectName)**, mostrar los estudiantes que se han matriculado de una asignatura concreta

---
Cambiamos el método **toString** de la **clase Student** para que los datos se muestren así:  
Student Manolo García  
His subjects are:  
1. math  
2. english  
3. computing  

---
En la ***class Main**  
Creamos 6 asignaturas con los siguientes datos:
1. math, 50 credis
2. english, 80 credits
3. computing, 30 credits
4. data base, 60 credits
5. java, 90 credits
6. html, 40 credits

También creamos 6 estudiantes:  
1. Manolo García, dni: 4568P
2. Josefa García, dni: 4568Q
3. Matilda García, dni: 4568A
4. Alex Rodríguez, dni: 5432B
5. Javier Hernández, dni: 8765K
6. Samuel Martín, dni: 4321Z  

Las listas de asignaturas para cada alumno son:  
1. Manolo = math
2. Josefa = english
3. Matilda = english, computing
4. Alex = data base, java
5. Javier = java, html
6. Samuel = math, data base, computing  

crearlas y añadirlas a cada alumno