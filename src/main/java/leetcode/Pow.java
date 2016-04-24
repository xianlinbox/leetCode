package leetcode;

public class Pow {
  public double myPow(double x, int n) {
    if (n < 0) {
      return 1 / handlePositivePow(x, -n);
    } else if (n == 0) {
      return 1;
    } else {
      return handlePositivePow(x, n);
    }
  }

  private double handlePositivePow(double x, int n) {
    if (n == 1) {
      return x;
    } else {
      double value = myPow(x, n / 2);
      if (n % 2 == 1) {
        return x * value * value;
      } else {
        return value * value;
      }
    }
  }
}
