package nashorn.JSFromJava;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {

	public static void main(String[] args) {

		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("nashorn");
		
		String script = "var welcome = 'Hello'; "
				+ "welcome += ', David'; "
				+ "welcome;";
		
		String result;
		try {
			result = (String)engine.eval(script);
			System.out.println(result);
		} catch (ScriptException e) {
			System.out.println("There was a JavaScript error");
			e.printStackTrace();
		}
		
	}

}
