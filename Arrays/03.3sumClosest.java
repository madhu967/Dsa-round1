class Solution {
    public int closest3Sum(int[] arr, int target) {
        // code here
        int n =arr.length;
        Arrays.sort(arr);
        int result=arr[0]+arr[1]+arr[2];
        for(int i=0;i<n;i++){
            int left=i+1,right=n-1;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(Math.abs(target-sum)<Math.abs(target-result) || (Math.abs(target-sum) == Math.abs(target-result) && sum>result)  ){
                    result=sum;
                }
                if(sum==target) return target;
                else if(sum<target) left++;
                else right--;
            }
        }
        return result;
    }
};

//Having mutlipla  clostes then return the largetes one 
