import java.awt.Point;
import java.util.Stack;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {

    private static void flood(int i, int j, int[][] map) {
        Stack<Point> neighbours = new Stack<>();
        neighbours.push(new Point(i, j));

        while (!neighbours.isEmpty()) {
            Point p = neighbours.pop();
            int x = (int) p.getX();
            int y = (int) p.getY();

            if (x < 0 || y < 0 || x >= map.length || y >= map[x].length)
                continue;

            if (map[x][y] != 1)
                continue;

            map[x][y] = -1;
            neighbours.push(new Point(x - 1, y));
            neighbours.push(new Point(x + 1, y));
            neighbours.push(new Point(x, y - 1));
            neighbours.push(new Point(x, y + 1));
        }

    }

    public static int solve(int[][] map) {

        int islandCount = 0;

        for (int i = 0; i < map.length; i++) {
            int[] row = map[i];
            for (int j = 0; j < row.length; j++) {
                if (map[i][j] == -1 || map[i][j] == 0)
                    continue;

                islandCount++;
                flood(i, j, map);
            }
        }

        return islandCount;
    }

    public static void main(String[] args) {
        int[][] map = { { 1, 0, 0, 0, 0, }, { 0, 0, 1, 1, 0 }, { 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0 }, { 1, 1, 0, 0, 1 },
                { 1, 1, 0, 0, 1 } };

        System.out.println(solve(map)); // 4

    }

}