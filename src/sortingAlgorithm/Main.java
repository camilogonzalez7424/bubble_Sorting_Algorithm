package sortingAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public final static String separator = (" "); //Constant used to separate.

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        String[] row = new String[size];
        String chain;
        while (size>0) {
            chain = br.readLine();
            row[size-1]= chain;
            size--;
          //System.out.println(row[size]);
            bw.write(bubbleSort(split(row[size])));
        }
        br.close();
        bw.close();
    }

    //method that separates the strings.
    public static double[] split(String chain) {
        String[] parts = chain.split(separator);
        double[] array = new double[parts.length];
        for(int i = 0; i < array.length; i++) {
            array[i] = Double.parseDouble(parts[i]); //pass from string to double.
        }

        return array;
    }
    //Bubble sort method
    public static String bubbleSort(double[] array) {
        boolean changed = true;
        double count = 0;
        String text;
        for (int i = 1; i < array.length && changed; i++) {
            changed = false;
            for(int j = 0; j < array.length-1; j++) {
                if(array[j]>array[j+1]) {
                    count++;
                    double temp   = array[j];
                    array[j]   = array[j+1];
                    array[j+1] = temp;
                    changed = true;
                }

            }
        }
        boolean out = true;
        String space = "";
        for(int i = 0; i < array.length ; i++){
            if(!out){
                space+=" ";
            }
            space+=array[i];
            out = false;
        }

        double average = 0;
        if(array.length == 1) {
            average = count;
        } else {
            average = count/(array.length-1);
        }
        double averageFinal = Math.floor(average*100)/100; //two decimal places.
        text = averageFinal+"-"+space+"\n";
        return text;
    }

}
