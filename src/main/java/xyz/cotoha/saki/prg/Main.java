package xyz.cotoha.saki.prg;

public class Main {

    public static void main(String[] args) {
        int age; //年齢を入れる箱（変数の初期化）
        age = 20;
        System.out.println(age + "歳");



        //データ型↓

        byte glasses;
        glasses = 2;
        System.out.println(glasses);

        short age2;
        age2 = 18;
        System.out.println(age2);

        int salary;
        salary = 15200;
        System.out.println(salary);

        long worldPeople;
        worldPeople = 6900000000L;
        System.out.println(worldPeople);

        float weight;
        weight = 67.5F;
        System.out.println(weight);

        double height;
        height = 171.2;
        System.out.println(height);

        boolean isError;
        isError = true;
        System.out.println(isError);

        boolean result;
        result = false;
        System.out.println(result);

        char zodiac;
        zodiac = '鹿'; //文字
        System.out.println(zodiac);

        String name;
        name = "しかのこ"; //文字列
        System.out.println(name);


        //変数の初期化
        int age3 = 22;
        System.out.println(age3 + "歳です");

        age3 = 23;
        System.out.println(age3 + "\n変数を上書きしました");

        //finalで上書きできないようにする
        final int age4 = 22;
        System.out.println(age3 + "歳です");

        // age4 = 23;
        System.out.println(age3 + "\n変数を上書きしました");

        //練習問題
        int a = 3;
        int b = 5;
        System.out.println("縦幅" + a + "横幅" + b + "の面積は、" + a*b);

        boolean Practice = true;
        System.out.println(Practice);

        char Character = '駆';
        System.out.println(Character);

        double Minority = 3.14;
        System.out.println(Minority);

        long Long = 314159265853979L;
        System.out.println(Long);

        String text = "ミナトの攻撃！敵に15ポイントのダメージを与えた。";
        System.out.println(text);
    }
}