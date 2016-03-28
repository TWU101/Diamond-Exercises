package com.mm;

public class Main {

    public static void main(String[] args) {
        Drawer drawer = new Drawer();

        //Draw an Isosceles Triangle
        drawer.drawIsosTriangle(5);

        //Given a number n, print a centered diamond.
        drawer.drawDiamond(10);

        //Given a name, print a centered diamond around name
        drawer.drawNameDiamond(20, "Mauricio");
    }
}
