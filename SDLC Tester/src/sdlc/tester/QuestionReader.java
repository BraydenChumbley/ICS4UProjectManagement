package sdlc.tester;

import java.io.File;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

/**
 * Class for loading questions to test a user on
 * @author Brayden Chumbley
 */
public class QuestionReader extends AbstractJSONReader
{
    
    private JSONArray questions;
    
    /**
     * Create a new QuestionReader with a file object of the json file
     * @param jsonFile A file object that is of the question json file
     */
    public QuestionReader(File jsonFile) 
    {
	super(jsonFile);
    }
    
    /**
     * Create a new QuestionReader with a string as a file path to the json file
     * @param filePath A string containing the path to the question json file
     */
    public QuestionReader(String filePath) 
    {
	this(new File(filePath));
    }
    
    /**
     * Load a test array of 'testName' into the questions field
     * @param testName A string with the name of the array of questions to load
     * @throws IOException
     * @throws ParseException
     * @throws ClassCastException 
     */
    public void loadQuestions(String testName) throws IOException, ParseException, ClassCastException
    {
	questions = (JSONArray) readFile().get(testName);
    }
    
    public JSONObject getQuestion(int index)
    {
	return (JSONObject) questions.get(index);
    }

}
