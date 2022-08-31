package pedigree;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Person firstPerson = new Person(Person.Relatives.ROOT, "Ivanov Ivan Ivanovich");       // создали человека
        Person secondPerson = new Person(Person.Relatives.ROOT, "Petrov petr Petrovich");
        Person thirdPerson = new Person(Person.Relatives.ROOT, "Vasilev Vasiliy Vasilievich");

        firstPerson.appendToRelatives(Person.Relatives.FATHER, firstPerson);       // добавили в семью
        secondPerson.appendToRelatives(Person.Relatives.GRANDFATHER, secondPerson);
        thirdPerson.appendToRelatives(Person.Relatives.MOTHER, thirdPerson);
        firstPerson.appendToRelatives(Person.Relatives.MOTHER, firstPerson);
        secondPerson.appendToRelatives(Person.Relatives.MOTHER, secondPerson);
        firstPerson.deleteToRelatives(Person.Relatives.FATHER, firstPerson);


        view(firstPerson);
        System.out.println("------------------------------");
        view(secondPerson);
        System.out.println("------------------------------");
        view(thirdPerson);
    }

    static void view(Person rootPerson) {                    // метод отображения дерева семьи


        System.out.println(rootPerson.getFullName());            // человек корень
        for (Map.Entry<Person.Relatives, Person> p : rootPerson.getRelatives().entrySet()) {

            if (p.getValue().equals(rootPerson)) {
                System.out.println(p.getKey() + " " + p.getValue());
            }


        }
    }

}