public class Student_2 {
    private String name = "John";
    private String Class = "C02";
    Student_2() {
    };

    public void setName(String name) {
        this.name = name;
        System.out.println(name + " is set to " + this.name);
    }
    public void setClass(String Class) {
        this.Class = Class;
        System.out.println(Class + " is set to " + this.Class);
    }
public class Main {
    public static void main(String[] args) {
        Student_2 student_2 = new Student_2();
        student_2.setClass("lan");
        student_2.setName("6A");
    }
}
}
