import java.lang.reflect.Array;
import java.util.ArrayList;

public class Node {
    int[] values;
    // Esse atributo corresponde a sequencia de três valores da caixa
    // Optei por utilizar um array pois os números armazenados serão sempre 3, se a necessidade de alocar mais espaços
    ArrayList<int[]> adjacenciesList;
    // Esse atributo corresponde a lista de caixas com a qual o nodo atual se conecta

    public Node(int[] v){
        values = v;
        adjacenciesList = new ArrayList<int[]>();
    }

    public void addAdjacent(int[] adjacent, Node vertice){
        vertice.adjacenciesList.add(adjacent);
    }
}
