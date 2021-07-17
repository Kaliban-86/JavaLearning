package Enumeration;

public class TestEnum {
    public static void main(String[] args) {
        Animal animal = Animal.FROG;

        switch (animal){
            case CAT -> System.out.println("It is a CAT");
            case DOG -> System.out.println("It is a DOG");
            case FROG -> System.out.println("It is a FROG");
            default -> System.out.println("It is nit animal!!!!");
        }

        People people = People.TOM;
        System.out.println(people.getAge()); // метод из enuma
        System.out.println(people.name());// штатный метод
        System.out.println(people.getClass());//штатный метод

        People people1 = People.valueOf("BOB");//штатный метод

        System.out.println(people1.getAge());

        People people2 = People.SAM;

        System.out.println(people2); // toString  переопределен


    }
}
