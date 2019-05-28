/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fanorona_prog06;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Sami
 */
public class Fanorona_prog06 extends Application {
    public static AudioClip ost;
    public static int music_mode;

    @Override
    public void start(Stage stage) throws Exception {
        
        
        //FXMLDocumentController x = new FXMLDocumentController();
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        
        ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("red.png")));
        //imageView.setPreserveRatio(true);  //uncomment to keep image ratio.
        imageView.fitHeightProperty().bind(stage.heightProperty());
        imageView.fitWidthProperty().bind(stage.widthProperty());
        
        stage.setScene(scene);
        //stage.setResizable(false);
        scene.getWindow().centerOnScreen();
        stage.initStyle(StageStyle.DECORATED.UNDECORATED);
        //stage.setMaximized(true);
        stage.show();
        ost = new AudioClip(this.getClass().getResource("board_pics/fanorona_OST.wav").toString());
        ost.setCycleCount(5);
        //ost.play();
        music_mode=1;
        

    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
