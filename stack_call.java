// stack call

class stack_call {
    public static void main(String[] args) {
        int x=1;
        System.out.println("Inside main() x:" +x);
        first();
    }
    static void first(){
        int x=3;
         System.out.println("Inside first() x:" +x);
        second();
    }
    static void third(){
        int x=4;
         System.out.println("Inside third() x:" +x); 
    } 
    static void second(){
        int x=8;
         System.out.println("Inside second() x:" +x);
        third();
    }
}