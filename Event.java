import java.awt.*;
import java.awt.event.*;

class Event extends Frame implements ActionListener
{
    TextField textField;

    Event ()
    {
        textField = new TextField ();
        textField.setBounds (60, 50, 170, 20);
        Button button = new Button ("Show");
        button.setBounds (90, 140, 75, 40);

        button.addActionListener (this);
        add (button);
        add (textField);
        setSize (250, 250);
        setLayout (null);
        setVisible (true);
    }


    public void actionPerformed (ActionEvent e)
    {
        textField.setText ("Have a nice day");
    }

    public static void main (String args[])
    {
        new Event ();
    }
}
