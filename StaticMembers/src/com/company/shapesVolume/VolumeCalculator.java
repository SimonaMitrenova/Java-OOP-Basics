package com.company.shapesVolume;

public class VolumeCalculator {
    public static double calcCubeVolume(Cube cube){
        return cube.getSide() * cube.getSide() * cube.getSide();
    }

    public static double calcCylinderVolume(Cylinder cylinder){
        return Math.PI * cylinder.getRadius() * cylinder.getRadius() * cylinder.getHeight();
    }

    public static double calcTriangularPrismVolume(TriangularPrism triangularPrism){
        return (triangularPrism.getBaseSide() * triangularPrism.getLength() * triangularPrism.getHeight()) / 2.0;
    }
}
