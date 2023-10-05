package SAMSUNGPTITJAVADSA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class dsa1181 {
    static int v, e, first;
    static boolean[] visited;
    static ArrayList<Integer>[] adj;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        first = Integer.parseInt(st.nextToken());

        adj = new ArrayList[v + 1];
        for (int i = 1; i <= v; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
            adj[v].add(u);
        }
        br.close();
    }

    public static void bfs(int u) {
        Queue<Integer> q = new LinkedList<>();
        q.add(u);
        visited[u] = true;

        StringBuilder sb = new StringBuilder();
        while (!q.isEmpty()) {
            u = q.poll();
            sb.append(u).append(" ");

            Iterator<Integer> iterator = adj[u].iterator();
            while (((Iterator<?>) iterator).hasNext()) {
                int tmp = iterator.next();
                if (!visited[tmp]) {
                    visited[tmp] = true;
                    q.add(tmp);
                }
            }
        }

        System.out.println(sb.toString());
    }

    public static void solve() {
        visited = new boolean[v + 1];
        bfs(first);
        for (int i = 1; i <= v; i++) {
            adj[i].clear();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            input();
            solve();
        }
        br.close();
    }
}
