// package Day2;

public class StaticVariable {
    static int count = 0;
    StaticVariable(){
        count++;
    }
    public static void main(String[] args){

    
    StaticVariable obj1 = new StaticVariable();
    StaticVariable obj2 = new StaticVariable();
    StaticVariable obj3 = new StaticVariable();
    
    System.out.println( "This object" +  StaticVariable.count);
    // System.out.println(StaticVariable.count);
    }
}
