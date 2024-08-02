package xyz.cotoha.saki.prg;

public class Car {
    // フィールド
    private String color;
    private String model;
    private int year;

    // コンストラクタ
    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    // メソッド
    public void displayInfo() {
        System.out.println("Car model: " + model + ", Color: " + color + ", Year: " + year);
    }

    // メインメソッド
    public static void main(String[] args) {
        // Carクラスのインスタンスを作成
        Car myCar = new Car("Red", "Toyota", 2020);
        // メソッドを呼び出す
        myCar.displayInfo();
    }
}
