package ArrayList;
import java.util.ArrayList;
import java.util.List;

class Arraylist8{
  public static List<String> letterCombinations(String digits) {
    if(digits.isEmpty())
      return new ArrayList<>();

    List<String> ans = new ArrayList<>();
    ans.add("");
    String[] digitToLetters = {"",    "",    "abc",  "def", "ghi",
                                     "jkl", "mno", "pqrs", "tuv", "wxyz"};

    for (char d : digits.toCharArray()) {
      List<String> temp = new ArrayList<>();
      for ( String s : ans)
        for (char c : digitToLetters[d - '0'].toCharArray())
          temp.add(s + c);
      ans = temp;
    }

    return ans;
  }public static void main(String[] args){
    
    String digit="23";
    System.out.println(letterCombinations(digit));
  }
}

