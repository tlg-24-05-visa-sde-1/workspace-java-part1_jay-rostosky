package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

/*
 * Main-class to create a few instances of Television and give them a test-drive.
 */
class TelevisionClient {

    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances have been created");
        System.out.println();

        // create a Television object and set its properties
        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(32);
        tv1.setDisplay(DisplayType.PLASMA);

        // create a 2nd instance of Television using the brand-volume ctor
        Television tv2 = new Television("Sony", Television.MAX_VOLUME, DisplayType.OLED);

        // create a 3rd instance using the brand-only ctor
        Television tv3 = new Television("LG");  // LED by default

        // call some business methods on them, i.e., turn them "on" and "off"
        tv1.turnOn();
        tv2.turnOn();
        tv3.turnOn();
        System.out.println();

        tv1.turnOff();
        tv2.turnOff();
        tv3.turnOff();
        System.out.println();

        // show their toString() methods in action
        System.out.println(tv1.toString());
        System.out.println(tv2);  // toString() automatically called
        System.out.println(tv3);
        System.out.println();

        System.out.println(Television.getInstanceCount() + " instances have been created");
    }
}