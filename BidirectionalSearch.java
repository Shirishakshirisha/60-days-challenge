public class BidirectionalSearch {
    private static int bds(int[] a , int target)
    {
        int low =0;
        int high = a.length-1;
        while(low<= high)
        {
            if(a[low]==target)
            {
                return low+1;
            }
            if(a[high]==target){
                return high+1;
            }
            low++;
            high--;

        
    }
    return -1;

}
    public static void main(String[] args) {
        int[] a = {3,2,6,4,9,8,0,1};
        int target= 1;
        
        int result = bds(a,target);
        if(result == -1){
            System.out.println("Element not found");
        }
        else{
        System.out.println(result);
        } 
    }
    
}
