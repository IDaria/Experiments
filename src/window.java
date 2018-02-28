import javax.swing.JFrame;

public class window extends JFrame{

    public window(){
        super("What's up kiddo");
        setBounds(200, 200, 400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        window app = new window();
        app.setVisible(true);
    }
}
