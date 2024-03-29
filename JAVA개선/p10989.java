import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class p10989 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());

            StringBuilder sb = new StringBuilder();
            int arr[] = new int[N];

            for(int i = 0;i<N;i++){
                arr[i] = Integer.parseInt(br.readLine());
            }
    
            Arrays.sort(arr);

            for(int i = 0;i<N;i++){
                sb.append(arr[i]).append("\n");
            }

            System.out.println(sb);

    }
}
