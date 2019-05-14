package sdlc.tester;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Brayden Chumbley, Tony Yu, Joshua Hickey
 */
public class SDLCTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
	try {
	    JFrame testFrame = new JFrame();
	    
	    QuestionReader qReader = new QuestionReader("res\\questions.json");
	    qReader.loadQuestions("test");
	    testFrame.add(new MultipleChoiceQuestionPanel(qReader.getQuestion(0)));
	    
	    testFrame.pack();
	    testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    testFrame.setVisible(true);
	} 
	catch (IOException | ParseException | ClassCastException ex) 
	{
	    Logger.getLogger(SDLCTester.class.getName()).log(Level.SEVERE, null, ex);
	}
    }
    
}
