// package Day2;

public class LocalVariable {
    public void showMessage(){
        String message = "Hello, Local Variable";
        System.out.println(message);
    }
    public static void main(String[] args){
        LocalVariable obj = new LocalVariable();
        obj.showMessage();

    }
    
}
