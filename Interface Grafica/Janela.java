import java.awt.*;

class Janela extends Frame {
  Janela(String titulo) {
    super(titulo);
    setSize(500, 500);
    setVisible(true);
    this.setBackground(Color.white);
  }

  public static void main(String[] args) {
    Janela j = new Janela("Minha Janela");
    Button b = new Button("OK");
    b.setForeground(Color.black);
    b.setBackground(Color.red);
    b.setLocation(150, 150);
    b.setSize(200, 100);
    j.add(b, "south");

    j.setLayout(null);
    j.pack();
  }
}