package SimpleAgent;

public class SampleClass {

    /*
    *This is the main class this will execute as normal way.
    *premain will run before this.
             If you want to run this in IDE without using console and jar uncomment [1]
     */
    /* [1]
   static Instrumentation ins;
    static {
        Agent.premain("",ins);
    }
    */
    
    public static void main(String[] args) {

        System.out.println("This is Main Method");
    }
}
