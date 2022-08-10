import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // zadanie 1

        Person person = new PersonBuilder()
                .firstName("Stepan")
                .lastName("Jeronin")
                .middleName("Olegovich")
                .country("Eesti")
                .address("Narva")
                .phone("+732 55-911-99")
                .age(35)
                .gender("Male")
                .build();
        System.out.println(person);

        //zadanie 2

        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(new Circle());
        figures.add(new Square());
        figures.add(new Triangle());
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
