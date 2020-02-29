package org.pgi;

public class Ceiling {
    private Material material;
    private Dimensions size;
    private int lighting;

    public Ceiling(Material material, Dimensions size, int lighting) {
        this.material = material;
        this.size = size;
        this.lighting = lighting;
    }

    public Material getMaterial() {
        return material;
    }

    public Dimensions getSize() {
        return size;
    }

    public int getLighting() {
        return lighting;
    }

    public void paintCeiling(Material paint) {
        this.material=paint;
    }

    public void illuminate(boolean light){
        if (light) this.lighting = 10;
        else this.lighting = 0;
    }
}
