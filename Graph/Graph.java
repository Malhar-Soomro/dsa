package com.DataStructures_And_Algorithms.Graph;

public class Graph {
int size;
String []vertices;
boolean[][] a;

public Graph(String[] args){
    size = args.length;
    vertices = new String[size];
    a = new boolean[size][size]; // empty
    System.arraycopy(args,0,vertices,0,size);

}

public void add(String v , String w){
    // Fetch the location of vertex v and w
    int i = index(v), j = index(w);
    // Create the adjacency matrix
    a[i][j] = a[j][i] = true;
}

// Index method will return an index of that Node(String)
private int index(String v){
    for(int i = 0; i < size; i++) {
        if (vertices[i].equals(v)) return i;
//        System.out.println(vertices[i]);
    }
        return a.length;
}

public String toString(){
    if(size == 0) return "{}";
    StringBuilder buffer = new StringBuilder("{" + vertex(0));
    for(int i = 1; i < size; i++){
        buffer.append(",").append(vertex(i));
    }
    return buffer+ "}";
}

private String vertex(int i){
    StringBuilder builder = new StringBuilder(vertices[i] +":");
    for(int j = 0; j < size; j++){
        if(a[i][j]) {
            builder.append(vertices[j]);
//            System.out.println(vertices[i] + ":" + vertices[j]);
        }
    }
//    System.out.println(builder);
    return builder +"";
}

public static void main(String[] args){
Graph g = new Graph(new String[]{"A", "B", "C", "D", "E"});
    g.add("A", "B");
//    g.index("A");
    g.add("A", "C");
    g.add("C", "B");
//    g.vertex(0);
    System.out.println(g);

}
}


