// package Day4;

public class Constructor {
    
    int id;
    String name;

    Constructor() {
        this.id = 0;
        this.name = "Unknown";
    }

    Constructor(int id, String name){
        this.id = id;
        this.name = name;

    }

    public void display(){
        System.out.println("ID" + id + ",Name:" + name);
    }
    public static void main(String[] args){


        Constructor obj1 = new Constructor();

        Constructor obj2 = new Constructor(1, "john");

        obj1.display();
        obj2.display();

    }
    
}
