package leetcode;

public class FIndMinInRotatedSortArray {
  public int findMin(int[] array) {
    if (isNotRotated(array)) {
      return array[0];
    }
    return binarySearchMin(array, 0, array.length - 1);
  }

  private boolean isNotRotated(int[] array) {
    int middlePoint = (int) Math.floor((array.length) / 2);
    return (array[0] < array[middlePoint]) && (array[middlePoint] < array[array.length - 1]);
  }

  private int binarySearchMin(int[] array, int startIndex, int endIndex) {
    if (endIndex - startIndex <= 1) {
      return array[startIndex] > array[endIndex] ? array[endIndex] : array[startIndex];
    } else {
      int middlePoint = startIndex + (int) Math.ceil((endIndex - startIndex) / 2);
      if (array[startIndex] < array[middlePoint]) {
        return binarySearchMin(array, middlePoint, endIndex);
      } else {
        return binarySearchMin(array, startIndex, middlePoint);
      }
    }
  }
}
