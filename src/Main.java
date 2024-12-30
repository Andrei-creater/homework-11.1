class Person {
    private String name;
    private int age;
    private String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void setProfession(String newProfession) {
        this.profession = newProfession;
    }

    public void displayInfo() {
        System.out.println("Ім'я: " + name + ", Вік: " + age + ", Професія: " + profession);
    }
}

public class Main {
    public static void main(String[] args) {
        // Створення об'єктів класу Person
        Person person1 = new Person("John", 30, "Інженер");
        Person person2 = new Person("Mary", 25, "Вчитель");
        Person person3 = new Person("Bob", 35, "Лікар");

        System.out.println("1. Початкова інформація про осіб:");
        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();

        Person person4 = new Person("Alice", 28, "Архітектор");
        System.out.println("\n2. Ім'я: Alice, Вік: 28, Професія: Архітектор");
        System.out.println("   (Після оновлення професії)");

        person4.setProfession("Дизайнер");
        person4.displayInfo();
    }
}
