package sdlc.tester;

import java.awt.Dimension;
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
    
    private static final Font titleFont = new Font(Font.SANS_SERIF, Font.BOLD, 30);
    public static final int PANEL_WIDTH = 500, PANEL_HEIGHT = 500;
    
    protected JSONObject questionObj;
    protected String questionTitle;
    
    public AbstractQuestionPanel(JSONObject questionObj)
    {
	this.questionObj = questionObj;
	questionTitle = (String) questionObj.get("question");
	initComponents();
    }
    
    abstract void addOptions();
    public abstract int evalQuestion();
    
    private void initComponents()
    {	
	//Panel sizing and layout
	setLayout(null);
	setBounds(0, 0, PANEL_WIDTH, PANEL_HEIGHT);
	setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
	
	//Question title initialization
	JLabel questionLbl = new JLabel(questionTitle);
	questionLbl.setFont(titleFont);
	questionLbl.setBounds(0, 0, PANEL_WIDTH, 35);
	add(questionLbl);
    }
    
}
