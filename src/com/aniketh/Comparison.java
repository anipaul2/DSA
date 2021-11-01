package com.aniketh;

public class Comparison {
    public static void main(String[] args) {
        // In java string are only assigned in double quotes and not in single quotes.
        String a = "Aniketh";
        String b = "Aniketh";
        //System.out.println(a == b);
        // The above code gives true because both the values are in a pool.
        // Now I will write a code but it  will show false and the reason is because we will create new strings and now the assigned values is out of the pool.
        String c = new String ("Aniketh");
        String d = new String ("Aniketh");
        System.out.println(c == d);;
        // the above code -> But if we use (.equals) here it will show true because here it doesn't care about objects. It only cares about the values now.
        System.out.println(c.equals(b));
        // the above sout should show true
        // To print the letter at a particular index no use (charAt)
        System.out.println(c.charAt(0)); // It should give me A

    }
}
