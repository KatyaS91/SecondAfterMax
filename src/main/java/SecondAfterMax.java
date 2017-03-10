import java.util.Arrays;

/**
 * Created by Katsiaryna_Skarzhyns on 3/10/2017.
 */
public class SecondAfterMax {

    public int findElement(int[] x) {

        int max = x[0];
        int secondAfterMax = 0;

        for (int i = 0; i < x.length; i++) {
            if (max < x[i]) {
                secondAfterMax = max;
                max = x[i];
            } else if(max > x[i]){
                secondAfterMax = x[i];
            }
        }
        return secondAfterMax;
    }
}