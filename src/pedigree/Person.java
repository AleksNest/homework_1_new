package pedigree;

import java.util.HashMap;
import java.util.Map;

public class Person {
    private String fullName;
    private Relatives relative;
    private Map<Relatives, Person> relatives = new HashMap<>();     // связь родственник - человек


    public Person(Relatives relative, String fullname) {                 // конструктор
        this.fullName = fullname;
        this.relative = relative;
    }

    public void appendToRelatives(Relatives relative, Person person) {
        relatives.put(relative, person);                                    // метод добавления родственника
    }

    public Map<Relatives, Person> getRelatives() {
        return relatives;
    }

//    public void appendToFamily(Person person) {
//        if (person != null && person != this)
//            family.add(person);
//    }

    public void deleteToRelatives(Relatives relative, Person person) { // метод удаления родственника
        relatives.remove(relative, person);
    }


    public String getFullName() {
        return fullName;
    }

    @Override                                           // переопределили встроенный метод toString
    public String toString() {
        return fullName;
    }

    enum Relatives {
        ROOT,
        MOTHER,
        FATHER,
        GRANDFATHER,
        GRANDMOTHER,
        BROTHER,
        SISTER,
        SON,
        DAUGHTER;


    }
}
