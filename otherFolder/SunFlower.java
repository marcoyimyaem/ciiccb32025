package otherFolder;

import chapter4.AccessModifier;

public class SunFlower extends AccessModifier {

     public static void main(String[] args) {
        AccessModifier acm1 = new AccessModifier();
        SunFlower sf = new SunFlower();
        acm1.greetMe();
        // acm1.greetMe2();
        sf.greetMe3();
        // acm1.greetMe4();
     }
}
