package projecteuler1;
import java.io.*;
public class ProjectEuler1{  
    public static void main(String[] args) throws IOException {       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] N = new int[T];
        for(int t = 0; t < T; N[t++] = Integer.parseInt(br.readLine())){
        }
        br.close();
        br = null;
        long[] V = new long[T];
        for(int t = 0; t < T; ++t){
            int n = N[t] - 1;
            V[t] = 3*nSum(n/3) + 5*nSum(n/5) - 15*nSum(n/15);
        }       
        StringBuilder sb = new StringBuilder();
        for(int t = 0; t < T; sb.append(V[t++]).append("\n")){
        }
        System.out.print(sb);
    }    
    public static long nSum(int n){
        long v = n;
        return (v*v + v) >> 1;
    }
}