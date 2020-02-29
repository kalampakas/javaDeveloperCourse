package org.pgi;

public class Main {

    public static void main(String[] args) {
	char myChar='D';
	char myUnicodeChar='\u0044';
        System.out.println(myChar + " " + myUnicodeChar);
        char myCopyright='\u00A9';
        System.out.println(myCopyright);

        boolean flag=true;
        boolean falseflag=false;
        System.out.println("flag is " + flag + " and falseflag is " + false);
        boolean isThisTrue=true;
        System.out.println("isThisTrue is "+ isThisTrue);
    }
}
