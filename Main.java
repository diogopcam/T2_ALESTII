import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String args[]) {

        Graph graph = new Graph();

        try{
            BufferedReader l = new BufferedReader(new FileReader("entrada"));
            BufferedReader reader = l;

            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] linhaQuebra = linha.split(" ");
                int val1= Integer.parseInt(linhaQuebra[0]);
                int val2 = Integer.parseInt(linhaQuebra[1]);
                int val3 = Integer.parseInt(linhaQuebra[2]);
//                System.out.println(val1);
//                System.out.println(val2);
//                System.out.println(val3);

                Box box = new Box(val1, val2, val3);

                box.ordenaMedidas(box);
                graph.addBox(box);
//                box.ordenaMedidas(box);
//                System.out.println(box.boxToString());
//                System.out.println(box.dimensionsToString());
//                printArray(box.dimensions);

            }

            graph.printAllBoxes();
            } catch (IOException e) {
            e.printStackTrace();
        }
        }
//    public static void printArray ( int[] array){
//        System.out.print("[");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]);
//            if (i != array.length - 1) {
//                System.out.print(", ");
//            }
//        }
//        System.out.println("]");
//    }
}


