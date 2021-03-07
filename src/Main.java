import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Main  extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        stage.setTitle("Images and label");
        stage.setWidth(400);
        stage.setHeight(500);
        VBox root=new VBox();
        ImageView imageView=new ImageView("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcT3Wjd-Cak78mooEfHTx64D7xhFtgBMZRFiiQ&usqp=CAU");
        root.getChildren().addAll(imageView);

        Scene scene=new Scene(root);
        stage.setScene(scene);



        stage.show();

    }

    public static void main(String[] args) { launch(args);

    }
}
