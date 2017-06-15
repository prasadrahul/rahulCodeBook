package com.prasad.hackerearth.moonfroglabs;

import java.io.*;
import java.util.*;

public final class vanya_array
{
    static long[] bit;
    static int maxn=1000015;
    static FastScanner sc=new FastScanner(new BufferedReader(new InputStreamReader(System.in)));
//    static FastScanner sc=new FastScanner(new BufferedReader(new FileReader("resource\\buy_sell.txt")));
    static PrintWriter out=new PrintWriter(System.out);

    static void update(int idx)
    {
        while(idx<maxn)
        {
            bit[idx]++;
            idx+=idx&-idx;
        }
    }

    static long query(int idx)
    {
        long sum=0;
        while(idx>0)
        {
            sum=sum+bit[idx];
            idx-=idx&-idx;
        }
        return sum;
    }

    public static void main(String args[]) throws Exception
    {
        int n=sc.nextInt(),k=sc.nextInt();
        int[] a=new int[n],b=new int[n];bit=new long[maxn];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            b[i]=a[i];
        }
        Arrays.sort(b);
        for(int i=0;i<n;i++)
        {
            a[i]=Arrays.binarySearch(b,a[i])+1;
        }
        long[] val=new long[n];
        for(int i=n-1;i>=0;i--)
        {
            val[i]=query(maxn-1)-query(a[i]);
            update(a[i]);
        }
        Arrays.sort(val);
        long res=0;
        for(int i=n-1;i>0;i--)
        {
            int low=1,high=i;
            while(low<high)
            {
                int mid=(low+high+1)>>1;
                if(val[i]+val[i-mid]>=k)
                {
                    low=mid;
                }
                else
                {
                    high=mid-1;
                }
            }
            if(val[i]+val[i-low]>=k)
            {
                res=res+((i-1)-(i-low)+1);
            }
        }
        out.println(res);
        out.close();
    }
}
class FastScanner
{
    BufferedReader in;
    StringTokenizer st;
    public FastScanner(BufferedReader in) {
        this.in = in;
    }

    public String nextToken() throws Exception {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(in.readLine());
        }
        return st.nextToken();
    }

    public String next() throws Exception {
        return nextToken().toString();
    }

    public int nextInt() throws Exception {
        return Integer.parseInt(nextToken());
    }
    public long nextLong() throws Exception {
        return Long.parseLong(nextToken());
    }
    public double nextDouble() throws Exception {
        return Double.parseDouble(nextToken());
    }
}