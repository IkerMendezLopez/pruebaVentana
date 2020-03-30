package ejercicio1;

import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Ventana extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel img;
	private JTextField txtNombre;
	private ButtonGroup grupo;
	private JRadioButton jrbMedia;
	private JRadioButton jrbCompleta;
	private JComboBox<Ciclo> comboCiclo;
	private JButton guardar;
	private JButton borrar;

	private static String[] arrayPermiso = { "Permiso B1", "Ingles", "Euskera", "Experiencia" };
	private static Ciclo[] arrayCiclos = { new Ciclo("Desarrollo de Aplicaciones Web", "GS"),
			new Ciclo("Desarrollo de Aplicaciones Web", "GS"), new Ciclo("Desarrollo de Aplicaciones Web", "GS") };
	private JCheckBox[] checkArray = new JCheckBox[arrayPermiso.length];

	public Ventana() {
		this.setTitle("INSTANCIA DE EMPLEO");
		this.setLayout(null);

		
		img = new JLabel(redim("ventanasProg.jpg", 150, 200));
		img.setBounds(30,30,150,200);
		
		txtNombre = new JTextField();
		//TextPrompt placeholder = new TextPrompt("Apellido Paterno", txtNombre);
		txtNombre.setText("Escribe aqui tu nombre");
		txtNombre.setBounds(200, 30, 300, 30);

		jrbMedia = new JRadioButton("Media Jornada");
		jrbCompleta = new JRadioButton("Jornada Completa");
		grupo = new ButtonGroup();
		grupo.add(jrbCompleta);
		grupo.add(jrbMedia);
		jrbCompleta.setBounds(200, 60, 150, 50);
		jrbMedia.setBounds(400, 60, 150, 50);

		comboCiclo = new JComboBox<Ciclo>(arrayCiclos);
		comboCiclo.setBounds(200, 110, 300, 30);

		for (int i = 0; i < arrayPermiso.length; i++) {
			checkArray[i] = new JCheckBox(arrayPermiso[i], true);
			checkArray[i].setBounds(200 + i * 150, 140, 150, 50);
			this.add(checkArray[i]);
		}

		guardar = new JButton("GUARDAR");
		guardar.setBounds(200, 200, 100, 30);
		borrar = new JButton("BORRAR");
		borrar.setEnabled(false);
		borrar.setBounds(350, 200, 100, 30);

		this.add(img);
		this.add(txtNombre);
		this.add(jrbMedia);
		this.add(jrbCompleta);
		this.add(comboCiclo);
		this.add(guardar);
		this.add(borrar);
		this.setSize(800,300);
	}

	private static ImageIcon redim(String fichImag, int ancho, int alto){
		ImageIcon imIcon = new ImageIcon(fichImag);
		Image im = imIcon.getImage();
		Image im2 = im.getScaledInstance(ancho, alto, 0);
		return new ImageIcon(im2);
	}

	public static void main(String[] args) {
		Ventana v1 = new Ventana();
		v1.setVisible(true);
	}
}
