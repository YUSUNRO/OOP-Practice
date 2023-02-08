package JavaBasic;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("노유선", 29);
        String eateat = person.eat("치킨");
        System.out.println(eateat);

        Student s = new Student("김학생", 25);
        String e = s.eat("볶음밥");
        System.out.println(e);
    }
}