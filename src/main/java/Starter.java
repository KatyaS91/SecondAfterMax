/**
 * Created by Katsiaryna_Skarzhyns on 3/10/2017.
 */
public class Starter {

    public static void main(String[] args){

        int[] array = new int[]{-7, 55, -1, 2, 8, 1, 7, 3, -2, 9, 99};
        SecondAfterMax elements = new SecondAfterMax();
        int x = elements.findElement(array);
        System.out.println(x);
    }
}

