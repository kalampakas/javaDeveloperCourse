package org.pgi;

public class Main {

    public static void main(String[] args) {
	int value = 3;
	if(value == 1) {
        System.out.println("value was 1");
    } else if (value ==2) {
        System.out.println("value was 2");
    } else {
        System.out.println("was not 1 or 2");
    }

	int switchValue = 3;
	switch(switchValue) {
        case 1:
            System.out.println("SwitchValue was 1");
            break;
        case 2:
            System.out.println("SwitchValue was 2");
            break;
        case 3: case 4: case 5:
            System.out.println("SwitchValue was 3 or 4 or 5");
            System.out.println("it was actually a "+ switchValue);
            break;
        default:
            System.out.println("Not 1, 2 or 3 or 4 or 5");
            break;
    }

    char key = 'B';
	switch(key) {
        case 'A': case'B': case'C': case'D': case'E':
            System.out.println("Found valid key"+key);
            break;
        default:
            System.out.println("valid key not found");
    }

    String month = "January";
	switch(month.toLowerCase()) {
        case "january":
            System.out.println("Jan");
            break;
        case "february":
            System.out.println("Feb");
            break;
        default:
            System.out.println("not sure");
    }
    }
}
