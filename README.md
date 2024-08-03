# Java Arithmetic Operators and More

## 概要
このセクションでは、Javaで使用される基本的な算術演算子、文字列結合演算子、代入演算子について説明します。これらの演算子は、数値や文字列を操作するための基本的なツールです。

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

## 文字列結合演算子

### 文字列結合 (`+`)
- **説明**: 2つの文字列を結合します。加算演算子（`+`）は、文字列の結合にも使用されます。
- **例**:
    ```java
    String str1 = "Hello";
    String str2 = "World";
    String result = str1 + " " + str2; // result は "Hello World" になります
    ```

## 代入演算子

### 代入 (`=`)
- **説明**: 変数に値を代入します。
- **例**:
    ```java
    int a = 10; // 変数 a に 10 を代入します
    ```

### 複合代入演算子
- **説明**: 演算と代入を同時に行います。以下にいくつかの例を示します。

#### 加算代入 (`+=`)
- **説明**: 変数に指定した値を加算し、結果を変数に代入します。
- **例**:
    ```java
    int a = 10;
    a += 5; // a は 15 になります
    ```

#### 減算代入 (`-=`)
- **説明**: 変数から指定した値を減算し、結果を変数に代入します。
- **例**:
    ```java
    int a = 10;
    a -= 5; // a は 5 になります
    ```

#### 乗算代入 (`*=`)
- **説明**: 変数に指定した値を乗算し、結果を変数に代入します。
- **例**:
    ```java
    int a = 10;
    a *= 5; // a は 50 になります
    ```

#### 除算代入 (`/=`)
- **説明**: 変数を指定した値で除算し、結果を変数に代入します。
- **例**:
    ```java
    int a = 10;
    a /= 2; // a は 5 になります
    ```

#### 剰余代入 (`%=`)
- **説明**: 変数を指定した値で除算し、その余りを変数に代入します。
- **例**:
    ```java
    int a = 10;
    a % = 3; // a は 1 になります
    ```

## 使用例
以下に、各演算子の使用例を示します。

```java
public class OperatorsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // 算術演算子
        System.out.println("加算: " + (a + b));
        System.out.println("減算: " + (a - b));
        System.out.println("乗算: " + (a * b));
        System.out.println("除算: " + (a / b));
        System.out.println("剰余: " + (a % b));

        // 文字列結合
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("文字列結合: " + str1 + " " + str2);

        // 代入演算子
        int c = 10;
        c += 5;
        System.out.println("加算代入: " + c);
        c -= 3;
        System.out.println("減算代入: " + c);
        c *= 2;
        System.out.println("乗算代入: " + c);
        c /= 4;
        System.out.println("除算代入: " + c);
        c %= 3;
        System.out.println("剰余代入: " + c);
    }
}
