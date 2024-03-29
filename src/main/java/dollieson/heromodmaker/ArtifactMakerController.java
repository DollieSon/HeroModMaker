package dollieson.heromodmaker;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ArtifactMakerController implements Initializable {
    @FXML
    public TextField tfArtifactName;
    public ChoiceBox<String> CbAslot;
    public ChoiceBox<String> cbFBonusEffect;
    public TextField tfFBonusPower;
    public ChoiceBox<String> cbArtifactSet;
    public ChoiceBox<String> tfSBonusEffect;
    public TextField tfSBonusPower;
    public ChoiceBox<String> cbQuality;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        CbAslot.getItems().addAll(ConstantValues.getArtifactSlots().keySet());
        cbArtifactSet.getItems().addAll(ConstantValues.getArtifactSet().keySet());
        cbQuality.getItems().addAll(ConstantValues.getItemQuality().keySet());
    }
}