package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
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
	private JButton dividir;
	private JButton multi;
	private JButton igual;
	private JButton borrar;
	private JButton coma;
	private JButton cero;
	private JButton dcero;
	private JTextField resultado;
	private String num;

	public NormalView() {
		super("CALCULADORA");
		setSize(300, 370);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(construirNorte(), BorderLayout.NORTH);
		add(construirEste(), BorderLayout.EAST);
		add(construirCentro(), BorderLayout.CENTER);
		ButtonListener();

	}

	private JPanel construirNorte() {
		JPanel pane = new JPanel();
		Font f = new Font("Sanserif", Font.BOLD, 24);
		resultado = new JTextField();
		resultado.setEditable(false);
		resultado.setColumns(12);
		resultado.setFont(f);
		pane.add(resultado);
		pane.setBackground(new Color(130, 191, 227));

		return pane;

	}

	private JPanel construirEste() {
		JPanel pane = new JPanel();
		pane.setBackground(new Color(69, 159, 214));
		mas = new JButton("+");
		menos = new JButton("-");
		multi = new JButton("*");
		dividir = new JButton("/");
		igual = new JButton("=");
		borrar = new JButton("borrar");
		pane.add(mas);
		pane.add(menos);
		pane.add(multi);
		pane.add(dividir);
		pane.add(igual);
		pane.add(borrar);
		pane.setLayout(new GridLayout(6, 1, 3, 3));
		pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		return pane;

	}

	private JPanel construirCentro() {
		JPanel pane = new JPanel();
		pane.setBackground(new Color(71, 71, 224));

		uno = new JButton("1");
		dos = new JButton("2");
		tres = new JButton("3");
		cuatro = new JButton("4");
		cinco = new JButton("5");
		seis = new JButton("6");
		siete = new JButton("7");
		ocho = new JButton("8");
		nueve = new JButton("9");
		cero = new JButton("0");
		dcero = new JButton("00");
		coma = new JButton(".");

		pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		pane.setLayout(new GridLayout(4, 3, 3, 3));
		pane.add(uno);
		pane.add(dos);
		pane.add(tres);
		pane.add(cuatro);
		pane.add(cinco);
		pane.add(seis);
		pane.add(siete);
		pane.add(ocho);
		pane.add(nueve);
		pane.add(cero);
		pane.add(dcero);
		pane.add(coma);
		return pane;

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
		cero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num = resultado.getText() + cero.getText();
				resultado.setText(num);

			}
		});
		dcero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num = resultado.getText() + cero.getText() + cero.getText();
				resultado.setText(num);

			}
		});
		coma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num = resultado.getText() + coma.getText();
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
		multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num = resultado.getText() + multi.getText();
				resultado.setText(num);

			}
		});
		dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num = resultado.getText() + dividir.getText();
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
		setResizable(false);
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
