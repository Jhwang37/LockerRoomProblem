package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean[] doors = new boolean[100];
        Arrays.fill(doors, false);

        for(int i = 0; i < doors.length ; i++){
            if(!doors[i]){
                doors[i] = true;
            }
        }
        for(int i = 1; i < doors.length; i+=2){
            if(doors[i]){
                doors[i] = false;
            }
        }
        for(int i = 2; i < doors.length; i+=3){
            if(doors[i]){
                doors[i] = true;
            }
        }

        for(int i = 0; i <= doors.length; i++){
            System.out.print("["+doors[i]+"]");
        }
    }
}
