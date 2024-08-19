public class Student {
    // private is used to implement encap on object, so oiny the class itself can only access this properties
    // but we also need to restrict in other ways too, since the methods csn access to the propewrites. 
    // So we use getters
    private  String name;
    private int age;
    private String address;
    
    //constructor
    public Student(String name ,
                    int age,
                    String address ){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    // suppose if we need to overwrite the name used in the constructor and we need to rewrite name, 
    // we use set method or setters.

    public void setName(String name) {
        this.name=name;
        // this.susan= ann;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setAddress(String address){
        this.address=address;
    }

    // getters for each properties- so we defined a method by which , if any of them needed these attributes, they can have it using the function/method
    
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }

    public String toString(){
        return ("Student name is : " + this.getName() + ", age is : " + this.getAge() + "and addrress is : " + this.getAddress());

    }

    public static void main (String[] args){
        Student obj = new Student("Annu" , 23 , "ktm, kerala");
        // System.out.println(obj.getName());
        // System.out.println(obj.getAge());
        // System.out.println(obj.getAddress());
        // or
        System.out.println(obj.toString()); // this is the method, which includes the printing statement.


    }
        
}
