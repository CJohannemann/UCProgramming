/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writemethods;

import static java.lang.Math.pow;
import java.util.Scanner;
import java.lang.*;

/**
 * @author cjohannemann
 */

public class WriteMethods {

    public static void main(String[] args) {

        System.out.println("Sphere Volume: " + sphereVolume(0));
        System.out.println("**********************************");

        System.out.println("Sphere Area: " + sphereSurface(0));
        System.out.println("**********************************");

        System.out.println("Cylinder Volume: " + cylinderVolume(0, 0));
        System.out.println("**********************************");

        System.out.println("Cylinder Area: " + cylinderSurface(0, 0));
        System.out.println("**********************************");

        System.out.println("Cone Volume: " + coneVolume(0, 0));
        System.out.println("**********************************");

        System.out.println("Cone Surface: " + coneSurface(0, 0));
    }

    private static double sphereVolume(double r) {
        System.out.println("Sphere Volume Radius = ");
        Scanner sV = new Scanner(System.in);
        r = sV.nextDouble();        
        double pi = 3.14159265359;
        double frac = 1.333333333333333333333333333333;//4/3;
        double spVol = (frac * pi * ((pow(r, 3))));
        return Math.round(spVol);
    }

    private static double sphereSurface(double r) {
        System.out.println("Sphere Surface Radius = ");
        Scanner sS = new Scanner(System.in);
        r = sS.nextDouble();
        double pi = 3.14159265359;
        double spSurf = (4 * pi * ((pow(r, 2))));
        return Math.round(spSurf);
    }

    private static double cylinderVolume(double r, double h) {
        //V=πr2h
        System.out.println("Cylinder Volume Radius = ");
        Scanner cR = new Scanner(System.in);
        r = cR.nextDouble();
        System.out.println("Cylinder Volume Height = ");
        Scanner cH = new Scanner(System.in);
        h = cH.nextDouble();
        double pi = 3.14159265359;
        double volume = pi * (pow(r, 2)) * h;
        return Math.round(volume);
    }

    private static double cylinderSurface(double r, double h) {
        //A=2πrh+2πr2
        System.out.println("Cylinder Volume Radius = ");
        Scanner cR = new Scanner(System.in);
        r = cR.nextDouble();
        System.out.println("Cylinder Volume Height = ");
        Scanner cH = new Scanner(System.in);
        h = cH.nextDouble();
        double pi = 3.14159265359;
        double side1 = 2 * pi * r * h;
        double side2 = 2 * pi * r * 2;
        double area = side1 + side2;

        return Math.round(area);
    }

    private static double coneVolume(double r, double h) {
        //V= π r 2 h/3
        System.out.println("Cone Volume Radius = ");
        Scanner cR = new Scanner(System.in);
        r = cR.nextDouble();
        System.out.println("Cone Volume Height = ");
        Scanner cH = new Scanner(System.in);
        h = cH.nextDouble();
        double pi = 3.14159265359;
        double volume = pi * r * 2 * h / 3;

        return Math.round(volume);
    }

    private static double coneSurface(double r, double h) {
        System.out.println("Cone Surface Radius = ");
        Scanner cR = new Scanner(System.in);
        r = cR.nextDouble();
        System.out.println("Cone Surface Height = ");
        Scanner cH = new Scanner(System.in);
        h = cH.nextDouble();
        double pi = 3.14159265359;
        double area = pi * r * (r + Math.sqrt(pow(h, 2) + pow(r, 2)));

        return Math.round(area);
    }

}
