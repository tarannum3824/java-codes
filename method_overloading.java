// method overloading:Method overloading in java is a feature that allows a class to have more than one method with the same name, but with different parameters.

class method{
    void addition(){
        int a=4,b=5;
        System.out.println("Addition is:"+(a+b));
    }
    void addition(int a,int b){
        System.out.println("Additio is:"+(a+b));
    }
    void addition(int a,double b){
        System.out.println("Additio is:"+(a+b));
    }
    void addition(double a,int b){
        System.out.println("Additio is:"+(a+b));
    }
    void addition(double a,double b){
        System.out.println("Additio is:"+(a+b));
    }
}
class method_overloading{
    public static void main(String[] args){
        method m=new method();
        m.addition();
         m.addition(14,79);
          m.addition(4,7.6);
           m.addition(3.8,6);
            m.addition(2.4,6.7);
        
    }
}