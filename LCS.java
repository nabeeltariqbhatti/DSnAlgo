  static char[] a = new char[]{'b','d','\0'};
    static   char[] b = new char[]{'a','b','c','d','\0'};
    public  static int LCS(int i , int j){
        if(a[i] == '\0' ||  b[j] == '\0'){
            return 0;
        }else if(a[i] == a[j]){
            return 1+LCS(i+1,j+1);
        }else {
            return Math.max(LCS(i,j+1),LCS(i+1,j));
        }
    }
