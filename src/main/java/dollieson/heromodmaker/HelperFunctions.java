package dollieson.heromodmaker;

import dollieson.heromodmaker.ModFiles.Skill;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class HelperFunctions {
    public static Button getSkillContainter(Skill skill, Label lb){
        Button btn = new Button(skill.getName());
        btn.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                lb.setText(skill.getDescription());
            }
        });
        return btn;
    }
}
