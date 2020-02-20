package hashcode2020;

import java.util.ArrayList;
import java.util.List;

public class MathSorcerer {

    private int maxSlices= 0;
    private int numberOfTypesOfPizza=0;
    private List<String> typeOfPizza;
    int[] slices;



    public List<String[]> grind(List<String[]> content) {

        //inizializzatore

        maxSlices = Integer.parseInt(content.get(0)[0]);
        numberOfTypesOfPizza = Integer.parseInt(content.get(0)[1]);
        typeOfPizza = new ArrayList();
        slices = new int[content.get(1).length];
        for (int j = 0; j < content.get(1).length; j++) {
            slices[j] = Integer.parseInt(content.get(1)[j]);
        }


        //machine
//        int maxTemp = 0;
//        if (maxTemp + slices[0] < maxSlices) {
//            maxTemp = maxTemp + slices[0];
//            typeOfPizza.add("0");
//        }
//
//        for (int i = 0, j = 1; j < slices.length; i++, j++) {
//            if (maxTemp + slices[j] < maxSlices) {
//                maxTemp = maxTemp + slices[j];
//                typeOfPizza.add(String.valueOf(j));
//            } else {
//                System.out.println("il numero che ci si avvicina è "+ maxTemp+ " doveva arrivare a "+ maxSlices);
//                break;
//            }
//
//        }
//
        int lol=0;
        lol=checkAlbero(-1,0);
        System.out.println(lol);

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



    private int checkAlbero(int indexRaggiunto, int valoreRaggiunto){
        int massimoTraIValoriTrovati=valoreRaggiunto;
        int valoreTrovato=0;
        for (int i=indexRaggiunto+1; i<slices.length;i++){
            if (valoreRaggiunto+slices[i]<maxSlices){
                valoreTrovato=checkAlbero(i,valoreRaggiunto+slices[i]);
                System.out.println(valoreTrovato);
                if (valoreTrovato>valoreRaggiunto) {
                    if (valoreTrovato>massimoTraIValoriTrovati){
                        massimoTraIValoriTrovati=valoreTrovato;
                    }
                }
            }else{
                break;
            }
        }return massimoTraIValoriTrovati;
    }
}
