/**
 * This is a class for viewing the members. All the members that have been register will be shown here. 
 */
package project;

import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import java.io.File;
import java.util.Scanner;

public class ViewMember extends Scene {

	// main layout
	static VBox vbnamelist = new VBox();
	static GridPane gpnamelist = new GridPane();

	// constructor
	ViewMember(VBox namelist, int a, int b) {
		super(namelist, a, b);
		this.vbnamelist = namelist;

		// Create HBox,insert TextField andButton
		HBox hbnamelist = new HBox(10);
		Button bSearch = new Button("Search");
		bSearch.setPrefWidth(125);
		TextField tfSearch = new TextField();
		tfSearch.setPrefWidth(300);
		hbnamelist.getChildren().addAll(tfSearch, bSearch);

		// set attributes for gridpane

		gpnamelist.setHgap(200);
		gpnamelist.setAlignment(Pos.TOP_LEFT);
		gpnamelist.add(new Label("Name"), 0, 0);
		gpnamelist.add(new Label("Status"), 1, 0);

		// inset elements for main layout, and set attributes
		vbnamelist.setPadding(new Insets(20, 50, 50, 50));
		vbnamelist.getChildren().addAll(hbnamelist, new Label("MEMBER LIST"), gpnamelist);
		for (int d = 0; d <= PartB.memberNO; d++) {
			try {
				Scanner scanMember = new Scanner(new File("member" + d++ + (".txt")));
				for (int bb = 1; bb <= ((PartB.memberNO) + 1); bb++) {
					String memTitle = scanMember.next();
					String memName = scanMember.next();
					gpnamelist.add(new Label(memTitle), 0, b);

				}
				scanMember.close();
			} catch (Exception e3) {
				e3.printStackTrace();
			}

		}

		// create button back and pin it to the
		Button btnBack = new Button("Back to Select Action");
		HBox toBack = new HBox();
		toBack.setAlignment(Pos.BOTTOM_RIGHT);
		toBack.getChildren().add(btnBack);
		vbnamelist.getChildren().add(toBack);
		btnBack.setOnAction(e -> {
			MainPage.stage.setScene(MainPage.selectAction);

		});

	}

}
