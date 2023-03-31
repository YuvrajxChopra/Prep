import java.util.*;
public class Main
{
    public static int solve(String s){
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        while (j < s.length()) {
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c, 0) + 1);
            if(map.size()< j-i+1){
                while (map.size()< j-i + 1 ) {
                    char leftChar = s.charAt(i);
                    map.put(leftChar, map.get(leftChar) - 1);
                    if (map.get(leftChar) == 0) {
                        map.remove(leftChar);
                    }
                    i++;
                }
            }
            if (map.size() == j-i+1) {
                ans = Math.max(ans, j - i + 1);
            }
            j++;
        }
        return ans;
    }
	public static void main(String[] args) {
	    String s = "geeksforgeeks";
	    int k = 2;
	    int ans = solve(s);
	    System.out.println("Answer: " + ans);
	}
}
