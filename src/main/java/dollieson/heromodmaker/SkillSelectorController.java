package dollieson.heromodmaker;

import dollieson.heromodmaker.ModFiles.Skill;
import dollieson.heromodmaker.ModFiles.SkillCollection;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class SkillSelectorController implements Initializable {

    @FXML
    public Label SkillDescription;
    public ScrollPane SkillContainer;
    private ChoiceBox Parent;

    private ArrayList<Skill> Skills;

    public void setParent(ChoiceBox P){
        Parent = P;
    }

    public SkillSelectorController(){
        System.out.printf("Hello");
        Skills = SkillCollection.getAllSkills();

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        final int cols = 6;
        int count = 0;
        GridPane gp  = new GridPane();
        for(Skill sk: Skills){
            gp.add(HelperFunctions.getSkillContainter(sk,SkillDescription),(count++)%cols,(count)/cols);
        }
        SkillContainer.setContent(gp);
        System.out.println("Done");
    }
}
