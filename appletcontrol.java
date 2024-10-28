package sem;

import java.applet.Applet;
import java.awt.Button;
import java.awt.event.ActionListener;

public class appletcontrol extends Applet implements ActionListener {
	private int clickcount;

	public void init() {
		Button clickbutton = new Button();
		clickbutton.addActionlstener(this);
		add(clickbutton);

	}

	public void actionperformed(actionEvent e) {
		clickcount++;
		showstatus("button clicked" + clickcount);
	}
}
