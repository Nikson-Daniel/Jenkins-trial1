package com.company.nick;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Formatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i, j;
        for (i = 6; i>=0; i--){
            for(j = 0; j<=6; j++){
                System.out.print(" ");
                if(i<=j){
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}

