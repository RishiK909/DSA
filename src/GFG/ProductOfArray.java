package GFG;

public class ProductOfArray
{
    public static void main(String[] args)
    {

        ProductOfArray obj = new ProductOfArray();
        long[] arr = {4,2,1};
        System.out.println(obj.product(arr));

    }

    public long product(long arr[])
    {
        long mod = 1000000007;
        long ans = 1;

        for(int i=0; i<arr.length; i++)
        {
            ans = (ans * arr[i]) % mod;
        }


        return ans;

    }
}
