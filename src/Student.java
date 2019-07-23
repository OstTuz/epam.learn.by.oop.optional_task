import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;


public class Student {
    int id;                             //student's id
    String surname;                     //student's surname
    String name;                        //student's name
    String fatherName;                  //student's father name
    GregorianCalendar birthday;         //student's birthday
    String address;                     //student's address
    String phone;                       //contact phone
    String faculty;                     //student's faculty
    int course;                         //student's course
    String group;                       //student's group


    public Student(int id, String name) {       //constructors
        this.id = id;
        this.name = name;
    }

    public Student(int id, String surname, String name, GregorianCalendar birthday, String phone) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.birthday = birthday;
        this.phone = phone;
    }

    public Student(int id, String surname, String name, String faculty, int course, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student(int id, String surname, String name, String fatherName, GregorianCalendar birthday, String address, String phone, String faculty, int course, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.fatherName = fatherName;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }


    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public GregorianCalendar getBirthday() { return birthday; }

    public void setBirthday(GregorianCalendar birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

    @Override
    public String toString() {
            if (birthday != null)
            {
                return  id +
                        " " + surname +
                        " " + name +
                        " " + fatherName +
                        " " + simpleDateFormat.format((Date)birthday.getTime())+
                        " " + address +
                        " " + phone +
                        " " + faculty +
                        " " + course +
                        " " + group;
            }else
            {
                return  id +
                        " " + surname +
                        " " + name +
                        " " + fatherName +
                        " " + address +
                        " " + phone +
                        " " + faculty +
                        " " + course +
                        " " + group;
            }
    }

}

