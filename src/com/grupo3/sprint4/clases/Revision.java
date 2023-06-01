package com.grupo3.sprint4.clases;

public class Revision {
	private final int idRevision;
	private int idVisita;
	private static int contador;

	
	private Revision() {
		this.idRevision = ++Revision.contador;
	}

	public Revision(int idVisita) {
		this();
		this.idVisita = idVisita;
	}

	public int getIdRevision() {
		return idRevision;
	}

	public int getIdVisita() {
		return idVisita;
	}

	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}

	@Override
	public String toString() {
		return "Revision [idRevision=" + idRevision + ", idVisita=" + idVisita + "]";
	}
}
