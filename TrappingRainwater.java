public class TrappingRainwater{
    public static void main(String[] args) {
        int[] a = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(a));
    }
    public static int trap(int[] height) {
        int l=0;
        int r= height.length-1;
        int sum=0;
        int leftmax=0;
        int rightmax=0;
        while(l<=r){
            if(height[l]<=height[r]){
                if(height[l]>=leftmax){
                    leftmax=height[l];
                
                }
                else{
                    sum=sum+(leftmax-height[l]);
                }
                l++;

            }
            else{
                if(height[r]>=rightmax){
                    rightmax=height[r];

                }
                else{
                    sum=sum+(rightmax-height[r]);
                }
                    r--;
            }
        }
        return sum;
        
    }
}