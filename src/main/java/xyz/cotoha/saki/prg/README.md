# Java Arithmetic Operators

## 概要
このセクションでは、Javaで使用される基本的な算術演算子について説明します。算術演算子は、数値を操作するための基本的なツールです。

## 算術演算子一覧

### 加算 (`+`)
- **説明**: 2つの数値を加算します。
- **例**:
    ```java
    int a = 10;
    int b = 20;
    int result = a + b; // result は 30 になります
    ```

### 減算 (`-`)
- **説明**: 2つの数値の差を計算します。
- **例**:
    ```java
    int a = 20;
    int b = 10;
    int result = a - b; // result は 10 になります
    ```

### 乗算 (`*`)
- **説明**: 2つの数値を乗算します。
- **例**:
    ```java
    int a = 10;
    int b = 20;
    int result = a * b; // result は 200 になります
    ```

### 除算 (`/`)
- **説明**: 2つの数値を除算します。
- **注意**: 0で除算すると `ArithmeticException` がスローされます。
- **例**:
    ```java
    int a = 20;
    int b = 10;
    int result = a / b; // result は 2 になります
    ```

### 剰余 (`%`)
- **説明**: 2つの数値の除算の余りを計算します。
- **例**:
    ```java
    int a = 20;
    int b = 3;
    int result = a % b; // result は 2 になります
    ```

## 使用例
以下に、各算術演算子の使用例を示します。

```java
public class ArithmeticOperatorsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // 加算
        int sum = a + b;
        System.out.println("加算: " + sum);

        // 減算
        int difference = a - b;
        System.out.println("減算: " + difference);

        // 乗算
        int product = a * b;
        System.out.println("乗算: " + product);

        // 除算
        int quotient = a / b;
        System.out.println("除算: " + quotient);

        // 剰余
        int remainder = a % b;
        System.out.println("剰余: " + remainder);
    }
}
