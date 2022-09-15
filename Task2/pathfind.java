public class pathfind {
   
    public static void main(String[] args) {
    int snum =1, tnum = 7, mult =2, add =1;

        fpath(snum, tnum, mult, add, " ");
    }

    static void fpath(int sourcenum, int targetnum, int c, int d, String path) { 
        
        if (sourcenum > targetnum) return;
        
        if (sourcenum == targetnum) {
            System.out.println(path);
            return;
             }
            fpath(sourcenum * c, targetnum, c, d, path + "k1 ");
            fpath(sourcenum + d, targetnum, c, d, path + "k2 ");
    }

}  
