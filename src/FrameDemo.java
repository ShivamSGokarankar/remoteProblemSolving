import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

public class FrameDemo extends JFrame {

    FrameDemo () throws InterruptedException {
        setSize(100,100);
        setTitle("demo");
        setVisible(true);
        Thread.sleep(5000);
        setVisible(false);

    }

    public static void main(String[] args) throws InterruptedException {
            FrameDemo f = new FrameDemo();

    }
}
