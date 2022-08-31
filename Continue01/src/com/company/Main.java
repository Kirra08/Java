package com.company;

public class Main {

    public static void main(String[] args) {
	    for (int count = 0; count < 5; count++) {
            if (count == 2) {
                continue;
            }
            System.out.println("Continue01 = " + count);
        }
    }
}
