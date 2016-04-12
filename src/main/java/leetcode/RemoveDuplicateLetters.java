package leetcode;

public class RemoveDuplicateLetters {
  public String removeDuplicateLetters(String s) {
    if (s == null || s.isEmpty()) {
      return s;
    }

    char[] chars = s.toCharArray();
    int[] charCount = new int[26];
    for (char aChar : chars) {
      charCount[aChar - 'a']++;
    }

    // 找出当前最小字符
    int pos = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) < s.charAt(pos)) {
        pos = i;
      }

      System.out.println("pos:" + pos + " i:" + i);
      // 避免无字符可用
      if (--charCount[s.charAt(i) - 'a'] == 0) {
        break;
      }
    }
    // 除去字符串中已经append的字符的所有重复值
    return s.charAt(pos) + removeDuplicateLetters(s.substring(pos + 1).replaceAll("" + s.charAt(pos), ""));
  }

  class BinaryTree {
    private TreeNode root;

    public void add(TreeNode node) {
      if (root == null) {
        root = node;
      } else {
        root.addNode(node);
      }
    }

    public String traverse() {
      StringBuffer buffer = new StringBuffer();
      inOrderTraverse(root, buffer);
      return buffer.toString();
    }

    private void inOrderTraverse(TreeNode node, StringBuffer buffer) {
      if (node == null) {
        return;
      } else {
        inOrderTraverse(node.left, buffer);
        buffer.append(node.value);
        inOrderTraverse(node.right, buffer);
      }
    }
  }

  class TreeNode {
    private char value;
    TreeNode left;
    TreeNode right;

    public TreeNode(char value) {
      this.value = value;
    }

    public void addNode(TreeNode node) {
      if (node.value < value) {
        if (left != null) {
          left.addNode(node);
        } else {
          left = node;
        }
      } else if (node.value > value) {
        if (right != null) {
          right.addNode(node);
        } else {
          right = node;
        }
      }
    }
  }
}
