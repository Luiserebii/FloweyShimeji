package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.initStyle(StageStyle.TRANSPARENT);
			Parent root = FXMLLoader.load(getClass().getResource("GUI.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene.setFill(null);

	        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
	        primaryStage.setX(screenBounds.getWidth() - scene.getX() - 220);
	        primaryStage.setY(screenBounds.getHeight() - scene.getY() - 280);
	        primaryStage.setAlwaysOnTop(true);

	        primaryStage.setTitle("Flowey Shimeji ;)");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
