package lesson5;

public class Debtors {

    private String fio;
    private String position;
    private String email;
    private String fonNumber;
    private int salary;
    private int age;


    public Debtors(String fio, String position, String email, String fonNumber, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.fonNumber = fonNumber;
        this.salary = salary;
        this.age = age;
    }


    public Debtors() {
        this("ФИО","должность","Email","foneNumber",10000,18);

    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFonNumber() {
        return fonNumber;
    }

    public void setFonNumber(String fonNumber) {
        this.fonNumber = fonNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void info() {
        System.out.printf("%s %c %s %c %s %c %s %c %d %c %d\n", fio,'|', position,'|', email,'|', fonNumber,'|', salary,'|', age);
    }

    public void addInfo(String fio, String position, String email, String fonNumber, int salary, int age) {
        setFio(fio);
        setPosition(position);
        setEmail(email);
        setFonNumber(fonNumber);
        setSalary(salary);
        setAge(age);
    }


}


