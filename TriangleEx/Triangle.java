package JavaCourse.TriangleEx;

public class Triangle {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double areaTriangulo(){
        double p = (this.a + this.b + this.c) / 2.0;
        double resultado = Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
        return resultado;
    }
}
