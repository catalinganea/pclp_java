package laborator_6;

public class NumarComplex {
    private double real;
    private double imaginary;

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public String toString() {
        return "(" + this.real + " + " + this.imaginary + "i)";
    }

    public NumarComplex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public NumarComplex() {
        this(1, 2);
    }

    public NumarComplex add(double real, double imaginary) {
        return new NumarComplex(this.real + real, this.imaginary + imaginary);
    }

    public NumarComplex add(NumarComplex c) {
        return new NumarComplex(this.real + c.real, this.imaginary + c.imaginary);
    }

    public NumarComplex addReal(double re) {
        return new NumarComplex(this.real + re, this.imaginary);
    }

    public NumarComplex addIm(double im) {
        return new NumarComplex(this.real, this.imaginary + im);
    }

    public NumarComplex subtract(double real, double imaginary) {
        return new NumarComplex(this.real - real, this.imaginary - imaginary);
    }

    public NumarComplex subtract(NumarComplex c) {
        return new NumarComplex(this.real - c.real, this.imaginary - c.imaginary);
    }

    public NumarComplex subtractRe(double re) {
        return new NumarComplex(this.real - real, this.imaginary);
    }

    public NumarComplex subtractIm(double im) {
        return new NumarComplex(this.real, this.imaginary - im);
    }

    public double absValue() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public static void main(String[] args) {
        NumarComplex a = new NumarComplex(1, 2);
        NumarComplex b = new NumarComplex(-1, 3);

        NumarComplex sum = a.add(b);
        NumarComplex diff = a.subtract(b);

        System.out.println("a + b = " + sum.toString());
        System.out.println("a - b = " + diff.toString());
        System.out.println("|a| = " + a.absValue());
        System.out.println("|b| = " + b.absValue());
    }
}
