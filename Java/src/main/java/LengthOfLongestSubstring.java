
import java.util.HashSet;
import java.util.Set;

/**
 * LengthOfLongestSubstring
 */
public class LengthOfLongestSubstring {

public static void selfTest() {
    String [] s = {"au","aa","dvdf","asdkfhau","","cdd","abcabcbb"};
    for(int i=0;i<s.length;i++)
    lengthOfLongestSubstring(s[i]);
}

        public static int lengthOfLongestSubstring(String s) {
            int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j <= n; j++)
                if (allUnique(s, i, j))
                    ans = Math.max(ans, j - i);
        System.out.println(ans);
        return ans;
    }

    public static boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<Character>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch))
                return false;
            set.add(ch);
        }
        System.out.println(set.toString());
        return true;
    }
}