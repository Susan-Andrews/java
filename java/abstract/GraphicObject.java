// if we make a class abstract, then we need atlease one abstract method in the class
// that method have only declaration, not implementation
// they can have normal methods too

public abstract class GraphicObject{
    int x,y;

    //even if we creaste a constructor, it gets performed still, the class is abstracted.
    // GraphicObject(){
    //     sop("base class");
    // }
    void moveTo(int newX, int newY){
        System.out.println("Move to x: "+x+ "and y: " +y);
    }

    abstract void draw();
    abstract void resize();

}

// to provide implementation of abstract methods, we need to extend the class ,to subclass
