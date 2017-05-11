package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainApplicationWindow extends JFrame {
    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;
    private static final String FRAME_TITLE = "Chat";
    private static final long serialVersionUID = 1L;

    private static MainApplicationWindow mainApplicationWindow = null;

    private JPanel currentPanel = null;

    public MainApplicationWindow() {
        setupContent(new ChatPanel());
    }

    public MainApplicationWindow(JPanel panel) {
        setupContent(panel);
    }

    private void setupContent(JPanel panel) {
        this.setTitle(FRAME_TITLE);
        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setPanel(panel);
    }

    public void setPanel(JPanel panel) {
        if (currentPanel != null) {
            this.remove(currentPanel);
        }
        this.add(panel);
        currentPanel = panel;
        this.setVisible(true);
    }

    public static MainApplicationWindow getMainApplicationWindow() {
        if (mainApplicationWindow == null) {
            mainApplicationWindow = new MainApplicationWindow();
        }
        return mainApplicationWindow;
    }
}
