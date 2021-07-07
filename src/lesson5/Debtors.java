package lesson5;

public class Debtors {
    private String fio;
    private String position;
    private String email;
    private String fonNumber;
    private int salary;
    private int age;

    public Debtors(String fio, String position,String email,String fonNumber,int salary,int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.fonNumber = fonNumber;
        this.salary = salary;
        this.age = age;

    }

    public Debtors(String fio) {
        this.fio = "ФИО";
        this.position = "должность";
        this.email = "email";
        this.fonNumber = "78008008080";
        this.salary = 10000;
        this.age = 18;

    }

    public void info() {
        System.out.printf("%s %s %s %s %d %d", fio, position,email,fonNumber,salary,age);
    }


}


