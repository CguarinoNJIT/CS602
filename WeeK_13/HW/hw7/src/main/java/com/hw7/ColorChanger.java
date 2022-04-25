package com.hw7;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;



public class ColorChanger extends Application {

  @Override
  public void start(Stage primaryStage) {
    Group root = new Group();
    Scene scene = new Scene(root, 500, 260);

    Rectangle rectangle = new Rectangle(50, 50, 400, 130);

    //Colors
    int red  = 0; 
    int green = 0; 
    int blue = 0;
    Color starting_color = Color.rgb(red,green,blue); 
    // Color ending_color = Color.rgb(12, 220, 150);

    rectangle.setFill(starting_color);
    root.getChildren().add(rectangle);

    Slider slider = new Slider(0, 256, 0);
    slider.setLayoutX(50);
    slider.setLayoutY(200);
    slider.setPrefSize(400, 0);
    root.getChildren().add(slider);

    slider.valueProperty().addListener(new ChangeListener<Number>() {
        public void changed(ObservableValue <?extends Number>observable, Number oldValue, Number newValue){
           translate.setX((double) newValue);
           translate.setY(50);
           translate.setZ(100);

        }}
    // slider.heightProperty().addListener((ov, curVal, newVal) -> slider.setLayoutY(115 - slider.getHeight() / 2));
    // rectangle.arcWidthProperty().bind(slider.valueProperty());

    // slider2.widthProperty().addListener((ov, curVal, newVal) -> {
    //   slider2.setLayoutX(250 - slider2.getWidth() / 2);
    // });

    // roundRect.yProperty().bind(slider2.valueProperty());
    // root.getChildren().add(slider2);

    // slider2.valueProperty().addListener(
    //     (ov, curVal, newVal) -> slider.setLayoutY(slider.getLayoutY()
    //         + newVal.doubleValue() - curVal.doubleValue()));
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}