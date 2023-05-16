class twoD_array_using_nested_loop{
    public static void main(String[] args){
        int [][] a={
            {2,3,4,4},
            {1,5,8,0},
            {2,9,-4,-2},
        };
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]);
            }
        }
    }
}