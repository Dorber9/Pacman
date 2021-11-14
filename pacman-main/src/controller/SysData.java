package controller;

import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

public class SysData {
	  private JSONParser parser = new JSONParser();
	  private JSONArray a = (JSONArray) parser.parse(new FileReader("q.json"));

	  for (Object o : a)
	  {
	    JSONObject question = (JSONObject) o;

	    String name = (String) question.get("question");
	    System.out.println(name);

	    String correctAns = (String) question.get("correct_ans");
	    System.out.println(correctAns);

	    String level  = (String) question.get("level");
	    System.out.println(level);
	    
	    String team  = (String) question.get("team");
	    System.out.println(team);

	    JSONArray answers  = (JSONArray) question.get("answers"); 
	  }
}
