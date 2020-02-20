package hashcode2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MathSorcerer {
    public List<String[]> grind(List<String[]> content) {

        //inizializzatore

        int maxSlices = Integer.parseInt(content.get(0)[0]);
        int numberOfTypesOfPizza = Integer.parseInt(content.get(0)[1]);
        List<String> typeOfPizza = new ArrayList();
        int[] slices = new int[content.get(1).length];
        int typeOfPizzaIndex = 0;
        for (int j = 0; j < content.get(1).length; j++) {
            slices[j] = Integer.parseInt(content.get(1)[j]);
        }
        System.out.println(Arrays.toString(slices));



        //machine
        int maxTemp = 0;
        if (maxTemp + slices[0] < maxSlices) {
            maxTemp = maxTemp + slices[0];
            typeOfPizza.add("0");
        }

        for (int i = 0, j = 1; j < slices.length; i++, j++) {
            if (maxTemp + slices[j] < maxSlices) {
                maxTemp = maxTemp + slices[j];
                typeOfPizza.add(String.valueOf(j));
                typeOfPizzaIndex++;
            } else {
                System.out.println("il numero che ci si avvicina è "+ maxTemp+ " doveva arrivare a "+ maxSlices);
                break;
            }

        }




        //converter
        List<String[]> result = new ArrayList<>();

        String[] head = new String[1];
        String[] tail = new String[typeOfPizza.size()];
        head[0] = String.valueOf(typeOfPizza.size());

        int i = 0;
        for (String pizza : typeOfPizza) {
            tail[i] = pizza;
            i++;
        }
        result.add(head);
        result.add(tail);
        return result;
    }
}
