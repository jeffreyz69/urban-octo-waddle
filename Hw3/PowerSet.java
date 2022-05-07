public class PowerSet{

  private static int methodCount = 0;
  public static void main(String[] args) {
    Integer[] input = new Integer[3];
    String output = "";
    input[0] = 1;
    input[1] = 2;
    input[2] = 3;

    printSet(input, input.length, output);
    System.out.println("Method is called in total "+ methodCount + " times");
    String[] inputS = new String[3];

    inputS[0] = "a";
    inputS[1] = "b";
    inputS[2] = "c";
    printSet(inputS, inputS.length, output);
    System.out.println("Method is called in total "+ methodCount + " times");
  }

  //recursive method to print power set given input
  public static <E> void printSet(E[] input, int index, String output ){
    //base case
    if(index == 0){
      System.out.println("{" + output + "}");
    }else{
      //print the current set
      printSet(input, index - 1, output);
      //print the current set with the current element
      printSet(input, index - 1, output + input[index - 1]);
    }
    //Big O notation: O(2^n)
    //The input is the number of elements in the set, two recursive calls are guaranteed to be made
    methodCount++;
  }

}
