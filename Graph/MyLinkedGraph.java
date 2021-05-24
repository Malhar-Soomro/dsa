package com.DataStructures_And_Algorithms.Graph;

public class MyLinkedGraph {
    int size;
    List []a; // adjacency list
    public MyLinkedGraph(String[] args){
        size = args.length;
        a = new List[size];
        for(int i = 0; i < size; i++){
            a[i] = new List(args[i]);
        }
    }

    private class List {
        String vertex;
        Node edges;

        List(String vertex) {
            this.vertex = vertex;
        }

        private class Node {
            int to; // data
            Node next;

            Node(int to, Node next) {
                this.to = to;
                this.next = next;
            }
        }

        public void add(int j){
            edges = new Node(j, edges);
        }
        public String toString(){
            StringBuilder builder = new StringBuilder(vertex);
            if(edges != null) builder.append(":");
            for(Node p = edges; p!=null; p = p.next){
                builder.append(MyLinkedGraph.this
                .a[p.to].vertex); }
            return builder+"";
        }
    }

    public void add(String v, String w){
        a[index(v)].add(index(w));
        a[index(w)].add(index(v)); // a[i][j] = a[j][i] = true;
    }
    private int index(String v){
        for(int i = 0; i < size; i++){
            if(a[i].vertex.equals(v)) return i;
        }
        return a.length;
    }
    public String toString(){
        if(size == 0) return "{}";
        StringBuilder builder = new StringBuilder("{" + a[0]);
        for(int i = 1; i < size; i++){
            builder.append(",").append(a[i]);
        }
        return builder+"}";
    }


    public static void main(String[] args) {
        MyLinkedGraph linkedGraph = new MyLinkedGraph(new String[]{"A","B", "C", "D"});
        System.out.println(linkedGraph);

    }
}
