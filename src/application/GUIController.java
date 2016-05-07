package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GUIController implements Initializable {

	@FXML
	private ImageView floweyImage;

	private Flowey f;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		f = new Flowey(this);

		floweyImage.setFitHeight(0); //set to prevent from streching; but should really check FXML for the size
		floweyImage.setFitWidth(0);
	}


	public void setImage(Image img){
		//
		floweyImage.setImage(img);
		floweyImage.setX((floweyImage.getScene().getWidth() - img.getWidth())/2); //hacky solution, changing the ImageView's size; I should document this
		floweyImage.setY((floweyImage.getScene().getHeight() - img.getHeight()));
	}


}
