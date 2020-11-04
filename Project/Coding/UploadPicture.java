/**
 * This is a class for scene uploading picture. It is from the member registration form.
 */
package project;

import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.geometry.*;
import javafx.event.*;
import java.io.*;
import javax.imageio.ImageIO;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.shape.Rectangle;
import java.awt.image.BufferedImage;
import java.util.logging.Logger;
import java.util.logging.Level;

public class UploadPicture extends Scene {
	// main create Layout
	static BorderPane bpUpload = new BorderPane();

	// constructor
	UploadPicture(BorderPane bpUpload, int a, int b) {
		super(bpUpload, a, b);
		this.bpUpload = bpUpload;

		// Create VBox,insert Label and ImageView, Button
		VBox vbUpload = new VBox();
		vbUpload.setAlignment(Pos.CENTER);
		Label lUpload = new Label("UPLOAD PICTURE");
		ImageView profilepic = new ImageView();
		StackPane paneForPic = new StackPane();
		paneForPic.getChildren().addAll(new Rectangle(100, 100, Color.BLACK), profilepic);
		Button choosepic = new Button("Choose Picture");
		choosepic.setOnAction(e -> {

			// set extension filter
			FileChooser browsePic = new FileChooser();
			FileChooser.ExtensionFilter weWantPNG = new FileChooser.ExtensionFilter("PNG files (*.png)", "*.PNG");
			FileChooser.ExtensionFilter weWantJPG = new FileChooser.ExtensionFilter("JPG files 9*.jpg)", "*.JPG");
			browsePic.getExtensionFilters().addAll(weWantPNG, weWantJPG);

			// Open file dialog
			File weWantPic = browsePic.showOpenDialog(null);

			try {
				BufferedImage buffMyPic = ImageIO.read(weWantPic);
				Image setMyPic = SwingFXUtils.toFXImage(buffMyPic, null);
				profilepic.setImage(setMyPic);
			} catch (IOException ex) {
				Logger.getLogger(UploadPicture.class.getName()).log(Level.SEVERE, null, ex);

			}

		});

		// UploadPic

		vbUpload.getChildren().addAll(lUpload, paneForPic, choosepic);

		// Insert element into main layout
		Button submit = new Button("Submit");
		submit.setOnAction(e -> {
			MainPage.stage.setScene(MainPage.selectAction);

		});

		bpUpload.setCenter(vbUpload);
		bpUpload.setBottom(submit);
		bpUpload.setAlignment(submit, Pos.BOTTOM_RIGHT);

	}

}
