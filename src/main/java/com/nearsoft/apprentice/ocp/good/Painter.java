package com.nearsoft.apprentice.ocp.good;

import java.util.List;

public class Painter {

    public void drawAllShapes(List<Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
