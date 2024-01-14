package basicString;

import java.util.HashMap;

/*Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true
 

Constraints:

1 <= s.length <= 5 * 104
t.length == s.length
s and t consist of any valid ascii character.*/

public class IsomorphicStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="paper";
		String t="title";
		
		System.out.println(isIsomorphic(s, t));

	}
	
	public static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                if (map.containsValue(t.charAt(i))) { // check if value alredy present
                    return false;
                }
                map.put(s.charAt(i), t.charAt(i));// put key value pair if not present
                continue;
            }

            if (map.get(s.charAt(i)) != t.charAt(i)) { //if key value pair present and doesn't match
                return false;                            // with reoccured key value
            }
        }

        return true;

    }

}
