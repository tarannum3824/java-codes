// method overriding:In Java, method overriding occurs when a subclass (child class) has the same method as the parent class.
//                     some bullets points:
//1.method is overridden when super class and sub class having same name.
//2.if method is overriden the object call the sub class method.

class method{
    void addition(){
        int a=4,b=5;
        System.out.println("Addition is:"+(a+b));
    }
}
class method1 extends method { 
    void addition(){
        int a=6,b=98;
        System.out.println("Addition is:"+(a+b));
    }
}
class method_overriding{
    public static void main(String[] args){
        method1  m1=new method1();
        m1.addition(); //object m1 call the sub class method(addition) because method is over ride
        
    }
}
//if method is not over ridden means methods name addition is change in sub class then object call the method of super class
