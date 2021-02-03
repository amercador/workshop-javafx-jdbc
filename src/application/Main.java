package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
// instanciamos um obj loader do tipo FXMLLoader passando o caminho da View;			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
// chamamos o load para carregar a view;			
			Parent parent = loader.load();
/* Vamos criar um obj do tipo Scene que será a cena principal e já instaciamos a ...
cena com o obj principal da view (que é um AnchorPane vazio);*/ 			
			Scene mainScene = new Scene(parent);
// chamamos o palco da cena que veio no parametro do método setando a cena dele com cena principal;
			primaryStage.setScene(mainScene);
// definimos um título para o palco;
			primaryStage.setTitle("Sample JavaFX application");
// mostramos o palco;			
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
