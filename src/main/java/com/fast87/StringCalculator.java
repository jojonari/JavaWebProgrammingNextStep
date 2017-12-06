package com.fast87;

public class StringCalculator {
    int add (String text){
        String[] strs;
        int sum = 0;

        if(text == null)
            return 0;
        if(text.isEmpty())
            return 0;

        strs = text.split(",|:");

        for (String s: strs)
            sum+=Integer.parseInt(s);


        return sum;
    }
}
