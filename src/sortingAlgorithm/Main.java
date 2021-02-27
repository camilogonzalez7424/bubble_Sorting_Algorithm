package sortingAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public final static String separator = (" ");

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        String[] row = new String[size];
        String chain = "";
        while (size>0) {
            chain = br.readLine();
            row[size-1]= chain;
            size--;
          //System.out.println(row[size]);
        }

        br.close();
        bw.close();


    }
    public static double[] split(String chain) {
        String[] parts = chain.split(separator);
        double[] array = new double[parts.length];
        for(int i = 0; i < array.length; i++) {
            array[i] = Double.parseDouble(parts[i]);

        }

        return array;
    }

}
