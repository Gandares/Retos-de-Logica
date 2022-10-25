class Main{
    public static void main(String[] args) {
        Area a = new Area();
        a.area(new Square(10));
        a.area(new Rectangle(6,10));
        a.area(new Triangle(10,7));
    }
}

interface Polygon {
    
    public float area();
    public void mostrar();

}

class Square implements Polygon{

    float l;
    float area;

    Square(int l){
        this.l = l;
        this.area = area();
    }

    public float area(){
        return l*l;
    }

    public void mostrar(){
        System.out.println("El area del cuadrado es: " + area);
    }
}

class Rectangle implements Polygon{

    float b, h;
    float area;

    Rectangle(int b, int h){
        this.b = b;
        this.h = h;
        this.area = area();
    }

    public float area(){
        return b*h;
    }

    public void mostrar(){
        System.out.println("El area del rectángulo es: " + area);
    }
}

class Triangle implements Polygon{

    float b, h;
    float area;

    Triangle(int b, int h){
        this.b = b;
        this.h = h;
        this.area = area();
    }

    public float area(){
        return (b*h)/2;
    }

    public void mostrar(){
        System.out.println("El area del triángulo es: " + area);
    }
}

class Area{
    public void area(Polygon p){
        p.mostrar();
    }
}