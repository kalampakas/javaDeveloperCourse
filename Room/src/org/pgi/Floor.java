package org.pgi;

public class Floor {
    private Material material;
    private Dimensions area;

    public Floor(Material material, Dimensions area) {
        this.material = material;
        this.area=area;
    }

    public Material getMaterial() {
        return material;
    }

    public Dimensions getArea() {
        return area;
    }
}
