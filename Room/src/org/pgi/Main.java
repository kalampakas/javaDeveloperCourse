package org.pgi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Room kitchen=new Room(new Dimensions(3,4,3), "Kitchen",
                new Floor(new Material("marble","hard","white"), new Dimensions(2,3)),
                new Ceiling(new Material("gypsum","semi-hard","white"),new Dimensions(3,4),5),
                new Windows[]{new Windows(true,new Dimensions(0.6,0.6)),new Windows(false,new Dimensions(0.3,0.3))},
                new Furniture[]{new Furniture(new Material("wood","soft","brown"),"chair0",new Dimensions(0.5,0.5))});


        System.out.println("Second window insulation: "+kitchen.getWindows()[1].isInsulated());
        System.out.println("Material of chair0:"+kitchen.getFurniture()[0].getMaterial());
        System.out.println("Refurbish chair0");
        kitchen.getFurniture()[0].refurbish(kitchen.getFurniture()[0]);
        System.out.println("After refurbishment:"+kitchen.getFurniture()[0].getMaterial());

    }

}
