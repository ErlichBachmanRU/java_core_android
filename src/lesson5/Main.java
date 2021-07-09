package lesson5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Debtors person1 = new Debtors();
        Debtors person2 = new Debtors();
        Debtors person3 = new Debtors();
        Debtors person4 = new Debtors();
        Debtors person5 = new Debtors();

        person1.addInfo("Ivanov Ivan","Engineer","ivivan@mailbox.com","9283251510",1000,35);
        person2.addInfo("Petrov Sergei","Seller","petrov@mailbox.com","9283251511",800,42);
        person3.addInfo("Sidorov Jon","cashier","sidorov@mailbox.com","9283251512",800,28);
        person4.addInfo("Sergeeva Tatyana","auditor","sergeeva@mailbox.com","9283251513",1200,45);
        person5.addInfo("Shmakov Ilya","security","shmakov@mailbox.com","9283251000",500,33);

        person1.info();
        person2.info();
        person3.info();
        person4.info();
        person5.info();

        Debtors[] persArray = new Debtors[5];
        persArray[0] = new Debtors("Ivanov Ivan","Engineer","ivivan@mailbox.com","9283251510",1000,35);
        persArray[1] = new Debtors("Petrov Sergei","Seller","petrov@mailbox.com","9283251511",800,42);
        persArray[2] = new Debtors("Sidorov Jon","cashier","sidorov@mailbox.com","9283251512",800,28);
        persArray[3] = new Debtors("Sergeeva Tatyana","auditor","sergeeva@mailbox.com","9283251513",1200,45);
        persArray[4] = new Debtors("Shmakov Ilya","security","shmakov@mailbox.com","9283251000",500,33);

        int x = 0;
        for (int i = 0; i < persArray.length; i++) {
            x = persArray[i].getAge();
            if(x >= 40) {
                System.out.printf("%s %s\n","сотруднику уже за 40 :",persArray[i].getFio());
            }
        }

    }


}

