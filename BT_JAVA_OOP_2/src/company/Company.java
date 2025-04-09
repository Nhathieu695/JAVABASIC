package company;

import person.Person;

public class Company {
    public static void main(String[] args) {
        Person person = new Person(
                "male", "0293023923", "SV03", "SAIGON", 22, "HOANG");

        System.out.println("Name: "+ person.getName());
        System.out.println("Age: "+ person.getTuoi());
        System.out.println("Gender: "+ person.getGender());
    }
}
