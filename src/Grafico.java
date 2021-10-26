
import javax.swing.JFrame;

import org.jfree.chart.ChartColor;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class Grafico extends JFrame {

	Funcionario f1 = new Funcionario("Henrique de Sousa - 93540", 40);
	Funcionario f2 = new Funcionario("Tatiana Velosa - 92556", 25);
	Funcionario f3 = new Funcionario("Gonçalo Rodrigues - 92600", 20);
	Funcionario f4 = new Funcionario("Paulo Palma - 69234", 15);

	public Grafico() {

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Grafico Grupo 9");
		setSize(950, 700);
		setLocationRelativeTo(null);

		createGraph();
		setVisible(true);

	}

	public void createGraph() {

		DefaultPieDataset pizza = new DefaultPieDataset();
		pizza.setValue(f1.getNome(), f1.getHoras());
		pizza.setValue(f2.getNome(), f2.getHoras());
		pizza.setValue(f3.getNome(), f3.getHoras());
		pizza.setValue(f4.getNome(), f4.getHoras());

		JFreeChart grafico = ChartFactory.createPieChart("Pie Chart", pizza, true, true, false);

		PiePlot fatia = (PiePlot) grafico.getPlot();

		fatia.setSectionPaint("Paulo Palma - 69234", ChartColor.ORANGE);

		ChartPanel painel = new ChartPanel(grafico);
		add(painel);
	}

	public class Funcionario {

		private String nome;
		private int horas;

		public Funcionario(String nome, int horas) {

			this.nome = nome;
			this.horas = horas;

		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getHoras() {
			return horas;
		}

		public void setHoras(int horas) {
			this.horas = horas;
		}

		@Override
		public String toString() {
			return "Funcionario [nome=" + nome + ", horas=" + horas + "]";
		}

	}

	public static void main(String[] args) {

		new Grafico();
		// TODO Auto-generated method stub

	}

}