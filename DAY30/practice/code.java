package practice;

import java.util.*;

class ReversingthefirstKElementsOfQueue {

    static class Cell {
        int x, y; // Position
        int dist; // Distance from source

        public Cell(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    static boolean isInside(int x, int y, int N) {
        return (x >= 1 && x <= N && y >= 1 && y <= N);
    }

    // BFS function to find minimum steps
    static int minStepToReachTarget(int knightPos[], int targetPos[], int N) {

        // All possible moves for a knight
        int dx[] = {-2, -1, 1, 2, -2, -1, 1, 2};
        int dy[] = {-1, -2, -2, -1, 1, 2, 2, 1};

        // Queue for BFS
        Queue<Cell> q = new LinkedList<>();
        q.add(new Cell(knightPos[0], knightPos[1], 0));

        // Visited array to avoid revisiting cells
        boolean visited[][] = new boolean[N + 1][N + 1];
        visited[knightPos[0]][knightPos[1]] = true;

        // BFS loop
        while (!q.isEmpty()) {
            Cell t = q.poll();

            // If target is reached
            if (t.x == targetPos[0] && t.y == targetPos[1]) {
                return t.dist;
            }

            // Check all 8 possible moves
            for (int i = 0; i < 8; i++) {
                int x = t.x + dx[i];
                int y = t.y + dy[i];

                if (isInside(x, y, N) && !visited[x][y]) {
                    visited[x][y] = true;
                    q.add(new Cell(x, y, t.dist + 1));
                }
            }
        }

        return Integer.MAX_VALUE; // If not reachable
    }

    public static void main(String[] args) {
        int N = 30; 
        int knightPos[] = {1, 1};
        int targetPos[] = {30, 30};

        System.out.println(minStepToReachTarget(knightPos, targetPos, N));
    }
}
