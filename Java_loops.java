import java.util.*;

class Java_loops
{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for (int j=0; j < n; j++){
                int term = a + ((1 << (j + 1)) - 1) * b;
                System.out.print(term);
                if(j < n - 1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        in.close();
    }
}
