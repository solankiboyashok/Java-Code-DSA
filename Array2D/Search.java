package Array2D;

public class Search {
    public static boolean search(int mat[][],int key){
        int row=0;
        int col=mat[0].length-1;
        while(row<mat.length && col>=0){
            if(key==mat[row][col]){
                System.out.println("key is found index of ("+row+","+col+")");
                return true;
            }else if(key<mat[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args){
        int mat[][]={{1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}};
        int key=15;
        System.out.println(search(mat, key));
    }

    
}
