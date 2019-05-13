package sdlc.tester;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Brayden Chumbley
 */
public class AbstractJSONReader 
{
    
    protected JSONParser parser;
    protected FileReader jsonFileReader;
    
    /**
     * Default constructor
     * @param jsonFile 
     */
    public AbstractJSONReader(File jsonFile)
    {
	parser = new JSONParser();
	try 
	{
	    jsonFileReader = new FileReader(jsonFile);
	} 
	catch (FileNotFoundException ex) 
	{
	    Logger.getLogger(AbstractJSONReader.class.getName()).log(Level.SEVERE, null, ex);
	}
    }
    
    public JSONObject readFile() throws IOException, ParseException, ClassCastException
    {
	Object obj = parser.parse(jsonFileReader);
	return (JSONObject) obj;
    }
    
}
