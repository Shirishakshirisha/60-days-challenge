import java.util.Arrays;

public class Bs {
    private static int bs(int[] a ,int n , int val)
    {
        int low =0;
        int high = n-1;;
        while(low<=high)
        {
            int mid = low +( high-low)/2;
            if(a[mid]==val){
                return mid;
            }
            if(val<a[mid])
            {
                high = mid-1;
                
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a ={1,6,3,9,4,0,2};
        int val = 0;
        int n = a.length;
        Arrays.sort(a);
        int result = bs(a,n,val);
        if(result == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println(result);
        }
    }
        
    
}
