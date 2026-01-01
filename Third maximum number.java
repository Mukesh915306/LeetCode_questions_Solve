class Solution {
    public int thirdMax(int[] nums) {
        Long first = Long.MIN_VALUE;
        Long second = Long.MIN_VALUE;
        Long third = Long.MIN_VALUE;
        for(int i : nums){
            if(i == first || i == second || i == third) continue;
            if(i > first){
                third = second;
                second = first;
                first = (long)i;
            }
            else if(i > second){
                third = second;
                second = (long)i;
            }
            else if(i > third){
                third = (long)i;
            }
        }
        return (third == Long.MIN_VALUE)? first.intValue() : third.intValue();
    }
}
