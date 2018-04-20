package com.DSWTEC;

import com.DSWTEC.CoffeePackage.*;
import com.DSWTEC.SwordPackage.*;

public class Main {

    public static void main(String[] args) {

	    // Coffee Decorator Test

        Coffee c = new SimpleCoffee();
        c.attributes();

        c = new WithMilk(c);
        c.attributes();

        c = new WithAmaretto(c);
        c.attributes();

        // New line

        System.out.println();

        // Sword Decorator Test

        Sword commonSword = new CommonSword("Common Sword");
        commonSword.attributes();

        Sword excalibur = new ExcaliburSword(commonSword);
        excalibur.attributes();

    }

}
