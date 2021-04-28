package aulaUdemy.armazenamento;

public class Controle {

	private Double totalBonus;
	
	public Double totalBonus(Funcionario funcionario) {
		return this.totalBonus = this.totalBonus + funcionario.bonifica();
	}
	
	public Double totalBonus(Gerente gerente) {
		return this.totalBonus = this.totalBonus + gerente.bonifica();
	}

	public Double getTotalBonus() {
		return totalBonus;
	}

	public void setTotalBonus(Double totalBonus) {
		this.totalBonus = totalBonus;
	}
	
}
