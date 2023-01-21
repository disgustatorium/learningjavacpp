public class Questions {

    public void question1() {

        // loops 10 times
        for (int counter = 0; counter < 10; counter++) {

            // generates a number between 1 and 6
            int i = (int)(6 * Math.random() + 1); // plus 1 so no 0 value
            System.out.println(i);

        }

    }

    public void question2() {

        // loops forever
        for (int counter = 1; counter > 0; counter++) {

            // generates a number between 1 and 20
            int i = (int)(20 * Math.random() + 1); // plus 1 so no 0 value
            System.out.println(i);

            // if it rolls a 20, exits loop
            if (i == 20) {

                break;

            }

        }

    }

    public void question3() {

        double a = 7.5;
        double b = 5.25;
        double c = 1.25;

        double qa = (a + ((int)b/(int)c));
        double qb = ((a + b) / c);
        double qc = (a + (b/c));
        double qd = ( (int)a + (b/c));
        double qe = ( a + ( (int) b/c));
        
        
        System.out.println("a. " + qa);
        System.out.println("b. " + qb);
        System.out.println("c. " + qc);
        System.out.println("d. " + qd);
        System.out.println("e. " + qe);

    }

    public void question4() {

        System.out.println(10+2+3);
        System.out.println("10"+2+3);
        System.out.println("10"+(2+3));
        System.out.println("10"+'2'+'3');

        System.out.println("10"+('2'+'3')); 
        /* The parentheses take precedence, so '2'+'3' is performed first. Adding
        two char values performs integer addition not string concatenation because
        in expressions, integral types smaller than int are promoted to int before
        evaluating the operator. The numeric value of the character '2' is 50 (or
        0x32 in hexadecimal) and the numeric value of the character '3' is 51 (or
        0x33 in hexadecimal), so '2'+'3' evaluates to 50 + 51 = 101. So once the
        parenthetical part has been computed, the expression becomes "10"+101
        which is again String + int */

    }

    public void question5() {

        int counter = 0;
        int total = 0;

        while (counter < 50) {
            
            counter++;
            total += counter; 

        }

        System.out.println(total);

    }

    public void question6() {

        int counter = 0;
        int total = 0;

        while (total < 2000) {

            counter++;
            total += counter;

            if (total < 2000 && total % 2 == 0) {

                System.out.println(total);

            }


        }

    }

    public void question7() {

        double a = Math.pow(3, 20);
        double b = Math.pow(2, 25);
        double c = (a-b)%10;

        System.out.println(c);

    }

    public void question8() {

        int firstPow = (int)(Math.pow(3, 20));
        int secondPow = (int)(Math.pow(2, 25));
        int lastDigit = (firstPow - secondPow) % 10;
        
        System.out.println("The last digit is " + lastDigit);
        // incorrect output as theyve been declared as integers
        // The values of 320 and 225 are too large to be stored in an int variable. 
        // The easiest fix is to change the int
        // variables (and casts) to be long variables.

    }

    public void question9() {

        // The difference in precision means the rounding error in the two expres-sions produces slightly different results
        double d = 2.0/3.0;
        float f = 2.0f/3.0f;

        if (d == f) {
            
            System.out.println(d + " == " + f);
        
        }

        if (d != f) {

        System.out.println(d + " != " + f);

        }

    }

    public void question10() {

        int neg = -1234567890;
        int pos = +1234567890;
        int diff = pos - neg;

        System.out.println(pos + " - " + neg + " = " + diff);

        // This code fragment prints out 1234567890 - -1234567890 =
        //-1825831516, which is obviously incorrect. The correct answer should be
        //2469135780, but this is larger than the largest value that can be represented
        //as an int, so it “wraps around” to a negative number. 
        
        //Essentially the twos-complement subtraction is performed, but only the lowest 32 bits of the result are
        // kept, the most significant bit of which is 1, so it represents a negative number.

    }

    public void question11() {

        byte x = Byte.MAX_VALUE;

        if (x == -x){ 
            
            System.out.println(x + " == -" + x);
        
        }

        //the other number is the most negative number that can be represented
        // as an int, which is -2147483648 (or in Java Integer.MIN_VALUE). In hex-
        //adecimal, this is 0x80000000. In order to negate it, as it is already negative,
        //we subtract one, giving 0x7FFFFFFF, and flip all the bits, to give 0x80000000,
        //and we are back where we started! Because zero is treated as a positive number
        //(its most significant bit is zero), then there is one more non-zero negative number
        //than there are strictly positive numbers, so it is perhaps unsurprising that the one
        //that is it’s own negation is the one that has no positive partner!

    }

    public void question13() {

        char x = (char)0x1F642;

    }

}
