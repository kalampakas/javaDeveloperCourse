package org.pgi;

public class Material {
    private String name;
    private String hardness;
    private String color;

    public Material(String name, String hardness, String color) {
        this.name = name;
        this.hardness = hardness;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getHardness() {
        return hardness;
    }

    public String getColor() {
        return color;
    }
}
