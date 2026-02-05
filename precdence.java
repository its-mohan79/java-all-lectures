public class precdence {

  public static void main(String[] args) {
    int result1 = 2 + 3 * 4;     // 2 + 12 = 14
    int result2 = (2 + 3) * 4;   // 5 * 4 = 20

    System.out.println(result1);
    System.out.println(result2);



    int result12 = 10 - 2 + 5;      // (10 - 2) + 5 = 13
    int result22 = 10 - (2 + 5);    // 10 - 7 = 3

    System.out.println(result12);
    System.out.println(result22);
  }
}

    

