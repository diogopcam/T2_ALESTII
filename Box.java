import java.util.ArrayList;

public class Box {
    int[] dimensions;
    ArrayList<int[]> adjacenciesList;
    // Ideias: tratar cada trio de medidas como um array ou
    public Box (int alt, int larg, int comp){
        dimensions = new int[]{alt, larg, comp};
        adjacenciesList = new ArrayList<int[]>();
    }

    public void addAdjacent(int[] adjacent, Node vertice){
        vertice.adjacenciesList.add(adjacent);
    }

    public String dimensionsToString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < dimensions.length; i++) {
            sb.append(dimensions[i]);
            if (i != dimensions.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public String boxToString() {
        return "Box{" +
                "dimensions=" + dimensionsToString() +
                '}';
    }

    public void ordenaMedidas(Box c) {
        int[] dimensions = c.dimensions;
        int n = dimensions.length;
        boolean trocou;

        do {
            trocou = false;
            for (int i = 0; i < n - 1; i++) {
                if (dimensions[i] > dimensions[i + 1]) {
                    int temp = dimensions[i];
                    dimensions[i] = dimensions[i + 1];
                    dimensions[i + 1] = temp;
                    trocou = true;
                }
            }
            n--;
        } while (trocou);
    }

}