package org.pgi;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal(){
        return this.real;
    }

    public double getImaginary(){
        return this.imaginary;
    }

    public void add(ComplexNumber q){
        this.real +=q.real;
        this.imaginary +=q.imaginary;
    }

    public void add(double q, double p){
        ComplexNumber n=new ComplexNumber(q,p);
        add(n);
    }

    public void subtract(ComplexNumber q){
        this.real -=q.real;
        this.imaginary -=q.imaginary;
    }

    public void subtract(double q, double p) {
        ComplexNumber n=new ComplexNumber(q,p);
        subtract(n);
    }
}
