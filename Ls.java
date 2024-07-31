public class Ls {
    private static int Linear(int[] a,int n, int val)
    {
        for(int i=0; i<n;i++)
        {
            if(a[i]==val)
            {
                return i+1;
            }
           
            
        }
        return -1;
    }    
    public static void main(String[] args) {
        int[] a = {3,2,6,4,9,8,0,1};
        int val = 9;
        int n = a.length;
        int result = Linear(a, n, val);
        if(result == -1){
            System.out.println("Element not found");
        }
        else{
        System.out.println(result);
        }

    }
}
