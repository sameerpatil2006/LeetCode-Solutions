/*
// write your code in Java

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");


*/
/**
 * (c) Copyright 2018, Synopsys, Inc. All rights reserved worldwide.
 *
 * You may not copy this code and post it anywhere without written consent from the copyright holder.
 **//*

class Solution {

    // Important[] highlights = new Important[0];
    */
/**
     * Tags used to flag important log messages.
     **//*

    enum Tag {
        // fill in with necessary details -- COMPLETING THIS IS OPTIONAL, BUT BONUS IF YOU USE THIS CORRECTLY!
        Exception,
        Error,
        Result
    }

    */
/**
     * Encapsulates important log messages for further processing.
     **//*

    class Important {
        // fill in with necessary details
        String highlights[] = new String[100];
    }

    public Solution() {
        // add necessary stuff here
        Important imp = new Important();
    }

    public String solution(String log) {
        // write your code in Java
        String arr [];
        arr = log.split("\n");
        String line[] = new String[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].contains("Exception"))
            {
                System.out.println("EXCEPTION found:"+arr[i]);
            }
            if(arr[i].contains("Error"))
            {
                System.out.println("ERROR found:"+arr[i]);
            }
            if(arr[i].contains("Result"))
            {
                System.out.println("RESULT found:"+arr[i]);
            }
        }

        ///// DO NOT CHANGE THE CODE BELOW /////
        return formatResults();
    }

    ///// DO NOT CHANGE CODE BELOW /////
    private String formatResults() {

        String results = "{";
        for (Important item : highlights) {
            results += "'" + item + "',";
        }
        results += "}";
        return results;
    }
}*/
