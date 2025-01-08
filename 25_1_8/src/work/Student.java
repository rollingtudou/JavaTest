package work;

public class Student extends Person {
    private String number;
    private String clazz;
    private String major;

    public Student(String name, String sex, int age, String number, String clazz, String major) {
        super(name, sex, age);
        this.number = number;
        this.clazz = clazz;
        this.major = major;
    }

    public void sayHello() {
        System.out.println("大家好，我叫 " + getName() + "，学号是 " + number + "，我在 " + clazz + " 班学习 " + major + " 专业。");
    }

    // Getter 和 Setter 方法
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public static void main(String[] args) {
        Student stu = new Student("王刚","男",21,"12321","1231","math");
        stu.sayHello();
    }
}