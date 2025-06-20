class Solution {
    public String intToRoman(int num) {
        int[] values = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] RomanValues = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder roman = new StringBuilder();

        for(int i=0; i<values.length; i++){
            while(num >= values[i]){
                roman.append(RomanValues[i]);
                num -= values[i];
            }
        }
        return roman.toString();
    }
}
