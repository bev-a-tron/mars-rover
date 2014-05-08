package swordfish;

public class Main {

    public static void main(String[] args) {

        App app = new App();

        String data = "5 5\n1 2 N\nLMLMLMLMM\n3 3 E\nMMRMMRMRRM";

        String finalPosition = app.start(data);

        System.out.println(finalPosition);
    }

}
