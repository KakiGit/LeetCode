import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * gguo1
 */
public class gguo1 {
    public static void main(String[] rgs) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        System.out.println("Enter your value:");
        str = br.readLine();
        System.out.println("your value is :" + str);
    }

}