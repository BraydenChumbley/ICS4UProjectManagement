package sdlc.tester;

import java.io.File;

/**
 *
 * @author Brayden Chumbley
 */
public class QuestionReader extends AbstractJSONReader
{

    public QuestionReader(File jsonFile) 
    {
	super(jsonFile);
    }
    
    public QuestionReader(String filePath) 
    {
	this(new File(filePath));
    }

}
