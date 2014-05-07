package swordfish;

public class Main {

    public static void main(String[] args) {

        MarsRover marsRover = new MarsRover(new int[]{0, 0}, "N");
        String finalPosition = marsRover.start("MMM");
        System.out.println(finalPosition);

    }

}
