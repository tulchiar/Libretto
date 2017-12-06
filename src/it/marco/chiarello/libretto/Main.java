package it.marco.chiarello.libretto;
	
import it.marco.chiarello.libretto.model.Model;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			// TdP - lezione 8 - minuto 45
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Libretto.fxml"));
			
			BorderPane root = (BorderPane)loader.load();
			
			LibrettoController controller = loader.getController();
			Model model = new Model();
			controller.setModel(model);
			
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
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
