import java.util.*;
class Solution
{
    public void Calulate(int[] array,int q) {
        Scanner scanner=new Scanner(System.in);
        int[] p=new int[array.length];
        p[0]=array[0];
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            p[i]=array[i]+p[i-1];
        }
        while(q>0)
        {
            int l= scanner.nextInt();
            int r= scanner.nextInt();
            if(l==0)
            {
                sum=p[r];
            }
            else
            {
                sum=p[r]+p[l-1];
            }
            q--;
            System.out.println(sum);
        }
    }
}
public class PrefixSum
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]= scanner.nextInt();
        }
        int q= scanner.nextInt();
        Solution solution= new Solution();
        solution.Calulate(array,q);

    }
}
