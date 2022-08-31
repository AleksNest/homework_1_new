package Cat;

import java.util.Arrays;
import java.util.List;

public class Cat {
    private String nickName;
    public static List<String> command = Arrays.asList("kis-kis", "run", "pet the cat", "wags its tail");

    public Cat(String nickName) {
        this.nickName = nickName;

    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }


    public void reactCat(String com) {
        if (com.contains(command.get(0))) {
            System.out.println(this.nickName + " " + command.get(1));
        } else if (com.contains(command.get(2))) {
            System.out.println(nickName + " " + command.get(3));
        } else {
            System.out.println("No answer");
        }

    }

    public String getnickName() {
        return nickName;
    }
}
