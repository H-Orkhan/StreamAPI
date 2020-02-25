package application.FlatMap;

import java.util.List;

public  class  User {
    private  String name;
    private  int age = 30;
    private List<String > PhoneNumbers;

    public User(String name, int age, List<String> phoneNumbers) {
        this.name = name;
        this.age = age;
        PhoneNumbers = phoneNumbers;
    }

    public List<String> getPhoneNumbers() {
        return PhoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        PhoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public User(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
