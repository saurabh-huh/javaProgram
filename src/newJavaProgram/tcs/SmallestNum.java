package newJavaProgram.tcs;

public class SmallestNum {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {323, 45, 46,87};
        int num = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i] < num)
                num = arr[i];
        }
        System.out.println(num);
    }
}
