package GeoTree;

import java.util.ArrayList;

public class Printable {
    public Printable() {
    }

    void printPerson(ArrayList<Person> allPerson) {         // метод печати всех введенных людей
        for (Person person : allPerson) {
            System.out.println(person.getFullName());
        }
    }

    void printGeoTree(ArrayList<Node> tree) {               // метод печати всего дерева
        for (Node p : tree) {
            System.out.println(p.p1);
        }
    }

    static void printReserch(ArrayList<String> result, String name, Relationship relationship) {         // метод печати поиска по родственнику
        System.out.println(relationship + " " + name + " = " + result);
    }
}


