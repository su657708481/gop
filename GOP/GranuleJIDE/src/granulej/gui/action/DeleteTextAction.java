package granulej.gui.action;

import granulej.bean.JClosableTabbedPane;
import granulej.gui.Editor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class DeleteTextAction implements ActionListener {
		private Editor editor;

		private JClosableTabbedPane jtp;

		private JTextPane textpane;

		public DeleteTextAction(Editor editor) {
			this.editor = editor;
		}

		public void actionPerformed(ActionEvent e) {
			jtp = editor.getTabbedPane();
			JScrollPane jp = (JScrollPane) jtp.getSelectedComponent();
		    if(jp==null)
		    return ;
			textpane = (JTextPane) (jp.getViewport().getView());
//			int selstart = textpane.getSelectionStart();
//			int selend=textpane.getSelectionEnd();
			textpane.replaceSelection("");
			textpane.requestFocus();
		}
}
