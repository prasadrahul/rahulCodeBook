package com.prasad;

import java.util.*;

/**
 * Created by rahul on 08/13/2016.
 */
//class Test{
//    public static void main(String args[])
//    {
//        String s = "Hello World";
//        int i = s.indexOf('o');
//        int j = s.lastIndexOf('l');
//        System.out.print(i + " " + j);
//
//    }
//}

//public class Test
//{
//    int x =2;
//    Test(int i) { x = i; }
//    public static void main(String[] args) {
//        Test t = new Test(3);
//        System.out.println("x = " + t.x);
//    }
//}

//class Test {
//    int x;
//    int y;
//    boolean isequal() {
//        return(x == y);
//    }
//}
//class Output {
//    public static void main(String args[])
//    {
//        Test obj = new Test();
//        obj.x = 10;
//        obj.y = 10;
//        System.out.println(obj.isequal());        }
//}

//
//class Test implements Runnable {
//    Thread t;
//    Test() {
//        t = new Thread(this,"Hello");
//        t.start();
//    }
//    public void run() {
//        System.out.println(t.getName());
//    }
//}
//class multithreaded_programing {
//    public static void main(String args[]) {
//        new Test();
//    }
//}


//public class Main {
//    public static void main(String args[]) {
////        int x,y;
////        x = 3 & 6;
////        y = 3 | 6;
////        System.out.println(x + " " + y);
//        long x = 302121272;
//
//        for (int i = 0; i < 10; i++) {
//            x = x +x ;
//            System.out.println("ans :" + x);
//        }
//
//    }
//}

//
//class A1
//{ }
//class B1 extends A1
//{ }
//
//class c1
//{
//    public static void main(String[]a)
//    {
//        B1 b = new B1();
//    }
//}

//class Sample{
//    public static void main(String args[])
//    {
//        {
//            int sum = 0;
//            for (int i = 0, j = 0; i < 5 & j < 5; ++i, j = i + 1)
//                sum += i;
//            System.out.println(sum);
//        }
//    }
//}

//class S
//{
//    public static void main(String [] args)
//    {
//        boolean b1 = true;
//        boolean b2 = false;
//        boolean b3 = true;
//        if ( b1 & b2 | b2 & b3 | b2 | b1 )
//            System.out.println("ok");
//    }
//}

//class Equality {
//    int x;
//    int y;
//    boolean isequal() {
//        return(x == y);
//    }
//}
//class Output {
//    public static void main(String args[])
//    {
//        Equality obj = new Equality();
//        obj.x = 10;
//        obj.y = 10;
//        System.out.println(obj.isequal());        }
//}


//class Test
//{
//    public static void call(Exception e)
//    {
//        System.out.println("Exception");
//    }
//    public static void call(NullPointerException e)
//    {
//        System.out.println("NullPointer");
//    }
//    public static void call(Object e)
//    {
//        System.out.println("Object");
//    }
//    public static void main(String args[])
//    {
//        call(null);
//    }
//
//}

//
//class Base{
//    int value = 0;
//    Base(){
//        addValue();
//    }
//    void addValue(){
//        value += 10;
//    }
//    int getValue(){
//        return value;
//    }
//}
//class Derived extends Base{
//    Derived(){
//        addValue();
//    }
//    void addValue(){
//        value +=  30;
//    }
//}
//class Test {
//    public static void main(String[] args){
//        Derived b= new Derived();
//        System.out.println(b.getValue());
//    }
//}

//Implementing which of the following can make a JSP page thread safe?
//
//        <%@page isThreadSafe=”false” %>
//<%@page isThreadSafe=”true” %>
//<%@page isThread=”false” %>
//<%@page isThread=”true” %>

//import java.lang.Object.


//Which of these should be written to instantiate Class in the below code?
//
//public class Class{
//    public Class(){/*code*/}
//// more code...
//}
//MyClass mc = new MyClass();
//MyClass mc = MyClass();
//MyClass mc = MyClass;
//It can't be done. The constructor of MyClass should be defined as public void MyClass(){/*code*/}


//Which of the following can be used to call Stored Procedure?
//
//        SPHelper
//        JdbcTemplateCall
//        JdbcTemplate
//        SimpleJdbcCall

//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
//class Parent {
//    Parent(int a, int b) {
//        int c = a + b;
//        System.out.println("Sum=" + c);
//    }
//    void display() {
//        System.out.println("Return Statement");
//    }
//}
//class Child extends Parent {
//    Child(int a, int b) {
//        super(a,b);
//        int c = a - b;
//        System.out.println("Difference=" + c);
//    }
//}
//class InheritanceExample {
//    public static void main(String args[]) {
//        Child c = new Child(-1, 1);
//        c.display();
//    }
//}


//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.*;
//class A {
//    void msg() {
//        System.out.println("From A");
//    }
//}
//
//class B {
//    void msg() {
//        System.out.println("From B");
//    }
//}
//
//class C extends A,B {
//    public static void main(String[] args) {
//        C obj = new C();
//        obj.msg();
//    }
//}


//Which of the following statements below is/are correct?
//
//        new String("test").equals("test")------return True
//        new String("test") == "test"-------------return False
//        Objects.equals("test", new String("test"))---return True
//        Only 2
//        Only 1
//        Both 1 and 2
//        Both 2 and 3
//        All the statements are correct


//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.*;
//class StaticExample {
//    static int count = 0;
//
//    StaticExample() {
//        count++;
//        System.out.println(count);
//    }
//
//    public static void main(String args[]) {
//
//        StaticExample c1 = new StaticExample();
//        StaticExample c2 = new StaticExample();
//        StaticExample c3 = new StaticExample();
//
//    }
//}

//Implementing which of the following can make a JSP page thread safe?
//
//        <%@page isThreadSafe=”false” %>
//<%@page isThreadSafe=”true” %>
//<%@page isThread=”false” %>
//<%@page isThread=”true” %>

//Which of these is a ServletContext object?
//
//        request
//        response
//        out
//        session


//Which of the following is correct about BeanPostProcessor?
//
//        It is a concrete class.
//        It is an interface.
//        It is an abstract class.
//        It is an private class.

//Which property makes Hibernate generate the appropriate SQL for the chosen database?
//
//        hibernate.connect
//        hibernate.dialect
//        hibernate.connection.dialect
//        hibernate.generate

//Whenever a browser requests a JSP and the page has been loaded and initialized, the JSP engine invokes ____________
//
//        _jspService()
//        init ()
//        service init()
//        destroy()

//Whenever a browser requests a JSP and the page has been loaded and initialized, the JSP engine invokes ____________
//
//        _jspService()
//        init ()
//        service init()
//        destroy()


//class Base
//{
//    public void display()
//    {
//        System.out.println("hack");
//    }
//}
//
//class Derived extends Base
//{
//    public void display()
//    {
//        System.out.println("Derived");
//    }
//}
//
//class M
//{
//    public static void main(String args[])
//    {
//        Derived d=new Derived();
//        d.display();
//    }
//}


class Base
{
    protected void fun()
    {
        System.out.println("Hack");
    }
}

class Derived extends Base
{
    public void display()
    {
        fun();
        System.out.println("Derived");
    }
}

class M
{
    public static void main(String args[])
    {
        Derived d=new Derived();
        d.display();
    }
}