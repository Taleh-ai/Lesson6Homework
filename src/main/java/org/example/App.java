package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Average.average(5,4,7);
        Complex c1 = new Complex(2,6);
        Complex c2 = new Complex(5,7);
        Complex.add(c1,c2);
        System.out.println();
        Complex.substract(c1,c2);
        System.out.println();
        Complex.multiply(c1,c2);

        Teacher jhone  = new Teacher("Jhone","Griffin",45,"Math",23,new University("Stanford","70k","055555555",true));
        System.out.println();
        jhone.getCount();
        System.out.println(jhone.toString());
    }
}
