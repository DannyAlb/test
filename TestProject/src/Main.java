
public class Main {

	public static void main(String[] args) {
		if (args.length == 0)
			System.out.println("no params");

		// XmppDebugger debugger = new XmppDebugger("debugger.one@gmail.com", "debugger123", "danny.albocher@gmail.com");
		// debugger.readInitialBreakpoints();
		for (String arg : args) {
			System.out.println("Running file: " + arg);

		
		} // for
	}
}
