class Solution {
    public boolean isNumber(String s) {
        boolean isDot = false, ise = false, nums = false;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)) nums = true;
            else if(c == '+' || c == '-'){
                if(i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') return false;
            }
            else if(c == 'e' || c == 'E'){
                if(ise || !nums) return false;
                ise = true;
                nums = false;
            }
            else if(c == '.'){
                if(isDot || ise) return false;
                isDot = true;
            }
            else return false;
        }
        return nums;
    }
}