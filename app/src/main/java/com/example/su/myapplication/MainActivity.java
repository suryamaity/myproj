package com.example.su.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] str_array = "name:score:asss:dddd".split(":");
        String stringa = str_array[0];
        String stringb = str_array[1];
        String input = "Just to clarify, I will have strings of varying "
                + "lengths. I want to strip characters from it, the exact "
                + "ones to be determined at runtime, and return the "
                + "resulting string.";
        String regx = ",.";
        char[] ca = regx.toCharArray();
        for (char c : ca) {
            input = input.replace(""+c, "");
         //   System.out.print("------"+ca);ggit
        }
        System.out.println("-----------------"+input);


        ///////////////
        String string = "1-50  of 500+";
        String[] stringArray = string.split("\\s+");

        for (String str : stringArray)
        {
            System.out.println("------------"+str);
        }

    }
}
