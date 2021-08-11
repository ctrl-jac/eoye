import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException,
            AWTException, InterruptedException
        {
            String command = "notepad.exe";
            Runtime run = Runtime.getRuntime();
            run.exec(command);
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            Robot robot = new Robot();
            while (true) {
                robot.keyPress(KeyEvent.VK_I);
                Thread.sleep(3000);
                robot.keyPress(KeyEvent.VK_SPACE);
                Thread.sleep(3000);
                robot.keyPress(KeyEvent.VK_A);
                Thread.sleep(3000);
                robot.keyPress(KeyEvent.VK_M);
                Thread.sleep(3000);
                robot.keyPress(KeyEvent.VK_SPACE);
                Thread.sleep(3000);
                robot.keyPress(KeyEvent.VK_E);
                Thread.sleep(3000);
                robot.keyPress(KeyEvent.VK_O);
                Thread.sleep(3000);
                robot.keyPress(KeyEvent.VK_Y);
                Thread.sleep(3000);
                robot.keyPress(KeyEvent.VK_ENTER);
                Thread.sleep(5000);
            }
        }
}
