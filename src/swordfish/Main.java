package swordfish;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        String fileName = "/Users/balau/Beach/MarsRover/src/swordfish/data.txt";

        String data = FileReader.read(fileName);

        App app = new App(data);

        List finalPositions = app.start();

        for (Object position : finalPositions) {
            System.out.println(position);
        }
    }


}
