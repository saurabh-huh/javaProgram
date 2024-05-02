package newJavaProgram;

public class ReverseNum {
    public static void main(String[] args) {
//        int x = countZero(100000345);
        int[] arr = {1,2,3,4,7,6};
        System.out.println(check(arr,0));
    }
    static int reverseNum(int num,int newNum) {
        if (num % 10 == num) return ((newNum * 10) + num);
        return reverseNum(num / 10, ((newNum * 10) + (num % 10)));

    }
    static int countZero(int num){
        if(num == 0) return 0;
        if(num%10 == 0) return 1+countZero(num/10);
        return countZero(num/10);
    }
    static boolean check(int[] arr,int i){
        if(i+1 == arr.length) return true;
        return arr[i] < arr[i+1] && check(arr,i+1);
    }
}
