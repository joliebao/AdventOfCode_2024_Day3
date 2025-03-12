import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdventDay {
    private ArrayList<String> str;

    public AdventDay(ArrayList<String> s) {
        str = s;
    }

    public int Multiply(){
        int total = 0;
        for (String line : str){
            while (line.contains("mul(")){
                int i = line.indexOf("mul(");
                line = line.substring(i+4);

                System.out.println(total);
//                System.out.println(line);

                try {
                    int first = Integer.parseInt(line.substring(0, line.indexOf(",")));
                    int second = Integer.parseInt(line.substring(line.indexOf(",") + 1, line.indexOf(")")));
                    System.out.println(first);
                    System.out.println(second);
                    total += first * second;
                    line = line.substring(line.indexOf(")"));
                }
                catch (Exception e) {
                    line = line.substring(line.indexOf("("));
                }
            }
        }
        return total;
    }
}
