package swordfish;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        String data = "5 5\n1 2 N\nLMLMLMLMM\n3 3 E\nMMRMMRMRRM";
        App app = new App(data);

        List<String> finalPosition = app.start();

        System.out.println(finalPosition.get(0));
    }

}
