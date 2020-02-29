package org.pgi;

public class Main {
    private static final String EINVAL="Invalid value";
    public static void main(String[] args) {
        System.out.println(getDurationString(167,42));
        System.out.println(getDurationString(4588));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65,9));
    }

    public static String getDurationString(int minutes, int seconds) {
        if(minutes>0 && (seconds >=0 && seconds<= 59)) {
            return ((minutes / 60)<10?"0"+minutes/60:minutes/60)
                    + "h "
                    +(minutes<10?"0"+minutes % 60:minutes%60)
                    +"m "
                    + ((seconds<10)?"0"+seconds:seconds)
                    +"s" ;
        }
        return EINVAL;
    }

    public static String getDurationString(int seconds){
        if(seconds>=0){
            return getDurationString(seconds / 60, seconds % 60);
        }
        return EINVAL;
    }
}
