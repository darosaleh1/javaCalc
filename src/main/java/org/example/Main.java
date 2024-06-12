package org.example;
import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList; // import the ArrayList class
import java.util.HashMap; // import the HashMap class





public class Main {




    public static byte askRooms() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Welcome to the paint calculator, please answer the following" +
                "questions so we can understand your paint needs!");

        System.out.println("How many rooms would you like to paint?");

        byte numRooms = myObj.nextByte();  // Read user input
        System.out.println("rooms: " + numRooms);  // Output user input
        return numRooms;

    }
    public static byte askWalls(int roomNum) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("How many walls would you like to paint in room ?" + roomNum);

        byte numWalls = myObj.nextByte();  // Read user input
        System.out.println("walls: " + numWalls);  // Output user input
        return numWalls;

    }



    public static String askColour(int wallNum, int roomNum) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What colour would you like to paint wall" + wallNum + "in room " + roomNum );

        String wallColour = myObj.nextLine();  // Read user input
        System.out.println("Colour: " + wallColour);  // Output user input
        return wallColour;

    }

    public static float calculateArea(float height, float length) {
        return height*length;
    }



    public static float[] askDimensions() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is the height of the wall?");
        float wallHeight = myObj.nextInt();  // Read user input
        System.out.println("Height: " + wallHeight);  // Output user input

        System.out.println("What is the width of this wall?");
        float wallWidth = myObj.nextInt();  // Read user input
        System.out.println("Width: " + wallWidth);  // Output user input

        return new float[]{wallHeight, wallWidth};
    }

    public static float calculatePaintNeeded(float height, float length) {
        System.out.println(height);
        System.out.println(length);

        float area = calculateArea(height,length);

        return (area / 10);
    }


        public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        byte numRooms = askRooms();

        for (int i =0; i < numRooms ; ++i) {
            byte numWalls = askWalls(i+1);
            float totalRoomPaint = 0;


            for (int j = 0; j < numWalls; ++j) {
                float[] dimensions = askDimensions();
                float paintNeeded = calculatePaintNeeded(dimensions[0],dimensions[1]);
                System.out.println((paintNeeded));
                totalRoomPaint += paintNeeded;

            System.out.println("For room " + " " + (numRooms+1) + "the total paint you need is " + totalRoomPaint + " litres");
            System.out.println("For room " + " " + (numRooms+1) + "the total paint you need is " + totalRoomPaint + " litresdsadsadsdasdsd");






            }


        }



    }
}