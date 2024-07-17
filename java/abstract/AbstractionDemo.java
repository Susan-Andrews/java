public class AbstractionDemo{
    public static void main(String[] args){
        // in right side the class must be the one whose to be used 
        GraphicObject circle = new Circle();
        circle.draw();
        circle.resize();

        // creating an object for the child class with reference to the parent class
        GraphicObject rectangle = new Rectangle();
        rectangle.draw();
        rectangle.resize();
}   
}
