public class Labirinto {

    static boolean resolver(char[][] lab, int x, int y) {

        if (lab[x][y] == 'S')
            return true;

        if (lab[x][y] != '.' && lab[x][y] != 'E')
            return false;

        if (lab[x][y] != 'E')
            lab[x][y] = '*';

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {
            if (resolver(lab, x + dx[i], y + dy[i]))
                return true;
        }

        if (lab[x][y] != 'E')
            lab[x][y] = '.';

        return false;
    }

    public static void main(String[] args) {
        char[][] lab = {
            {'#','#','#','#','#'},
            {'#','E','.','.','#'},
            {'#','#','#','.','#'},
            {'#','.','.','S','#'},
            {'#','#','#','#','#'}
        };

        resolver(lab, 1, 1);

        for (char[] linha : lab) {
            for (char c : linha)
                System.out.print(c + " ");
            System.out.println();
        }
    }
}