package person;

public class information {
    public static void main(String[] args) {
        Person person = new Person(
                "male", "0293023923", "SV03", "SAIGON", 22, "HOANG");

        System.out.println("MSSV: "+ person.getMssv());
        System.out.println("Name: "+ person.getName());
        System.out.println("Age: "+ person.getTuoi());
        System.out.println("Gender: "+ person.getGender());
        System.out.println("Address: "+ person.getAddress());
        System.out.println("Phone: "+ person.getPhone());

    }

}
