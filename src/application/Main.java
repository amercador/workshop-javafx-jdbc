package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class Main extends Application   {
	
	private static Scene mainScene;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
// instanciamos um obj loader do tipo FXMLLoader passando o caminho da View;			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
// vamos substituir o obj parent por um scrollPane;			
			ScrollPane scrollPane = loader.load();
			
// macete para ajustar o MenuBar no ScrollPane;
			scrollPane.setFitToHeight(true); // ajusta na altura;
			scrollPane.setFitToWidth(true); // ajusta na largura;
			
/* Vamos criar um obj do tipo Scene que será a cena principal e já instaciamos a ...
cena com o obj principal da view (que é um scrollPane);*/ 			
			mainScene = new Scene(scrollPane);
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
	
	public static Scene getMainScene() {
		return mainScene;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
