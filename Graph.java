import org.w3c.dom.Node;

import java.util.ArrayList;

public class Graph {
    ArrayList<Box> graph;
    int nodesNumber;

    public Graph(){
        //nodesNumber = nodes;
        graph = new ArrayList<Box>();
    }

    public void addBox(Box b){
        graph.add(b);
    }

    // Função para imprimir todos os nós do grafo
    public void printAllBoxes() {
        System.out.println("Nodes in the graph:");
        for (Box box : graph) {
            System.out.println(box.boxToString());
//            System.out.println(b); // Supondo que Box tenha um método toString() adequado
        }
    }


}
//    class Graph(){
//
//    }
////    Graph(filename) Cria um grafo a partir de um arquivo de entrada)
////    addEdge(v, w) Adiciona uma aresta v-w
////    string[] getAdj(v) Vértices adjacentes a v
////    totalV() Número de vértices
////    totalE() Número de arestas
////    string[] getVerts() Lista de vértices
//}
