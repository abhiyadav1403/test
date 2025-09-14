// package Day4;

public class ConstructorQuestion {
    int Id;
    String Name;
    double amount;
    

    ConstructorQuestion(int Id, String Name, double amount) {
        this.Id = Id;
        this.Name = Name;
        this.amount = amount;

    //public void display() {
    //     System.out.println("id:" + Id + "Name :" + Name + "Amount:" + amount);
        }

    public void display() {
        System.out.println("id:" + Id);
        System.out.println("Name :" + Name);
        System.out.println("Amount:" + amount);
    }
    

    public static void main(String[] args) {

        ConstructorQuestion obj1 = new ConstructorQuestion(01, "Abhishek", 25000.50);
        ConstructorQuestion obj2 = new ConstructorQuestion(01, "john", 30000.50);


        obj1.display();
        obj2.display();
    }

}
    
    

