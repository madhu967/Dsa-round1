class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
       int n=arr.length;
       HashSet<Integer> s= new HashSet<>();
       ArrayList<Integer> result=new ArrayList<>();
       for(int i=0;i<n;i++){
           if(!s.contains(arr[i])){
               s.add(arr[i]);
               result.add(arr[i]);
           }
       }
       return result;
    }
    
}



class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
       int n=arr.length;
       
       ArrayList<Integer> result=new ArrayList<>();
       if(n==0) return result;
       result.add(arr[0]);
       for(int i=1;i<n;i++){
           if(arr[i]!=arr[i-1]){
               result.add(arr[i]);
           }
       }
       return result;
    }
    
}

