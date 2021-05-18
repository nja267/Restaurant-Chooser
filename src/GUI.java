import javax.swing.*;

/**
 * Abstract GUI class that contains the code for the GUI.
 * Also has the methods that is needed for the program to function.
 */
public abstract class GUI {

    /** CONSTRUCTOR **/
    public GUI(){
        initialise();
    }

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //The code for the GUI using JSwing
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //the main frame that the GUI is stored in
    private JFrame mainFrame;

    //the file chooser that does the file stuff
    private JFileChooser fileChooser;

    /**
     * The main method that handles the initialisation of the GUI,
     * but also contains the logic and action events of each button in the GUI itself
     */
    @SuppressWarnings("serial")
    public void initialise(){

    }
}
