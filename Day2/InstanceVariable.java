// package Day2;

public class InstanceVariable {
    int variable = 30;
    // this.variable = 34;

    public static void main(String[] args){
        InstanceVariable obj1 = new InstanceVariable();
        InstanceVariable obj2 = new InstanceVariable();
        obj2.variable = 60;
        System.out.println(obj1.variable);
        System.out.println(obj2.variable);
    }
    
}
