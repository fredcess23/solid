package com.nearsoft.apprentice.ocp.bad;

import java.util.List;

public class Painter {

    void drawSquare(Square square) {
        System.out.println("Drawing a square");
    }

    void drawCircle(Circle circle) {
        System.out.println("Drawing a circle");
    }

    void drawAllShapes(List<Shape> shapes) {
        for (Shape shape : shapes) {
            switch (shape.type) {
                case "Square":
                    drawSquare((Square) shape);
                    break;
                case "Circle":
                    drawCircle((Circle) shape);
                    break;
            }
        }
    }
}
