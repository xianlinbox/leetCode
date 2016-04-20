package leetcode;

/**
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

 Example:
 Given num = 16, return true. Given num = 5, return false.

 Follow up: Could you solve it without loops/recursion?
 */

public class PowerOfFour {
  public boolean isPowerOfFour(int num) {
    //num & (num - 1) ==0 得到2的次方
    //(num & 0x55555555) !=0 移除仅有2的次方
    return  num > 0 && (num & (num - 1)) ==0  && (num & 0x55555555) !=0;
  }
}
