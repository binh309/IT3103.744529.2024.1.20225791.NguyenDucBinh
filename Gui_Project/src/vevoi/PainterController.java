package vevoi;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class PainterController {
    @FXML
    private Canvas canvas;

    private GraphicsContext gc; // GraphicsContext for drawing
    private boolean eraseMode5791 = false;

    @FXML
    public void initialize() {
        // Initialize GraphicsContext
        gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.BLACK); // Default drawing color

        // Ensure Canvas listens to mouse events
        canvas.addEventHandler(MouseEvent.MOUSE_DRAGGED, this::onMouseDragged);
    }

    @FXML
    void onMouseDragged(MouseEvent event) {
        if (eraseMode5791) {
            gc.clearRect(event.getX(), event.getY(), 10, 10); // Erase a 10x10 area
        } else {
            gc.fillOval(event.getX(), event.getY(), 10, 10); // Draw a small circle
        }
    }

    @FXML
    void clearCanvas() {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight()); // Clear the entire canvas
    }

    @FXML
    void toggleEraseMode() {
        eraseMode5791 = !eraseMode5791; // Toggle between drawing and erasing
    }
}
