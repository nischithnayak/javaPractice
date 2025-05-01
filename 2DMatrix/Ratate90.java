public class Ratate90 {
    public static void main(String args[]){
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println(rotate90(mat));
    }
    public static int[][] rotate90(int mat[][]){
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int j=0;j<n;j++){
            int top=0, bottom=n-1;
            while(top<bottom){
                int temp=mat[top][j];
                mat[top][j]=mat[bottom][j];
                mat[bottom][j]=temp;
            
            top++;
            bottom--;
            }
        }
        return mat;

    } 
}
