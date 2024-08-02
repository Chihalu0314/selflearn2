package xyz.cotoha.saki.prg;

import java.time.LocalDateTime;

public class Past {
    public static void main(String[] args) {

        int test = 0;

        System.out.println("Hello world!");

        //タイムゾーンのない日時を取得
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);


        //コメントアウト 1行
        /*
        改行出来るコメントアウト
        */

        //練習
        System.out.println(123);
        System.out.println("¥100もらった");
        System.out.println("またあした");
        System.out.println(1 + "\t"+ 2 + "\t" + 3);

        //8進数
        System.out.println(06);
        System.out.println(024);
        System.out.println(015);

        //16進数 0xで始まる
        System.out.println(0x6);
        System.out.println(0x14);
        System.out.println(0xD);

        test = 4;

        System.out.println(test);
    }
}
