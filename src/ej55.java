import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ej55 {
    public static void main (String[] args){
        List pares = new ArrayList();
        for (int i = 0; i < 51; i=i+2) {
            pares.add(i);
        }
        System.out.println(pares);
    }
}
