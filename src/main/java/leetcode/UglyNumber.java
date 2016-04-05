package leetcode;

import java.util.ArrayList;

public class UglyNumber {

  public int nthUglyNumber(int n) {
    ArrayList<Integer> uglyNumbers = new ArrayList<Integer>();
    uglyNumbers.add(1);

    int i =0;
    int j =0;
    int k =0;

    while (uglyNumbers.size() < n) {
      int next = min(uglyNumbers.get(i)*2, uglyNumbers.get(j)*3, uglyNumbers.get(k)*5);

      if(next == uglyNumbers.get(i)*2){
        i++;
      } else if(next == uglyNumbers.get(j)*3){
        j++;
      }else if(next == uglyNumbers.get(k)*5) {
        k++;
      }

      if(!uglyNumbers.contains(next)){
        uglyNumbers.add(next);
      }
    }
    return uglyNumbers.get(n - 1);
  }

  private int min(int a, int b, int c) {
    return min(min(a,b),c);
  }

  private int min(int a, int b) {
    return a > b ? b : a;
  }
}
