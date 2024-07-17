public class AbstractionDemo{
    public static void main(String[] args){
        // in right side the class must be the one whose to be used 
        GraphicObject circle = new Circle();
        circle.draw();
        circle.resize();

        GraphicObject rectangle = new Rectangle();
        rectangle.draw();
        rectangle.resize();
}   
}