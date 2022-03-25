package com.project;

class Points {
    int x1;
    int y1;
    int x2;
    int y2;

    public Points(int x1, int y1, int x2, int y2) {
        super();
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

}

public class LineComparisionComputation {

    public static void main(String[] args) {
        System.out.println("Welcome to Line\r\n" + "Comparison Computation\r\n" + "Program on Master Branch");
        Points points_1 = new Points(1, 2, 5, 8);
        Points points_2 = new Points(1, 2, 3, 4);
        LineComparisionComputation lineComp = new LineComparisionComputation();
        int line1Length = lineComp.lineLengthCal(points_1.x1, points_1.x2, points_1.y1, points_1.y2);
        int line2Length = lineComp.lineLengthCal(points_2.x1, points_2.x2, points_2.y1, points_2.y2);
        lineComp.compareTo(line1Length, line2Length);

    }

    public int lineLengthCal(int x1, int y1, int x2, int y2) {
        int lineLength = (int) Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        return lineLength;
    }

    public void equalityCheck(int line1Length, int line2Length) {
        if (line1Length == line2Length) {
            System.out.println("Two lines are equal");
        } else {
            System.out.println("Two lines are not equal");
        }
    }

    public void compareTo(int line1Length, int line2Length) {
        if (line1Length == line2Length) {
            System.out.println("Line 1 is equal to Line 2");
        } else if (line1Length > line2Length) {
            System.out.println("Line 1 is greater than to Line 2");
        } else {
            System.out.println("Line 2 is greater than to Line 1");
        }
    }

}
