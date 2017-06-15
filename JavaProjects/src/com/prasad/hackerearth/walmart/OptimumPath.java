package com.prasad.hackerearth.walmart;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;


/**
 * Consider an undirected graph containing N nodes and  M edges. Each edge Mi  has an integer cost, Ci, associated with it.

 The penalty of a path is the bitwise OR of every edge cost in the path between a pair of nodes, A  and B .
 In other words, if a path contains edges M1,M2...,Mk then the penalty for this path is C1  OR C2  OR ... OR  Ck.

 Given a graph and two nodes, A and  B, find the path between  A and B having the minimal possible penalty and
 print its penalty; if no such path exists, print -1 to indicate that there is no path from A to B .

 Note: Loops and multiple edges are allowed. The bitwise OR operation is known as or in Pascal and as | in C++ and Java.

 Input Format

 The first line contains two space-separated integers, N (the number of nodes) and M (the number of edges), respectively.

 Each line i of the M  subsequent lines contains three space-separated integers Ui, Vi , and Ci, respectively,
 describing edge Mi  connecting the nodes Ui and Vi and its associated penalty (Ci).

 The last line contains two space-separated integers, A (the starting node) and B (the ending node), respectively.
 *
 *
 *
 1 <= N <= 10^3
 1 <= M <= 10^4
 1 <= Ci < 1024
 1 <= Ui,Vi <= N
 1 <= A,B <= N
 A != B
 *
 Output Format

 Print the minimal penalty for the optimal path from node A to node B; if no path exists from node A to node B,
 print -1 .
 *
 *
 *
 Sample Input

 3 4
 1 2 1
 1 2 1000
 2 3 3
 1 3 100
 1 3
 Sample Output

 3
 *
 *
 Explanation

 The optimal path is 1 -> 2 -> 3.
 C(1,2) =1  and C(2,3) = 3.
 The penalty for this path is: 1 OR 3, so we print 3 .

 */


public class OptimumPath
{
    String line;
    StringTokenizer inputParser;
    BufferedReader is;
    FileInputStream fstream;
    DataInputStream in;
    String FInput="";


    void openInput(String file) throws Exception
    {

        if(file==null) {
//            is = new BufferedReader(new InputStreamReader(System.in));//stdin
              is = new BufferedReader(new FileReader("resource\\optimum_path.txt"));
        }
        else
        {
            try{


                fstream = new FileInputStream(file);
                in = new DataInputStream(fstream);
//                is = new BufferedReader(new InputStreamReader(in));
                  is = new BufferedReader(new FileReader("resource\\optimum_path.txt"));

            }catch(Exception e)
            {
                System.err.println(e);
            }
        }

    }

    void readNextLine()
    {
        try {
            line = is.readLine();
            inputParser = new StringTokenizer(line, " ");
            //System.err.println("Input: " + line);
        } catch (IOException e) {
            System.err.println("Unexpected IO ERROR: " + e);
        }

    }

    int NextInt()
    {
        String n = inputParser.nextToken();
        int val = Integer.parseInt(n);

//        System.out.println("I read this number: " + val);
        return val;
    }

    private double NextDouble() {
        String n = inputParser.nextToken();
        double val = Double.parseDouble(n);
        return val;
    }

    String NextString()
    {
        String n = inputParser.nextToken();
        return n;
    }

    void closeInput()
    {
        try {
            is.close();
        } catch (IOException e) {
            System.err.println("Unexpected IO ERROR: " + e);
        }

    }

    public void readFInput()
    {
        for(;;)
        {
            try
            {
                readNextLine();
                FInput+=line+" ";
            }
            catch(Exception e)
            {
                break;
            }
        }
        inputParser = new StringTokenizer(FInput, " ");
    }

    long NextLong()
    {
        String n = inputParser.nextToken();

        long val = Long.parseLong(n);

        return val;
    }

    public static void main(String [] argv) throws Exception
    {
        //String filePath="input.txt";
        String filePath=null;
        if(argv.length>0) {
            filePath = argv[0];
        }
        new OptimumPath(filePath);
    }

    public OptimumPath(String inputFile) throws Exception
    {
        openInput(inputFile);
        StringBuilder sb = new StringBuilder();
        readNextLine();
        int N= NextInt();
        int M= NextInt();
        Graph g = new Graph(N);
        for(int i=0; i<M; i++)
        {
            readNextLine();
            int u=NextInt()-1;
            int v=NextInt()-1;
            int w=NextInt();

            g.p[u].ngh.add(new Edge(i+1, v, w));
            g.p[v].ngh.add(new Edge(i+1, u, w));
        }
        readNextLine();
        int start=NextInt()-1;
        int end=NextInt()-1;

        sb.append(g.getRes(start, end));
        System.out.println(sb);
        closeInput();
    }

    private class Edge
    {
        int to;
        int id;
        int w;

        Edge(int id, int to, int w)
        {
            this.id=id;
            this.to=to;
            this.w=w;
        }
    }

    private class Graph
    {
        Node [] p;
        Graph(int N)
        {
            p = new Node[N];
            for(int i=0; i<N; i++)
            {
                p[i] = new Node(i);

            }
        }

        int ret = 1000000000;
        int endId=-1;
        HashSet <Integer> seen = new HashSet<Integer>();
        void fill(int x, int val)
        {
            if(seen.contains(x*1000000+val))return;
            seen.add(x*1000000+val);
            p[x].min = val;
            //System.err.println(x+" "+val);
            if(x==endId)
            {
                ret = Math.min(ret, val);
                return;
            }
            for(Edge e:p[x].ngh)
                fill(e.to, val|e.w);
        }

        public int getRes(int start, int end) {
            endId=end;
            fill(start,0);

            return ret==1000000000?-1:ret;
        }
    }

    private class Node implements Comparable<Node>
    {
        ArrayList <Edge> ngh = new ArrayList<Edge>();
        long len=Long.MAX_VALUE;
        Edge from = null;
        int id;
        int min=1000000000;

        Node (int id)
        {
            this.id=id;
        }
        public int compareTo(Node d)
        {
            if(d.len>len)return -1;
            if(d.len<len)return 1;
            return 0;
        }
    }

}
