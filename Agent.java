package SimpleAgent;
/*
This is codeing for simple agent .
Premain will run before the main methods.
We must create the manifest.mf for execute agent
 */

public class Agent {


    public static void premain(String agentArguments,
                               Instrumentation instrumentation) {
        System.out.println("Simple Agent");
    }

    public static void agentmain(String agentArguments,
                               Instrumentation instrumentation) {
        System.out.println("Agent Main");
    }
}

/*
In manifest.mf we can see as following
Manifest-Version: 1.0
Premain-Class: Agent
Agent-Class: Agent

When this called it run premain in the Agent class.After that it will execute the main method.


 */