package model;

public class Student {
    public int age;
    public String name;
    public int sex;
    public int studentId;

    public Student(int age, String name, int sex, int studentId) {
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.studentId = studentId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", studentId=" + studentId +
                '}';
    }
}
