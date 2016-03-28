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

    public void drawVerticalLine(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("*");
        }
    }

    public void drawRightTriangle(int number) {
        for (int i = 1; i <= number + 1; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
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
}

