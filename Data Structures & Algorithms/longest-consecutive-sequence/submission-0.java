class Solution {
    public int longestConsecutive(int[] nums) {
        

        Set<Integer> set=new HashSet<>();

        for(int num:nums){
            set.add(num);
        }

        int longest=0;

        for(int num:set){
            if(!set.contains(num-1)){
                int Currentnum=num;
                int length=1;

                while(set.contains(Currentnum+1)){
                    Currentnum++;
                    length++;

                }

                longest=Math.max(longest,length);
            }
        }
        return longest;
    }
}
