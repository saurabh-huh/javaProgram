package newJavaProgram;

import java.util.Scanner;

public class newProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int an  = sc.nextInt();
        int ac = sc.nextInt();
        int ans =0;
        for(int i=an;i<=ac;i++){
            if(i%15 == 0)
                ans += i;
        }
        System.out.println(ans);
    }
}
