package com.company.shapesVolume;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShapesVolumeMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String[] params = reader.readLine().split("\\s+");
            if (params[0].equals("End")){
                break;
            }

            String type = params[0];
            double result = 0.0;
            switch (type){
                case "Cube":
                    double side = Double.parseDouble(params[1]);
                    result = VolumeCalculator.calcCubeVolume(new Cube(side));
                    break;

                case "Cylinder":
                    double radius = Double.parseDouble(params[1]);
                    double cHeight = Double.parseDouble(params[2]);
                    result = VolumeCalculator.calcCylinderVolume(new Cylinder(radius, cHeight));
                    break;

                case "TrianglePrism":
                    double baseSide = Double.parseDouble(params[1]);
                    double tHeight = Double.parseDouble(params[2]);
                    double length = Double.parseDouble(params[3]);
                    result = VolumeCalculator.calcTriangularPrismVolume(new TriangularPrism(baseSide, tHeight, length));
                    break;
            }

            System.out.printf("%.3f%n", result);
        }
    }
}
