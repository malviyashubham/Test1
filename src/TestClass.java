    public class TestClass{

        void testMethod(){
            try{
                System.out.println("try....");
                throw new RuntimeException();
            } catch(Exception e){
                System.out.println("test exception...");
            }finally{
                System.out.println("finally is running...");
            }
        }
    }

