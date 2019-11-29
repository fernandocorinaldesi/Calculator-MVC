package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.Controller;

public class NormalView extends JFrame implements View {

	private static final long serialVersionUID = 1L;
	private JPanel contenedor_botones;
	private JPanel contenedor_botones2;
	private JPanel contenedor_resultado;
	private JButton uno;
	private JButton dos;
	private JButton tres;
	private JButton cuatro;
	private JButton cinco;
	private JButton seis;
	private JButton siete;
	private JButton ocho;
	private JButton nueve;
	private JButton mas;
	private JButton menos;
	private JButton igual;
	private JButton borrar;
	private JTextField resultado;
	private String num;

	public NormalView() {
		super("CALCULADORA");
		setSize(300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		construirCentro();
		construirEste();
		construirNorte();
		ButtonListener();
	}

	public void construirNorte() {
		contenedor_resultado = new JPanel();
		resultado = new JTextField();
		resultado.setColumns(20);
		contenedor_resultado.add(resultado);
		contenedor_resultado.setBackground(Color.GRAY);
		add(contenedor_resultado, BorderLayout.NORTH);

	}

	public void construirEste() {
		contenedor_botones2 = new JPanel();
		contenedor_botones2.setBackground(Color.black);
		mas = new JButton("+");
		menos = new JButton("-");
		igual = new JButton("=");
		borrar = new JButton("borrar");
		contenedor_botones2.add(mas);
		contenedor_botones2.add(menos);
		contenedor_botones2.add(igual);
		contenedor_botones2.add(borrar);
		contenedor_botones2.setLayout(new GridLayout(4, 1, 3, 3));
		contenedor_botones2.setBorder(new EmptyBorder(5, 5, 5, 5));
		add(contenedor_botones2, BorderLayout.EAST);

	}

	public void construirCentro() {
		contenedor_botones = new JPanel();
		contenedor_botones.setBackground(Color.blue);
		uno = new JButton("1");
		dos = new JButton("2");
		tres = new JButton("3");
		cuatro = new JButton("4");
		cinco = new JButton("5");
		seis = new JButton("6");
		siete = new JButton("7");
		ocho = new JButton("8");
		nueve = new JButton("9");

		contenedor_botones.setBorder(new EmptyBorder(5, 5, 5, 5));
		contenedor_botones.setLayout(new GridLayout(3, 3, 3, 3));
		contenedor_botones.add(uno);
		contenedor_botones.add(dos);
		contenedor_botones.add(tres);
		contenedor_botones.add(cuatro);
		contenedor_botones.add(cinco);
		contenedor_botones.add(seis);
		contenedor_botones.add(siete);
		contenedor_botones.add(ocho);
		contenedor_botones.add(nueve);
		add(contenedor_botones, BorderLayout.CENTER);

	}

	public void ButtonListener() {

		uno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				num = resultado.getText() + uno.getText();
				resultado.setText(num);
			}
		});
		dos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num = resultado.getText() + dos.getText();
				resultado.setText(num);

			}
		});
		tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num = resultado.getText() + tres.getText();
				resultado.setText(num);

			}
		});
		cuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				num = resultado.getText() + cuatro.getText();
				resultado.setText(num);
			}
		});
		cinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num = resultado.getText() + cinco.getText();
				resultado.setText(num);

			}
		});
		seis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num = resultado.getText() + seis.getText();
				resultado.setText(num);

			}
		});
		siete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num = resultado.getText() + siete.getText();
				resultado.setText(num);

			}
		});
		ocho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				num = resultado.getText() + ocho.getText();
				resultado.setText(num);
			}
		});
		nueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num = resultado.getText() + nueve.getText();
				resultado.setText(num);

			}
		});
		mas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num = resultado.getText() + mas.getText();
				resultado.setText(num);

			}
		});
		menos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num = resultado.getText() + menos.getText();
				resultado.setText(num);

			}
		});
		borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resultado.setText("");

			}
		});

	}

	@Override
	public void open() {
		setVisible(true);
		setLocationRelativeTo(null);
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return resultado.getText();

	}

	@Override
	public void setText(String s) {
		// TODO Auto-generated method stub
		resultado.setText(s);
		;
	}

	@Override
	public void operation(Controller controller) {
		igual.addActionListener((event) -> {
			controller.operation();

		});

	}

	@Override
	public void showError(String err) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(this, err);

	}

	
}
