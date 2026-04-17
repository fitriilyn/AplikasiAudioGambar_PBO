/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aplikasiaudiogambar;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import java.net.URL;
import javafx.scene.control.Button; 
import javafx.scene.control.Label;  
import javafx.scene.layout.VBox;    
/**
 *
 * @author hp
 */
public class AplikasiAudioGambar extends Application {
   @Override
public void start(Stage primaryStage) {
    // Layout FlowPane
    FlowPane root = new FlowPane();
    root.setPadding(new Insets(30));
    root.setHgap(25);
    root.setVgap(25);
    root.setAlignment(Pos.CENTER);
    root.setStyle("-fx-background-color: #f0f0f0;");

    // Tambah hewan
    tambahHewan(root, "KUCING", "kucing.jpg", "kucing.mp3");
    tambahHewan(root, "SAPI", "sapi.jpg", "sapi.mp3");
    tambahHewan(root, "DOMBA", "domba.jpg", "domba.mp3");
    tambahHewan(root, "SERIGALA", "serigala.jpg", "serigala.mp3");
    tambahHewan(root, "AYAM", "ayam.jpg", "ayam.mp3");
    tambahHewan(root, "ANJING", "anjing.jpg", "anjing.mp3");
    tambahHewan(root, "KUDA", "kuda.jpg", "kuda.mp3");
    tambahHewan(root, "LUMBA", "lumba.jpg", "lumba.mp3");

    // Ukuran window
    Scene scene = new Scene(root, 1000, 650);
    primaryStage.setTitle("Kebun Binatang Digital - Kelompok 2");
    primaryStage.setScene(scene);
    primaryStage.show();
}

   private void tambahHewan(FlowPane container, String judulHewan, String namaGambar, String namaSuara) {
    try {
        // Wadah Vertikal untuk satu hewan
        VBox boxHewan = new VBox(10); 
        boxHewan.setAlignment(Pos.CENTER);
        boxHewan.setPadding(new Insets(15));
        boxHewan.setStyle("-fx-background-color: white; -fx-background-radius: 15; -fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.1), 10, 0, 0, 10);");

        // 1. Nama Hewan (Label)
        Label lblNama = new Label(judulHewan);
        lblNama.setStyle("-fx-font-weight: bold; -fx-font-size: 16px; -fx-text-fill: #333;");

        // 2. Gambar Hewan
        URL imageRes = getClass().getResource("/" + namaGambar);
        Image img = new Image(imageRes.toExternalForm());
        ImageView imageView = new ImageView(img);
        imageView.setFitWidth(140);
        imageView.setPreserveRatio(true);

        // 3. Setup Suara
        URL soundRes = getClass().getResource("/" + namaSuara);
        Media sound = new Media(soundRes.toExternalForm());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);

        // 4. Tombol 
        Button btnSuara = new Button("Dengarkan Suaranya");
        btnSuara.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-weight: bold;");
        btnSuara.setCursor(javafx.scene.Cursor.HAND);
        
        btnSuara.setOnAction(event -> {
            mediaPlayer.stop();
            mediaPlayer.play();
        });

        // Dimasukkan ke VBox
        boxHewan.getChildren().addAll(lblNama, imageView, btnSuara);
        container.getChildren().add(boxHewan);
        
    } catch (Exception e) {
        System.err.println("Gagal memuat " + judulHewan + ": " + e.getMessage());
    }
 }

    public static void main(String[] args) {
        launch(args);
    }
}
