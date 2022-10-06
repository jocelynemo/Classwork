public class ArrayMethods{
  public static int[] returnCopy(int[] ary){
    int[] copy;
    copy = new int[ary.length];
    for (int i = 0; i < ary.length; i++){
      copy[i] = ary[i];
    }
    return copy;
  }

  public static void main(String[]args){
    System.out.println(returnCopy(new int[] {1, 2, 3}));
}
