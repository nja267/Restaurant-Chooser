import javax.swing.*;
import java.io.File;

/**
 * Abstract GUI class that contains the code for the GUI.
 * Also has the methods that is needed for the program to function.
 */
public abstract class GUI {

    /** CONSTRUCTOR **/
    public GUI(){
        initialise();
    }

    protected abstract void loadData(File restoData);

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

        //creating the load button
        this.fileChooser = new JFileChooser();
        JButton load = new JButton("Load");
        load.addActionListener(e -> {

            //setting up the file chooser
            this.fileChooser.setCurrentDirectory(new File("."));
            this.fileChooser.setDialogTitle("Select data to load");
            this.fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

            //checking that the user did not hit cancel
            if(this.fileChooser.showOpenDialog(this.mainFrame) == JFileChooser.APPROVE_OPTION){
                loadData(this.fileChooser.getSelectedFile());
            }
        });
    }
}
