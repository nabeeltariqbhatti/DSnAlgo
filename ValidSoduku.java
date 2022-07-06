public class ValidSoduku {

    public boolean isValidSodoku(char[][] sodoku){
        for(int i=0;i<sodoku.length;i++){
            char[] col =new char[9];
            if(!isValid(sodoku[i])){
               return false;
            }
            for (int j = 0; j <sodoku[i].length ; j++) {
                col[j] = sodoku[j][i];
            }
            if(!isValid(col)){
                return false;
            }
        }


        for(int i=0; i< sodoku.length;i+=3){
            char[] box;
            for (int j = 0; j <sodoku.length ; j+=3) {
               box = createBox(i,i+2,j,j+2,sodoku);
                if(!isValid(box)){
                    return false;
                }
            }

        }

        return true;
    }

    private char[] createBox(int rowStart, int rowEnd, int columnStart, int columnEnd, char[][] sodoku) {
        char[] box = new char[9];
        int index =0;
        for (int i = rowStart; i <=rowEnd ; i++) {
            for (int j = columnStart; j <=columnEnd ; j++) {
                box[index++] = sodoku[i][j];
            }
        }
        return box;
    }

    private boolean isValid(char[] chars) {
        Set<Character> charSet = new HashSet<>();
        for (Character character : chars) {
            if(character=='.')continue;
            if(charSet.contains(character)){
                return false;
            }else {
                charSet.add(character);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean validSodoku = new ValidSoduku().isValidSodoku(new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}});
        System.out.println(validSodoku);
    }
}
