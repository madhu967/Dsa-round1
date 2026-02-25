// Brute Force Approch
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int compliment=target-numbers[i];
           if(map.containsKey(compliment)) return new int[] {map.get(compliment)+1,i+1};
           map.put(numbers[i],i);
        }
        return new int[] {-1,-1};
    }
}

//optimal apprcoh - two pointers it is used when array is sorted or piars and triplet or sum or diffrence

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int left=0,right=n-1;
        int sum=0;
        while(left<right){
            sum=numbers[left]+numbers[right];
            if(sum==target){
                return new int[] {left+1,right+1};
            }
            else if(sum<target) left++;
            else right--;
        }
        return new int[] {-1,-1};
    }
}
