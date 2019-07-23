import java.util.*;
public class Main {

    public static void Display(String message, ArrayList<Student> students) //method displays list with message
    {
        System.out.println(message);
        for (int i = 0; i < students.size(); i++)
        {
            System.out.println(students.get(i).toString());
        }
        System.out.println("-----------------------");
    }

    public static ArrayList<Student> createFacultyList(Student allStudents[], String faculty) //method creates list of special faculty
    {
        ArrayList<Student>facultyList = new ArrayList<>();
        for (int i = 0; i < allStudents.length; i++) {
            if (allStudents[i].getFaculty() == faculty)
            {
                facultyList.add(allStudents[i]);
            }
        }
        return facultyList;
    }

    public static ArrayList<Student> createListOfAllFacultyAndCourse(Student allStudents[]) //method creates list with all students that have faculty or course
    {
        ArrayList<Student>facultyAndCourseList = new ArrayList<>();
        for (int i = 0; i < allStudents.length; i++) {
            if (allStudents[i].getFaculty() != null && allStudents[i].getCourse() != 0)
            {
                facultyAndCourseList.add(allStudents[i]);
            }
        }
        return facultyAndCourseList;
    }

    public static ArrayList<Student> createListElderThan(Student allStudents[], int year) //method creates list of students that were born after special year
    {
        ArrayList<Student>list = new ArrayList<>();
        for (int i = 0; i < allStudents.length; i++) {
            if (allStudents[i].getBirthday() !=null && allStudents[i].getBirthday().get(Calendar.YEAR) > year)
            {
                    list.add(allStudents[i]);
            }else continue;
        }
        return list;
    }

    public static ArrayList<Student> createGroupList(Student allStudents[], String group) //method creates list of students with the same group
    {
        ArrayList<Student>groupList = new ArrayList<>();
        for (int i = 0; i < allStudents.length; i++) {
            if (allStudents[i].getGroup() == group)
            {
                groupList.add(allStudents[i]);
            }
        }
        return groupList;
    }

    public static void main(String[] args) {
        Student student = new Student(111, "Dadly", "Jone", "MATH", 2, "MT-25");
        Student student1 = new Student(222, "Marty", "Bob", new GregorianCalendar(2000,Calendar.APRIL,21), "067-000-0000");
        Student student2 = new Student(333, "McHut", "Kate", "KN", 4, "KN-234");
        Student student3 = new Student(444, "Doply", "Angela", "MATH", 1, "MT-11");
        Student student4 = new Student(555, "Surrob", "Robby", "KN", 4, "KN-234");
        Student student5 = new Student(666, "Grandle", "Jane", "MATH", 1, "MT-11");
        Student student6 = new Student(777, "Kurt", "Andrew", "MATH", 2, "MT-25");
        Student student7 = new Student(888, "Pop", "Lolly", "KN", 3, "KN-321");
        Student student8 = new Student(999, "Dan");
        Student student9 = new Student(101010, "Guddy", "Clar", new GregorianCalendar(2017,Calendar.MAY,11), "067-111-0101");

        Student allStudents[] = new Student[]{student, student1, student2, student3, student4, student5, student6, student7, student8, student9};
        ArrayList<Student>facultyMath = createFacultyList(allStudents, "MATH");
        ArrayList<Student>facultyAndCourseList = createListOfAllFacultyAndCourse(allStudents);
        ArrayList<Student>listWithElderThan = createListElderThan(allStudents, 2015);
        ArrayList<Student> groupList = createGroupList(allStudents, "KN-234");

        Display("Students from MATH faculty", facultyMath);
        Display("Students which have faculty and course", facultyAndCourseList);
        Display("Students that was born after 2015", listWithElderThan);
        Display("Students from group KN-234", groupList);

    }
}
