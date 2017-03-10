/**
 * Created by Katsiaryna_Skarzhyns on 3/10/2017.
 */
public class Starter {

    public static void main(String[] args) {

        int[] array = new int[]{-5, -10, -100, -1, 0, 1};
        SecondAfterMax elements = new SecondAfterMax();
        int x = elements.findElement(array);
        System.out.println(x);
    }
}

