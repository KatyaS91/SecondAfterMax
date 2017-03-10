import java.util.Arrays;

/**
 * Created by Katsiaryna_Skarzhyns on 3/10/2017.
 */
class SecondAfterMax {

    public int findElement(int[] x) {

        int max = x[0];
        int secondAfterMax = x[0];

        for (int i = 0; i < x.length; i++) {
            if (max < x[i]) {
                secondAfterMax = max;
                max = x[i];
            } else if (secondAfterMax < x[i] || secondAfterMax == max) {
                secondAfterMax = x[i];
            }
        }
        return secondAfterMax;
    }
}

