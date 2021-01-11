package ru.geekbrains.lesson5;

public class Staff {
    private String name;
    private String surname;
    private String patronymic;
    private String position;
    private String email;
    private String telephoneNumber;
    private int salary;
    private int age;

    public Staff(String name, String position, String email, String telephoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
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

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
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

    public void printInfo() {
        System.out.println("ФИО: " + name + "Должность: " + position + "e-mail: " + email + "телефон: " + telephoneNumber + " зарплата: " + salary + " возраст: " + age);
    }


    public static void main(String[] args) {
        Staff[] staffArray = new Staff[5];
        staffArray[0] = new Staff("Ivanov Ivan ", "Engineer ", "ivivan@mailbox.com ", "892312123 ", 30000, 30);
        staffArray[1] = new Staff("Harry Watts ", "Art critic ", "aojv@mail.ru ", "82679650244 ", 54000, 30);
        staffArray[2] = new Staff("Meredith  Moore ", "Endocrinologist ", "kggfpxw@yandex.ru ", "83026807023 ", 30000, 69);
        staffArray[3] = new Staff("Myra Garrett ", "Manager ", "f9jxjd14@gmail.com ", "86710435693 ", 69000, 45);
        staffArray[3] = new Staff("Sophie Neal ", "Driver ", "xl9bc5@gmail.com ", "85267441942 ", 90000, 32);
        staffArray[3] = new Staff("Alan Wilcox ", "Statistician ", "copaa6@gmail.com ", " 89042904894 ", 78000, 19);

        staffArray[3].printInfo();
         for 
    }


}

