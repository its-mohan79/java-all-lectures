public class datatypes {
    public static void main(String[] args) {

/**
 * =========================================================
 *                JAVA DATA TYPES – NOTES
 * =========================================================
 * /

/**
 * ---------------------------------------------------------
 * 1. What is  a  Data Type ?
 * ---------------------------------------------------------
 * A data type specifies:
 * 
 * - what kind of value a variable can store
 * - how much memory it occupies
 * - the range of values it can  hold
 *
 * Java is  a strongly typed language,
 * 
 * so every variable must  have a data type.
 */

/***
 * 
 * ---------------------------------------------------------
 * 2. Types of Data Types in Java
 * 
 * ---------------------------------------------------------
 * Java data types are  divided into two categories:
 *
 * 1. Primitive Data Types
 * 
 * 2. Non-Primitive (Reference)  Data Types
 */

/**
 * ---------------------------------------------------------
 * 3. Primitive Data Types
 * ---------------------------------------------------------
 * Primitive data types store actual values directly.
 * Java has exactly 8 primitive data types.
 */

/**
 * -----------------------------
 * (A) Integer Data Types
 * -----------------------------
 * Used to store whole numbers.
 *
 * byte  -> 1 byte  -> range: -128 to 127
 * short -> 2 bytes -> range: -32,768 to 32,767
 * int   -> 4 bytes -> range: -2^31 to 2^31 - 1
 * long  -> 8 bytes -> range: -2^63 to 2^63 - 1
 *
 * Default integer type in Java is int.
 */

/**
 * Example:
 * byte a = 10;
 * short b = 200;
 * int c = 50000;
 * long d = 9876543210L;   // L is mandatory
 */

/**
 * -----------------------------
 * (B) Floating Point Data Types
 * -----------------------------
 * Used to store decimal values.
 *
 * float  -> 4 bytes -> precision: ~7 digits
 * double -> 8 bytes -> precision: ~15–16 digits
 *
 * Default decimal type in Java is double.
 */

/**
 * Example:
 * float x = 3.14f;    // f is compulsory
 * double y = 3.1415926535;
 */

/**
 * -----------------------------
 * (C) Character Data Type
 * -----------------------------
 * char is used to store a single character.
 *
 * Size: 2 bytes
 * Range: 0 to 65,535 (Unicode)
 *
 * Java uses Unicode, not ASCII.
 */

/**
 * Example:
 * char ch = 'A';
 * char symbol = '@';
 */

/**
 * -----------------------------
 * (D) Boolean Data Type
 * -----------------------------
 * boolean is used for true/false values.
 *
 * Allowed values:
 * - true
 * - false
 *
 * boolean does NOT support 0 or 1.
 */

/**
 * Example:
 * boolean isJavaEasy = true;
 * boolean isRaining = false;
 */

/**
 * ---------------------------------------------------------
 * 4. Non-Primitive (Reference) Data Types
 * ---------------------------------------------------------
 * Non-primitive data types store references (addresses)
 * of objects, not the actual value.
 */

/**
 * Common Non-Primitive Data Types:
 * - String
 * - Array
 * - Class
 * - Interface
 * - Object
 */

/**
 * -----------------------------
 * (A) String
 * -----------------------------
 * String represents a sequence of characters.
 * String objects are immutable (cannot be changed).
 */

/**
 * Example:
 * String name = "Kannu";
 * String language = "Java";
 */

/**
 * -----------------------------
 * (B) Array
 * -----------------------------
 * Array stores multiple values of the same data type.
 * Array size is fixed.
 */

/**
 * Example:
 * int[] marks = {90, 85, 88};
 */

/**
 * -----------------------------
 * (C) Object
 * -----------------------------
 * Object is an instance of a class.
 */

/**
 * Example:
 * class Student {
 *     int roll;
 *     String name;
 * }
 *
 * Student s1 = new Student();
 */

/**
 * ---------------------------------------------------------
 * 5. Primitive vs Non-Primitive Data Types
 * ---------------------------------------------------------
 *
 * Primitive:
 * - Stores actual value
 * - Fixed size
 * - Faster
 * - Example: int, double, char
 *
 * Non-Primitive:
 * - Stores reference
 * - Size can vary
 * - Slower than primitive
 * - Example: String, Array, Object
 */

/**
 * ---------------------------------------------------------
 * 6. Important Points
 * ---------------------------------------------------------
 * - Java has only 8 primitive data types
 * - String is NOT a primitive data type
 * - int is default for integers
 * - double is default for decimals
 * - char occupies 2 bytes in Java
 */







    }
}
