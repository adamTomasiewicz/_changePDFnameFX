package changePDFnameFX.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ChangePDFnameFX_old_controller {

    @FXML
    TextField sciezkaTextField;
    @FXML
    TextField nowaNazwaTextField;
    @FXML
    TextField sprzedawcaTextField;
    @FXML
    TextField nabywcaTextField;
    @FXML
    TextField dataTextField;
    @FXML
    TextField nrTextField;
    @FXML
    TextField modelTextField;
    @FXML
    TextField snimeiTextField;
    @FXML
    TextField lpTextField;


    @FXML
    Button wybierzButton;
    @FXML
    Button wypiszButton;
    @FXML
    Button zmienButton;

    @FXML
    RadioButton umowaRadioButton;
    @FXML
    RadioButton fvRadioButton;
    @FXML
    RadioButton kosztorysRadioButton;
    @FXML
    RadioButton protokolRadioButton;
    @FXML
    RadioButton odstapienieRadioButton;
    @FXML
    RadioButton wynikRadioButton;
    @FXML
    RadioButton certyfikatRadioButton;


    FileChooser fileChooser = new FileChooser();
    File selectedFile;

    @FXML
    public void wybierzButtonAction(ActionEvent event) {

        fileChooser.setInitialDirectory (new File("."));
        selectedFile = fileChooser.showOpenDialog(null);
        if (selectedFile != null) {
            selectedFile.canExecute();
            sciezkaTextField.setText(selectedFile.getPath());


        } else {
            sciezkaTextField.setText("Nie wybrano pliku.");

            // Desktop.getDesktop().open(jfc.getSelectedFile());
            // ta1.setText(jfc.getSelectedFile().getPath());
        }
    }

   /*
    public class DragAndDropExample extends Application {
        StackPane stackPane;
        BorderPane borderPane;

    stackPane.setOnDragOver(new EventHandler() {
            @Override
            public void handle(final DragEvent event) {
                //Do something when an Object is dragged over the StackPane
            }
        });
    contentPane.setOnDragDropped(new EventHandler() {
            @Override
            public void handle(final DragEvent event) {
                //Do something when an object is dropped onto the StackPane
            }
        });
    contentPane.setOnDragExited(new EventHandler() {
            @Override
            public void handle(final DragEvent event) {
                //Do something when an object exits the StackPane
            }
    }

    });
*/

    @FXML
    public void wypiszButtonAction(ActionEvent event){
        if (umowaRadioButton.isSelected()){
            String nowaNazwa = umowaRadioButton.getText() + "_" + sprzedawcaTextField.getText() + "_" + nabywcaTextField.getText() + "_" + dataTextField.getText() + "_" + nrTextField.getText();
            nowaNazwaTextField.setText(nowaNazwa);
        }
        if (fvRadioButton.isSelected()){
            String nowaNazwa = fvRadioButton.getText() + "_" + sprzedawcaTextField.getText() + "_" + nabywcaTextField.getText() + "_" + dataTextField.getText() + "_" + nrTextField.getText();
            nowaNazwaTextField.setText(nowaNazwa);
        }
        if (kosztorysRadioButton.isSelected()){
            String nowaNazwa = kosztorysRadioButton.getText() + "_" + sprzedawcaTextField.getText() + "_" + nabywcaTextField.getText() + "_" + dataTextField.getText() + "_" + nrTextField.getText();
            nowaNazwaTextField.setText(nowaNazwa);
        }
        if (protokolRadioButton.isSelected()){
            String nowaNazwa = protokolRadioButton.getText() + "_" + sprzedawcaTextField.getText() + "_" + nabywcaTextField.getText() + "_" + dataTextField.getText() + "_" + nrTextField.getText();
            nowaNazwaTextField.setText(nowaNazwa);
        }
        if (certyfikatRadioButton.isSelected()){
            String nowaNazwa = certyfikatRadioButton.getText() + "_" + sprzedawcaTextField.getText() + "_" + dataTextField.getText();
            nowaNazwaTextField.setText(nowaNazwa);
        }
        if (wynikRadioButton.isSelected()){
            String nowaNazwa = wynikRadioButton.getText() + "_" + sprzedawcaTextField.getText() + "_" + dataTextField.getText();
            nowaNazwaTextField.setText(nowaNazwa);
        }
        if (odstapienieRadioButton.isSelected()){
            String nowaNazwa = odstapienieRadioButton.getText() + "_" + sprzedawcaTextField.getText() + "_" + nabywcaTextField.getText() + "_" + dataTextField.getText();
            nowaNazwaTextField.setText(nowaNazwa);
        }
        System.out.println("KLIK");

    }
    @FXML
    public void zmienButtonAction(ActionEvent event) {

        // File newFile;
        //newFile = fileChooser.showSaveDialog(null);
        fileChooser.setInitialFileName(nowaNazwaTextField.getText());
        fileChooser.showSaveDialog(null);

        File oldFile = new File(selectedFile.getPath());
        File newFile = new File(fileChooser.getInitialFileName() + ".pdf");
        if (oldFile.renameTo(newFile)) {
            System.out.println("renamed");
            try {
                FileWriter fileWriter = new FileWriter("listaDokumentow.csv", true);
                fileWriter.append(String.format("%s;%s;%s;%s;%s;%s;%s;%s;%s\n", sciezkaTextField.getText(), nowaNazwaTextField.getText(), sprzedawcaTextField.getText(), nabywcaTextField.getText(), dataTextField.getText(), nrTextField.getText(), modelTextField.getText(), lpTextField.getText(), snimeiTextField.getText()));
                fileWriter.close();
                System.out.println("fw done!");
            } catch (IOException var10) {
                var10.printStackTrace();

            }




        } else {
            sciezkaTextField.setText("Nie wybrano pliku");
            System.out.println("Error");
        }



       /* if (nowaNazwa != null) {
            try {
                saveFileRoutine(nowaNazwa);
            }
	    catch(IOException e) {
                e.printStackTrace();
                actionStatus.setText("An ERROR occurred while saving the file!");
                return;
            }
            actionStatus.setText("File saved: " + savedFile.toString());
        }
	else {
            actionStatus.setText("File save cancelled.");
        }
        //File oldFile = new File(sciezkaTextField.getText());
        //File newFile = new File(nowaNazwaTextField.getText() + ".pdf");

        //if (oldFile.renameTo(newFile)) {
        System.out.println("renamed");
        //} else {
        //System.out.println("Error");
        */
    }




}
