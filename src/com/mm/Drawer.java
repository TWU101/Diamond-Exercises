package com.mm;

public class Drawer {

    public void printOne() {
        System.out.println("*");
    }

    public void drawHorizontalStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }

    public void drawHorizontalSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    private void drawCenteredName(String name, int number){
        drawHorizontalSpaces((2*number-1)/2-(name.length()/2));
        System.out.println(name);
    }

    private void drawIsosTriangle(int number, int constant) {
        if (number != 1){
            drawIsosTriangle(number-1, constant);
        }
        drawHorizontalSpaces(Math.abs(number-constant));
        drawHorizontalStars(2*number-1);
        System.out.println();
    }

    public void drawIsosTriangle(int number) {
        drawIsosTriangle(number, number);
    }

    private void drawIsosTriangleInverted(int number, int constant) {

        drawHorizontalSpaces(Math.abs(number-constant));
        drawHorizontalStars(2*number-1);
        System.out.println();
        if (number != 1){
            drawIsosTriangleInverted(number-1, constant);
        }
    }

    public void drawIsosTriangleInverted(int number) {
        drawIsosTriangleInverted(number-1, number);
    }

    public void drawDiamond(int number) {
        drawIsosTriangle(number);
        drawIsosTriangleInverted(number);
    }


    public void drawNameDiamond(int number, String name) {
        int temp = 8;
        if (number > 8){
            temp = number;
        }

        drawIsosTriangle(number-1, temp);
        drawCenteredName(name, temp);
        drawIsosTriangleInverted(number-1, temp);
    }
}

