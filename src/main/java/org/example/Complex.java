package org.example;

class Complex {

    // variables to hold real and imaginary part of complex
    // number
    int real, image;

    // Constructor which will be used while creating complex
    // number
    public Complex(int r, int i) {
        this.real = r;
        this.image = i;
    }

    // function to print real number
    public void showC() {
        System.out.print(this.real + " +i" + this.image);
    }

    // function for addition
    public static void add(Complex n1,
                                    Complex n2) {

        // creating blank complex number
        // to store result
        Complex res = new Complex(0, 0);

        // adding real parts of both complex numbers
        res.real = n1.real + n2.real;

        // adding imaginary parts
        res.image = n1.image + n2.image;

        // returning result
        res.showC();
    }
    public static void substract(Complex n1,
                           Complex n2) {

        // creating blank complex number
        // to store result
        Complex res = new Complex(0, 0);

        // adding real parts of both complex numbers
        res.real = n1.real - n2.real;

        // adding imaginary parts
        res.image = n1.image - n2.image;

        // returning result
        res.showC();
    }
    public static void multiply(Complex n1,
                                 Complex n2) {

        // creating blank complex number
        // to store result
        Complex res = new Complex(0, 0);

        // adding real parts of both complex numbers
        res.real = (n1.real * n2.real) - (n1.image * n2.image);
        res.image = (n1.real * n2.image) + (n1.image * n2.real);

        // returning result
        res.showC();
    }


}
