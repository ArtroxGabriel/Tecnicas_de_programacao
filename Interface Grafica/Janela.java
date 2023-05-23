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
    b.setLocation(100, 100);
    b.setSize(50, 50);
    j.add(b, "North");

    Panel p = new Panel();
    p.setBackground(Color.green);
    j.add(p);

    Label l = new Label("Suibanana");
    l.setForeground(Color.white);
    l.setBackground(Color.gray);
    p.add(l);

    TextField t = new TextField("Login: ",20);
    t.setBackground(Color.pink);
    p.add(t);

    // j.setLayout(null);
    j.pack();
  }

  class TratadorJanela extends WindowListener {
    public void windowClosing(WindowEvent e) {
      System.exit(0);
    }
  }
}