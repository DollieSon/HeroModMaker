package dollieson.heromodmaker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ArtifactMakerController implements Initializable {
    @FXML
    public TextField tfArtifactName;
    public ChoiceBox<String> CbAslot;
    public ChoiceBox<String> cbFBonusEffect;
    public TextField tfFBonusPower;
    public ChoiceBox<String> cbArtifactSet;
    public ChoiceBox<String> cbSBonusEffect;
    public TextField tfSBonusPower;
    public ChoiceBox<String> cbQuality;
    public Button btnArtifactExport;
    public ToggleGroup StrMgcOrient;
    @FXML
    private Label welcomeText;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        CbAslot.getItems().addAll(ConstantValues.getArtifactSlots().keySet());
        CbAslot.setValue(ConstantValues.getArtifactSlots().keySet().iterator().next());
        cbArtifactSet.getItems().addAll(ConstantValues.getArtifactSet().keySet());
        cbArtifactSet.setValue(ConstantValues.getArtifactSet().keySet().iterator().next());
        cbQuality.getItems().addAll(ConstantValues.getItemQuality().keySet());
        cbQuality.setValue(ConstantValues.getItemQuality().keySet().iterator().next());
        cbFBonusEffect.getItems().addAll(ConstantValues.getArtifactEffects());
        cbFBonusEffect.setValue(ConstantValues.getArtifactEffects().iterator().next());
        cbSBonusEffect.getItems().addAll(ConstantValues.getArtifactEffects());
        cbSBonusEffect.setValue(ConstantValues.getArtifactEffects().iterator().next());
    }

    public void onArtifactExport(ActionEvent actionEvent){
        //Handle Empty TextFields
        //If File Exist then replace
        String ArtifactName = tfArtifactName.getText();
        // Should be sanitized eek
        String Filename = ArtifactName+" data.txt";
        File ArtifactFile = new File(Filename);
        String Type = "0";
        RadioButton selectedRB = (RadioButton) StrMgcOrient.getSelectedToggle();
        if(selectedRB!=null){
            Type = ConstantValues.getArtifactType().get(selectedRB.getText()).toString();
        }
        try {
            BufferedWriter fw =new BufferedWriter(new FileWriter(ArtifactFile));
            fw.append("Name");
            fw.newLine();
            fw.append(ArtifactName);
            fw.newLine();
            fw.newLine();

            fw.append("Slot");
            fw.newLine();
            Integer val = ConstantValues.getArtifactSlots().getOrDefault(CbAslot.getValue(),-1);
            fw.append(val.toString());
            fw.newLine();
            fw.newLine();

            fw.append("Quality");
            fw.newLine();
            Integer QualVal= ConstantValues.getItemQuality().getOrDefault(cbQuality.getValue(),-1);
            fw.append(QualVal.toString());
            fw.newLine();
            fw.newLine();

            fw.append("FIRST BONUS: size");
            fw.newLine();
            fw.append(tfFBonusPower.getText());
            fw.newLine();
            fw.newLine();

            fw.append("FIRST BONUS: effect");
            fw.newLine();
            fw.append(cbFBonusEffect.getValue());
            fw.newLine();
            fw.newLine();

            fw.append("SECOND BONUS: size");
            fw.newLine();
            fw.append(tfSBonusPower.getText());
            fw.newLine();
            fw.newLine();

            fw.append("SECOND BONUS: effect");
            fw.newLine();
            fw.append(cbSBonusEffect.getValue());
            fw.newLine();
            fw.newLine();

            fw.append("Part of artifact set");
            fw.newLine();
            Integer ArtSet = ConstantValues.getArtifactSet().getOrDefault(cbArtifactSet.getValue(),-1);
            fw.append(ArtSet.toString());
            fw.newLine();
            fw.newLine();

            fw.append("Strength or magic-oriented");
            fw.newLine();
            fw.append(Type);

            fw.close();
            System.out.printf("Done Exporting");
        }catch (IOException e){
            System.out.printf("Something went wrong hehe");
        }
    }
}