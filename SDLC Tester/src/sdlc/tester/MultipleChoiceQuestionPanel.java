/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sdlc.tester;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Brayden Chumbley
 */
public class MultipleChoiceQuestionPanel extends AbstractQuestionPanel
{
    
    private ButtonGroup btnGroup;
    
    public MultipleChoiceQuestionPanel(JSONObject questionObj) 
    {
	super(questionObj);
	btnGroup = new ButtonGroup();
	addOptions();
    }

    @Override
    void addOptions() throws ClassCastException
    {
	JSONArray optionsArray = (JSONArray) questionObj.get("options");
	for(int i = 0; i < optionsArray.size(); i++)
	{
	    JRadioButton tempBtn = new JRadioButton(optionsArray.get(i).toString());
	    tempBtn.setBounds(50, 75 + i*20, PANEL_WIDTH/2 - 100, 20);
	    btnGroup.add(tempBtn);
	    add(tempBtn);
	}
    }

    @Override
    public int evalQuestion() {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
