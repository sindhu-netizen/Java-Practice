public class AboutJVM{
    public static void main(String[] args){
        System.out.println("JVM stands for Java Virtual Machine.");
        System.out.println("JVM converts the source code into byte code and enables the computer to understand it to run.");
        System.out.println("JVM architecture has three sections called ClassLoader Subsystem,Runtime Data Area and Execution Engine.");
        System.out.println("ClassLoader Subsystem loads the class files.");
        System.out.println("It has three sections designed in it.");
        System.out.println("They are Loading,Linking and Initialisation");
        System.out.println("Loading is subdivided into three categories.They are Extension ClassLoader,BootStrap ClassLoader,Application ClassLoader.");
        System.out.println("Linking section performs three steps.They are Verification ,Preparation and Resolving.");
        System.out.println("Initialisation designates original values to all static variables,Java static block code is executed in the initialisation phase.");
        System.out.println("Runtime data area is categorised into five stages.");
        System.out.println("They are Method Area,Heap Area,Stack Area,PC Registers and Native Method stacks.");
        System.out.println("Execution engine reads and runs bytecode.");
        System.out.println("It has 2 sections.");
        System.out.println("They are Interpreter and JIT compiler.");
        System.out.println("Garbage Collector eliminates unreferenced java objects and collects created objects.");
        
        
    }
}