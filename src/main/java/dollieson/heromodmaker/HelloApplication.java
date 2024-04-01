package dollieson.heromodmaker;

import dollieson.heromodmaker.ModFiles.ArtifactMod;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 484, 332);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
    }

    public static void main(String[] args) {
        ArtifactMod Something = new ArtifactMod();
        Something.setName("Quincy")
                .setEquipSlot("Helmet")
                .setQuality("Ultimate")
                .setFirstBonusEffect("Might")
                .setFirstBonusStr(1)
                .setSecondBonusEffect("")
                .setSecondBonusStr(0)
                .setPartOfSet("Mendel")
                .setStrOriented(false);
        System.out.printf(String.valueOf(Something));

//        launch();
    }
}