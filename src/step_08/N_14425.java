package step_08;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class N_14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<String> set = new HashSet<>();
        String s = br.readLine();
        StringTokenizer tokenizer = new StringTokenizer(s);

        int N = Integer.parseInt(tokenizer.nextToken());
        int M= Integer.parseInt(tokenizer.nextToken());

        int count = 0;
        for (int i = 0; i < N + M; i++) {
            if (i < N) {
                set.add(br.readLine());
            } else {
                if (set.contains(br.readLine())) {
                    count++;
                }
            }
        }
        bw.write(count + "\n");
        bw.flush();
    }
}
