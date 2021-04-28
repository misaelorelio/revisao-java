package aulaUdemy.armazenamento;

public class Controle {

	private Double totalBonus;
	
	public Double totalBonus(double valor) {
		return this.totalBonus = this.totalBonus + valor;
	}

	public Double getTotalBonus() {
		return totalBonus;
	}

	public void setTotalBonus(Double totalBonus) {
		this.totalBonus = totalBonus;
	}
	
}
