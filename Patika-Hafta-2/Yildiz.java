public class Yildiz {
    public static void main(String[] args) {
        char[][] letter = {
            {'*', '*', '*', ' ', ' '},
            {'*', ' ', ' ', '*', ' '},
            {'*', ' ', ' ', '*', ' '},
            {'*', '*', '*', ' ', ' '},
            {'*', ' ', ' ', '*', ' '},
            {'*', ' ', ' ', '*', ' '},
            {'*', '*', '*', ' ', ' '}
        };

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                System.out.print(letter[i][j]);
            }
            System.out.println();
        }
    }
}