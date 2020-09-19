/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cycle;

import javafx.application.*;
//import javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text ;


public class Cycle extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    public Cycle(){
    String name = Thread.currentThread().getName();
        System.out.println("Constructor() method: Current Thread :"+name);
    }
   
    @Override
    public void init() throws Exception{
    String name = Thread.currentThread().getName();
    System.out.println("init() method: Current Thread :"+name);
    super.init();
    
    }
    
    @Override
    public void start(Stage primaryStage){
    String name = Thread.currentThread().getName();
    System.out.println("start() method: Current Thread :"+name);
    
    StackPane root =new StackPane();
    root.getChildren().add(new Text("Hello Life Cycle"));
    Scene scene = new Scene(root,300,250);
    primaryStage.setScene(scene);
    primaryStage.show();
    }
    
    @Override
    public void stop() throws Exception{
    String name = Thread.currentThread().getName();
    System.out.println("stop() method: Current Thread :"+name);
    super.stop();
    }
}
