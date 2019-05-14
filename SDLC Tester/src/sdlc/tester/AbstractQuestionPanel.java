package sdlc.tester;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.json.simple.JSONObject;

/**
 *
 * @author Brayden Chumbley
 */
public abstract class AbstractQuestionPanel extends JPanel
{
    
    private static final Font titleFont = new Font(Font.SANS_SERIF, 10, 10);
    
    protected String questionTitle;
    
    public AbstractQuestionPanel(JSONObject questionObj)
    {
	questionTitle = (String) questionObj.get("question");
	initComponents();
    }
    
    private void initComponents()
    {	
	//Question title initialization
	JLabel questionLbl = new JLabel(questionTitle);
	questionLbl.setFont(titleFont);
	add(questionLbl);
    }
    
}
