import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p15894{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long l= Long.parseLong(br.readLine()) * 4;
        System.out.println(l);
    }
}