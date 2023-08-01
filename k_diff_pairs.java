import java.util.HashMap;

public class k_diff_pairs {
    public static void main(String[] args) {
        int [] arr={1,1,1,2,3,4,5};
       int k=2;
        int a=findPairs(arr,k);
        System.out.print(a);
    }

     public  static int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int c=0;

        for(int i:map.keySet()){
            int key=i;
            int val=map.get(key);
            if(k==0){
                if(val>=2){
                    c++;
                }

            }
            else {
                if(map.containsKey(key+k)){
                    c++;
                }
            }
        }
        return c;
        
    }
}
    

