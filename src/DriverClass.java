public class DriverClass {

    public static void main(String[] args){

        TestClass t= new TestClass();
        try {
            t.testMethod();
        } catch(Exception e){
            System.out.println("exception caught...");
        }
        System.out.println("executing......");
    }
}
