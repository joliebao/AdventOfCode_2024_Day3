import java.util.ArrayList;

public class AdventDay {
    private ArrayList<String> str;
    private int total;

    public AdventDay(ArrayList<String> s) {
        str = s;
        total = 0;
    }

    public int Multiply(){
        for (String line : str){
            while (line.contains("mul(")){
                int i = line.indexOf("mul(");
                line = line.substring(i+4);

                if (line.contains(")")){    // needs to be specific to the mul(1,2) thing...
                    //idk! :L
                    int first = Integer.parseInt(line.substring(0, line.indexOf(",")));
                    int second = Integer.parseInt(line.substring(line.indexOf(",") + 1, line.indexOf(")")));
                    total += first * second;
                    line = line.substring(line.indexOf(")"));
                } else {
                    line = line.substring(line.indexOf("("));
                }
            }
        }
        return total;
    }
}
