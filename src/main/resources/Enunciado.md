## class Student
Añadir los atributos:  
- **firstName**
- **secondName**
- **studentId**
- **enrollSubjectList**, es un listado de las asignaturas donde está matriculado

Inlcuir un método que añada asinaturas al listado de asignaturas matriculadas

---
## class Subject
Añadir los atributos:
- **name**
- **credits**

las clases deben tener sus:
- getter / setter / toString
- contructor vacío y otro con todos los atributos

---
## class Data
Creamos un atributo:
- **studenList**, listado de estudiantes

Debe tener los métodos:
- **addStudent(Student student)**, añadir estudiante a listado
- **showAllStudents()**, mostrar todos los estudiantes
- **showStudent(String studentId)**, mostrar un estudiante por su identificador 
- **showStudentByEnrollSubject(String subjectName)**, mostrar los estudiantes que se han matriculado de una asignatura concreta

---
Cambiamos el método **toString** de la **clase Student** para que los datos se muestren así:  
Ejemplo:  

Student Samuel Martín  
His subjects are:  
1. math  
2. data base  
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
1. Manolo García, studentId: 4568P
2. Josefa García, studentId: 4568Q
3. Matilda García, studentId: 4568A
4. Alex Rodríguez, studentId: 5432B
5. Javier Hernández, studentId: 8765K
6. Samuel Martín, studentId: 4321Z  

Las listas de asignaturas para cada alumno son:  
1. Manolo = math
2. Josefa = english
3. Matilda = english, computing
4. Alex = data base, java
5. Javier = java, html
6. Samuel = math, data base, computing  

crearlas y añadirlas a cada alumno

---
## class Teacher
Añadir los atributos:
- **firstName**
- **secondName**
- **teachedSubjectList**, es un listado de las asignaturas que immparte  

---

En la **class Main** creamos los siguientes profesores:  
1. Antonio Fernández, math
2. Jennifer Sunder, english
3. Juan Navarro, compunting
4. Miguel Hernández, data base
5. María José Hernández, java, hmtl  

---

En la **class Data** creamos:  
Un nuevo atributo llamado:
- **teachList**, que será un listado de profesores, atributo estático.  
añadimos los siguientes métodos a esta clase: 
- **addTeacher(Teacher teacher)**, para añadir al altributo anterior
- **showAllTeachers()** , muestra a cada profesor y su listado de asignaturas  
para mostrar el listado anterior usamos el mismo formaquto que con los estudiantes:  

 Ejemplo:

Teacher María José  
His subjects are:
1. java
2. html  

---

Implementar código que a partir de ahora muestre un Student, no sólo los datos del Student y las Subjects en las que está matriculado, 
sino además debe aparecer al lado de cada asignatura el nombre del profesor que la imparte.  

Ejemplo:  
Student Samuel Martín  
His subjects are:
1. math impartida por Antonio
2. data base impartida por Miguel
3. computing impartida por Juan 
----


Vamos a mejorar el código relacionado con la **class Student**, ya que ahora mismo cuando añadimos
a un **student** las asignaturas que quiere estudiar, el código nos permite poder añadir más de una vez una asignatura repetida y no pasaría nada.  
Así que el método **addSubject(Subject subject)** debería tener un código que antes de añadir una **subject** al **private List<Subject> enrollSubjectList**, buscar si ya existe dicha asignatura para que no se pueda añadir y sino existe en el listado de subjects entonces si la puede añadir.

---
Para continuar ampliando el desarrollo de esta aplicación, vamos a implementar
todo lo relacionado con notas, exámenes y ese tipo de cosas.
Empezaremos poco a poco e iremos avanzando.  
El primer paso será crear la **class Exam**  
Recordemos que cuando creamos una clase es una maqueta de cómo
serán los objetos, instancias individualmente.  
En principio para esta clase necesitarmos los siguientes atributos:  

- **dateTime**
- **subject**  

De momento añadimos la fecha de cuando se produce el exámen y de que asignatura es.
Si crees que esta clase debería tener algún atributo más, añádele un máximo de dos más y lo comentamos  

---

Modificamos el método **toString()** de la **class Student** para que me muestre el listado de exámenes que ha realizado el alumno.  
Ahora debería quedar así:  

Ejemplo:  
Student Samuel Martín  
His subjects are:
1. math impartida por Antonio
2. data base impartida por Miguel
3. computing impartida por Juan

Examns:
1. math 5/10/2021 las 8:00, nota: 10 puntos
----

