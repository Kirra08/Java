package com.company;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        int[][] multipl = new int[9][9];

        //ヘッダ出力
        System.out.println("+-------- かけ算九九表 ---------+");
        System.out.println("|     1  2  3  4  5  6  7  8  9 |");
        System.out.println("|  +----------------------------|");

        //データ代入
        for(int i=0;i<multipl.length;i++) {
            for(int j=0;j<multipl[i].length;j++) {
                multipl[i][j] = (i+1)*(j+1);
            }
        }

        //表示
        DecimalFormat df = new DecimalFormat("00");

        for(int i=0;i<multipl.length;i++) {

            System.out.print("| "+ (i+1) +"|");

            //データ出力
            for(int j=0;j<multipl[i].length;j++) {
                System.out.print(" "+df.format(multipl[i][j]));
            }

            System.out.println(" |");
        }

        //フッタ出力
        System.out.println("+--+----------------------------+");
    }
}