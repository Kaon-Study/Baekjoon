package step_03;

import java.io.*;

public class N_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int each = Integer.parseInt(br.readLine());

        for (int i = 0; i < each; i++) {
            String[] arr = br.readLine().split(" ");
            int result = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
            bw.write(result + "\n");
        }
        bw.flush();
    }
}
