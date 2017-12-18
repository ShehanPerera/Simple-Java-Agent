# Simple-Java-Agent
Hi,
This is very simple Java Agent  to understand what and how to write a small agent for beginners.

What is the java agent!

JVM TI is a tool used to inspect the state and to control the execution of applications running in JVM.Its provides a VM interface for the full breadth of tools that need access to VM state including profiling, debugging, monitoring  and etc…
JVM TI is a two way interface. Client of JVM TI is called agent,can be notified of interesting events.It can query and control the application through many functions.

Actually java agent is a program that can be execute separately without interfering other process .We can use Agent for track the methods in a program without changing it. 
Normally we can run it in two phases, 

	1.OnLoad phase 
	
	2.Live phase
	
Also we can shutdown the agent by UnLoading libraries or unloaded by the termination of the VM whether through normal termination or VM failure, including start-up failure.But this will not work for uncontrolled shutdown.
JVM specify different , separate environments for each agent. And they are independent from others and changes of one not affect to another. 
We can use agent for different purpose. Agent can  Monitor threads,suspend and resume them.Also monitor classes ,change them and do many other functions.
Agents can inspect and modify the shared state of the VM , they also share the native environment in which they execute.Also an agent can be fail other agents. But  JVM TI implementations are not capable of preventing destructive interactions between agents. 

You can use this link to see more in detail. [ https://docs.oracle.com/javase/8/docs/platform/jvmti/jvmti.html ]

How to run!
1. Open terminal in the folder( that contain all 3 files).

2.use this codes in terminal

	i. (This will create class files)
  
	ii. (This will create Agent.jar file )
  
	iii. (This code will execute the Agent.jar file and give the output)
  
Output!



