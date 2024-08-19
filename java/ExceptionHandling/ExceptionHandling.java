import java.util.ArrayList;
import java.util.List; // Import the List interface
public class ExceptionHandling{
    public void writeList(){

        try{
            List<Integer> list = new ArrayList<>(10);    // Create a List of integer of size 10
            list.add(10);
            System.out.println("In the try statement");
            Integer a =list.get(1);
            System.out.println("first element: " + a); 
        }
        catch(IndexOutOfBoundsException e){
            System.err.println("Index out of bound exception " + e.getMessage() );
        }
        finally{
            System.out.println("execute always"); 

        }
    }

    public static void main(String args[]){
        ExceptionHandling ex=new ExceptionHandling();
        ex.writeList();
    }
}

