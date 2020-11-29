package br.com.todolist.model;

public enum StatusTarefa {

	PENDENTE("Pendente"),
	FAZENDO("Fazendo"),
	CONCLUIDO("Concluido"),
	CANCELADO("Cancelado");
	
	private String status;

	private StatusTarefa(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
