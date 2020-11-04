/**
 * This is a class for scene 4 as known as the class for the user to enter the new member info for part A
 * part A is the personal information form that the user have to enter
 * If all the part have been enter, the user have to click next to proceed to the next from
 */

package project;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.*;
import javafx.scene.text.*;

class PartA extends Scene {

	static BorderPane bp = new BorderPane();
	static ComboBox cbHonTitle = new ComboBox();
	static TextField tfName = new TextField();
	static ComboBox cbGender = new ComboBox();
	static TextField tfIC = new TextField();
	static TextField tfDOB = new TextField();
	static TextField tfPlaceBirth = new TextField();
	static ComboBox cbReligion = new ComboBox();
	static ComboBox cbRace = new ComboBox();
	static TextField tfCountry = new TextField();
	static ComboBox cbMarital = new ComboBox();
	static ComboBox cbCitizenship = new ComboBox();
	static TextArea tfAddress = new TextArea();
	static TextField tfDistrict = new TextField();
	static TextField tfPostcode = new TextField();
	static TextField tfState = new TextField();

	public PartA(BorderPane bp, int a, int b) {
		super(bp, a, b);

		// change the font and all the characteristics of the title form
		Label labelTitle = new Label("REGISTER FORM");
		labelTitle.setFont(Font.font("Verdana", FontWeight.BOLD, 30));

		Label labelPart = new Label("Part A : Personal Information");

		// put labelTitle and labelPart in horizontal box and set all the
		// characteristics
		VBox vb1 = new VBox(10);
		vb1.getChildren().addAll(labelTitle, labelPart);

		// set vb1 to the top of the border pane
		bp.setTop(vb1);

		// create gridpane to hold all the label,textfield and combo box into place, and
		// set the characteristics
		GridPane gp = new GridPane();
		gp.setPadding(new Insets(20, 0, 0, 0));
		gp.setHgap(10);
		gp.setVgap(15);

		// create all label,textfield and combo box, then place it in the gridpane and
		// also set the characteristics
		Label labelHonTitle = new Label("Honorary Title");

		cbHonTitle.getItems().addAll("MR.", "MRS.");
		gp.add(labelHonTitle, 0, 0);
		gp.add(cbHonTitle, 1, 0);
		cbHonTitle.setMinWidth(150);

		// create the label for Full name and set it all to uppercase
		Label labelFName = new Label("Full Name");
		gp.add(labelFName, 0, 1);
		gp.add(tfName, 1, 1);
		tfName.setMinWidth(400);
		tfName.setTextFormatter(new TextFormatter<>((change) -> {
			change.setText(change.getText().toUpperCase());
			return change;
		}));

		// create label for IC and limit it to only have 12 inputs, and cannot input
		// characters
		Label labelIC = new Label("Identity Card Number (IC)");
		gp.add(labelIC, 0, 3);
		gp.add(tfIC, 1, 3);
		tfIC.setMaxWidth(150);
		tfIC.textProperty().addListener(new ChangeListener<String>() {
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (!newValue.matches("\\d{0,12}?")) {
					tfIC.setText(oldValue);
				}
			}
		});

		// create label for gender and set the width of the combo box
		Label labelGender = new Label("Gender");

		cbGender.getItems().addAll("MALE", "FEMALE", "OTHERS");
		gp.add(labelGender, 0, 2);
		gp.add(cbGender, 1, 2);
		cbGender.setMinWidth(150);

		// create label for DOB and limit it to input only 6 numbers at maximum and
		// cannot enter characters
		Label labelDOB = new Label("Date of Birth (DD-MM-YY)");
		gp.add(labelDOB, 0, 4);
		gp.add(tfDOB, 1, 4);
		tfDOB.setMaxWidth(150);
		tfDOB.textProperty().addListener(new ChangeListener<String>() {
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (!newValue.matches("\\d{0,6}?")) {
					tfDOB.setText(oldValue);
				}
			}
		});

		// create label for place of birth and set it all to uppercase
		Label labelPlaceBirth = new Label("Place of Birth");
		gp.add(labelPlaceBirth, 0, 5);
		gp.add(tfPlaceBirth, 1, 5);
		tfPlaceBirth.setTextFormatter(new TextFormatter<>((change) -> {
			change.setText(change.getText().toUpperCase());
			return change;
		}));

		// create label for religion
		Label labelReligion = new Label("Religion");
		cbReligion.getItems().addAll("ISLAM", "CHRISTIAN", "BUDDHA", "HINDHU", "OTHERS");
		gp.add(labelReligion, 0, 6);
		gp.add(cbReligion, 1, 6);
		cbReligion.setMinWidth(150);

		// create label for race
		Label labelRace = new Label("Race");
		cbRace.getItems().addAll("MALAY", "CHINESE", "INDIAN", "SIKH", "OTHERS");
		gp.add(labelRace, 0, 7);
		gp.add(cbRace, 1, 7);
		cbRace.setMinWidth(150);

		// create label for home address and set it input to all uppercase
		Label labelAddress = new Label("Home Address");
		gp.add(labelAddress, 0, 8);
		gp.add(tfAddress, 1, 8);
		tfAddress.setTextFormatter(new TextFormatter<>((change) -> {
			change.setText(change.getText().toUpperCase());
			return change;
		}));

		// create label for district and also the textfield. Set also the
		// characteristics that is Uppercase for all lettler
		Label labelDistrict = new Label("District");
		gp.add(labelDistrict, 0, 9);
		gp.add(tfDistrict, 1, 9);
		tfDistrict.setMaxWidth(150);
		tfDistrict.setTextFormatter(new TextFormatter<>((change) -> {
			change.setText(change.getText().toUpperCase());
			return change;
		}));

		// create label and textfield for postcode. Limit the user for entering the
		// input that is only 5
		Label labelPostcode = new Label("Postcode");
		gp.add(labelPostcode, 0, 10);
		gp.add(tfPostcode, 1, 10);
		tfPostcode.setMaxWidth(150);
		tfPostcode.textProperty().addListener(new ChangeListener<String>() {
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (!newValue.matches("\\d{0,5}?")) {
					tfPostcode.setText(oldValue);
				}
			}
		});

		// create label and textfield for state. Change all the letters to uppercase
		// when user enter the input
		Label labelState = new Label("State");
		gp.add(labelState, 0, 11);
		gp.add(tfState, 1, 11);
		tfState.setMaxWidth(150);
		tfState.setTextFormatter(new TextFormatter<>((change) -> {
			change.setText(change.getText().toUpperCase());
			return change;
		}));

		// create label and textfield for country. change the input that user enter to
		// uppercase
		Label labelCountry = new Label("Country");
		gp.add(labelCountry, 0, 12);
		gp.add(tfCountry, 1, 12);
		tfCountry.setMaxWidth(150);
		tfCountry.setTextFormatter(new TextFormatter<>((change) -> {
			change.setText(change.getText().toUpperCase());
			return change;
		}));

		// create label and combo box for marital status. set the minimum width of the
		// combo box
		Label labelMarital = new Label("Marital Status");
		cbMarital.getItems().addAll("SINGLE", "MARRIED", "DIVORCED", "WIDOWED", "OTHERS");
		gp.add(labelMarital, 0, 13);
		gp.add(cbMarital, 1, 13);
		cbMarital.setMinWidth(150);

		// create label and combobox for citizenship and set the minimum width
		Label labelCitizenship = new Label("Citizenship");
		cbCitizenship.getItems().addAll("CITIZEN", "NON-CITIZEN");
		gp.add(labelCitizenship, 0, 14);
		gp.add(cbCitizenship, 1, 14);
		cbCitizenship.setMinWidth(150);

		// create a next button and set it go to the next scene if click
		Button btnNext = new Button("Next");
		btnNext.setOnAction(e -> {
			MainPage.stage.setScene(MainPage.partB);

		});

		// align the gridpane to it position
		bp.setCenter(gp);
		bp.setBottom(btnNext);
		bp.setPadding(new Insets(20));
		bp.setAlignment(btnNext, Pos.BOTTOM_RIGHT);

	}

} // end of class PartA
