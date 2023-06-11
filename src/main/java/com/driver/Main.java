package com.driver;

 class  A{
    static String meth(){
        return "Invoking method from class A";
    }
}


 class B extends A{

    public Object meth;

    static String meth(){
        return "Method is overridden in Extendend class B";
    }
}
public class Main {

    public static void main(String[] args) {
      B b=new B();
      b.meth();

      B bi=new B();
      bi.meth();
    }
}