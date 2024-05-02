package newJavaProgram.tcs;

public class FindEquilibrium {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {2,1,2,1};
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        int nsum = 0;
        boolean flag = false;
        for(int i=1;i<n;i++){
            nsum += arr[i-1];
            if(nsum == (sum-nsum-arr[i])){
                System.out.println(i);
                flag = true;
                break;
            }
        }
        if(!flag)
            System.out.println("-1");
    }
}
