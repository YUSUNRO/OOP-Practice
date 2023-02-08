package JavaBasic;

public class Person {
    String name;
    int age;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String eat (String food) {
        String result = food + "을(를) 먹습니다.";
        return result;
    }

}
