
package Graph;

import java.util.Stack;

public class Graph {
    private final int MAX_VERS = 20;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    
    //BFS
    public void bfs(){
        System.out.println("Visit by using"+" BFS algorithm: ");
        vertexList[0].wasVisited = true;
        displayVertex(0);
        theQueue.insert(0);
        
        int v2;
        while (!theQueue.isEmpty()){
            int v1 =(int) theQueue.remove();
            while ((v2 = getAdjUnvisitedVertex(v1))!=-1){
                vertexList[v2].wasVisited = true;
                displayVertex(v2);
                theQueue.insert(v2);
            }
        }
        System.out.println("");
        resetFlags();
    }
    
    private Queue theQueue;
    
    public Graph(){
        vertexList = new Vertex[MAX_VERS];
        adjMat =new int [MAX_VERS][MAX_VERS];
        nVerts = 0;
        for (int i = 0; i < MAX_VERS; i++){
            for (int j = 0; j < MAX_VERS; j++){
                adjMat[i][j]= 0;
            }
        }
        
        //DFS
        theQueue = new Queue(MAX_VERS);
    }
    
    public void addVertex(char label){
        vertexList[nVerts++] =
                new Vertex(label);
    }
    
    public void addEdge (int start, int end){
        adjMat[start][end]=1;
        adjMat[end][start]=1;
    }
    
    public void display(){
        System.out.println("Adjecency:");
        for(int row =0; row<nVerts; row++){
            for (int col = 0; col < row; col++){
                if (adjMat[row][col] == 1){
                    System.out.println(
                    vertexList[row].label +" -- "+ vertexList[col].label);
                }
            }
        }
        System.out.println("");
    }
    
    public void displayVertex(int v){
        System.out.print(vertexList[v].label+" ");
    }
    
    public int getAdjUnvisitedVertex(int v){
    for (int i = 0; i < nVerts; i++){
        if (adjMat[v][i] == 1 && vertexList[i].wasVisited == false){
            return i;
        }
    }
    return -1;
    }
    
    private void resetFlags(){
        for (int i = 0; i < nVerts; i++){
            vertexList[i].wasVisited = false;
        }
    }
}
