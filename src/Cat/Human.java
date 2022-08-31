package Cat;

import java.util.Arrays;
import java.util.List;

public class Human {
    private String name;
    public static List<String> command = Arrays.asList("kis-kis", "cat run", "pet the cat", "wags its tail");

    public Human(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void reactHuman(String com) {
        if (com.contains(command.get(1))) {
            System.out.println(this.name + " " + command.get(0));
        } else if (com.contains(command.get(3))) {
            System.out.println(name + " " + command.get(2));
        } else {
            System.out.println("No answer");
        }

    }


    public String getName() {
        return name;
    }
}






