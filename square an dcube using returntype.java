// square of number using method 

class sqrt {
    public static void main(String[] args) {
       System.out.println(square(4));
       System.out.println(cube(6));
    }
        static int square(int n1){//here int is an returntype
            return n1*n1;
        }
        static double cube(int n2){ //here static is used befor method becouse this method is in main method
            return n2*n2*n2;
        }
    
}