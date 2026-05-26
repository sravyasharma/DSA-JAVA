class Solution {
    public int numberOfSpecialChars(String word) {
        int count=0;
        Set<Character> set1=new HashSet<>(), set2=new HashSet<>();
        for(char c:word.toCharArray()){
            if(Character.isLowerCase(c)) set1.add(c);
            else set2.add(Character.toLowerCase(c));
        }
        for(char c:set1){
            if(set2.contains(c)) count++;
        }

        return count;
    }
}