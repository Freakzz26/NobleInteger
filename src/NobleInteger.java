import java.util.Arrays;
import java.util.Scanner;

public class NobleInteger {
    static int noble(int arr[],int n)
    {
        Arrays.sort(arr);
        int prev=0;
        for (int i=n-1;i>0;i--)
        {
            int index=0;
            index++;
            if(arr[i]!=arr[i-1])
            {
                prev=index;
            }
            if(prev==arr[i-1])
            {
                return 1;
            }
        }
        return -1;

    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        System.out.println(noble(arr,n));
    }
}
