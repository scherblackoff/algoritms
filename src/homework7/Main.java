package homework7;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {

    public static void main(String[] args) {
        testGraph();
    }

    private static void testGraph(){
        Graph graph = new Graph(10);
        graph.addVertex("Москва");
        graph.addVertex("Воронеж");
        graph.addVertex("Тула");
        graph.addVertex("Липецк");
        graph.addVertex("Калуга");
        graph.addVertex("Рязань");
        graph.addVertex("Тамбов");
        graph.addVertex("Орел");
        graph.addVertex("Курск");
        graph.addVertex("Саратов");

        graph.addEdges("Москва", "Тула", "Рязань", "Калуга");
        graph.addEdges("Тула",  "Липецк", "Москва");
        graph.addEdges("Липецк", "Воронеж", "Тула");
        graph.addEdges("Рязань", "Тамбов", "Москва");
        graph.addEdges("Тамбов", "Саратов", "Рязань");
        graph.addEdges("Саратов", "Тамбов", "Воронеж");
        graph.addEdges("Воронеж", "Саратов", "Липецк", "Курск");
        graph.addEdges("Курск", "Воронеж", "Орел");
        graph.addEdges("Орел", "Курск", "Калуга");
        graph.addEdges("Калуга", "Орел", "Москва");

        System.out.println("Size of graph is " + graph.getVertexSize());
        graph.display();
        graph.find("Тула", "Орел");
    }

    private static void testDsf(){
        Graph graph = new Graph(7);
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");

        graph.addEdges("A", "B", "C", "D");
        graph.addEdges("B", "E");
        graph.addEdges("D", "F");
        graph.addEdges("F", "G");

        graph.dfs("A");
    }

    private static void testBsf(){
        Graph graph = new Graph(7);
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");

        graph.addEdges("A", "B", "C", "D");
        graph.addEdges("B", "E");
        graph.addEdges("D", "F");
        graph.addEdges("F", "G");

        graph.bfs("A");
    }
}
