import java.util.Scanner;
public class NO_OF_RATS {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int unit=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(Check(arr,r,unit,n));
    }

    public static int Check(int arr[],int r,int unit,int n){
          if(arr.length==0){
            return -1;
          }

          int tfood=r*unit;
          int res=arr[0];
          for(int i=1;i<n;i++){
            res=res+arr[i];
            if(res>=tfood){
                return i+1;
            }
          }
          return 0;
    }
}
