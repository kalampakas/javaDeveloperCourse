package org.pgi;

public class Furniture {
    private Material material;
    private String name;
    private Dimensions size;

    public Furniture(Material material, String name, Dimensions size) {
        this.material = material;
        this.name = name;
        this.size = size;
    }

    public Material getMaterial() {
        System.out.println(material.getName()+material.getColor()+material.getHardness());
        return material;
    }

    public String getName() {
        return name;
    }

    public Dimensions getSize() {
        return size;
    }

    private Material changeMaterial(Material newMaterial) {
        return this.material=newMaterial;
    }

    public Furniture refurbish(Furniture item){
        changeMaterial(new Material("wood","hard","cherry red"));
        return this;
    }
}
