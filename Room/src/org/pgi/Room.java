package org.pgi;

import java.awt.*;

public class Room {
    private Dimensions size;
    private String name;
    private Floor floor;
    private Ceiling ceiling;
    private Windows[] windows;
    private Furniture[] Furniture;

    public Room(Dimensions size, String name, Floor floor, Ceiling ceiling, Windows[] window, org.pgi.Furniture[] furniture) {
        this.size = size;
        this.name = name;
        this.floor = floor;
        this.ceiling = ceiling;
        this.windows = window;
        Furniture = furniture;
    }

    public Dimensions getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public Floor getFloor() {
        return floor;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Windows[] getWindows() {
        return windows;
    }

    public org.pgi.Furniture[] getFurniture() {
        return Furniture;
    }
}
