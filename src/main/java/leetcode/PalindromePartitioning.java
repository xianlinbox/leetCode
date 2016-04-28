package leetcode;

import java.util.List;

public class PalindromePartitioning {
  public List<List<String>> partition(String s) {

    int[][] palindromeRecorder = new int[s.length()][s.length()];

    for (int i = s.length() - 1; i > 0; i--) {
      for (int j = i; j < s.length(); j++) {
        if (i == j) {
          palindromeRecorder[i][j] = 1;
        } else {
          if (s.charAt(i) == s.charAt(j)) {
            if (j == (i + 1) || palindromeRecorder[i + 1][j - 1] == 1) {
              palindromeRecorder[i][j] = 1;
            }
          }
        }
      }
    }




    return null;
  }
}
