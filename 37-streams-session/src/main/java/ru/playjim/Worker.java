package ru.playjim;

public class Worker {
    private String name;
    private String surname;
    private Sex sex;
    private int age;
    private String profession;
    private String workTown;

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                ", workTown='" + workTown + '\'' +
                '}';
    }

    public Worker() {
    }

    public Worker(String name, String surname, Sex sex, int age, String profession, String workTown) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
        this.profession = profession;
        this.workTown = workTown;
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

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getWorkTown() {
        return workTown;
    }

    public void setWorkTown(String workTown) {
        this.workTown = workTown;
    }
}
