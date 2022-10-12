// https://leetcode.com/problems/flood-fill/submissions/
package sln;

public class FloodFill {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int old = image[sr][sc];
        if (old == color) {
            return image;
        }
        image[sr][sc] = color;

        if (sr > 0 && image[sr-1][sc] == old) {
            floodFill(image, sr-1, sc, color);
        }
        if (sr < image.length-1 && image[sr+1][sc] == old) {
            floodFill(image, sr+1, sc, color);
        }
        if (sc > 0 && image[sr][sc-1] == old) {
            floodFill(image, sr, sc-1, color);
        }
        if (sc < image[0].length-1 && image[sr][sc+1] == old) {
            floodFill(image, sr, sc+1, color);
        }
        return image;
    }
}
