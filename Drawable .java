interface Drawable {
    void draw();
}
class Circle implements Drawable {
    public void draw(){
        System.out.println("Circal");
    }
}
class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Rectangle");
    }
}
class Painting{
    void draw(Drawable D){
        D.draw();
    }
}
public class Main {
    public static void main(String[] args) {
        Circle C=new Circle();
        Rectangle R=new Rectangle();
        Painting P=new Painting();
        P.draw(C);
        P.draw(R);
    }
}


