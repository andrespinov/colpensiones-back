package com.colpensiones.domain.exceptions;

public class IndependentWorkerNotFoundException extends RuntimeException {

	public IndependentWorkerNotFoundException(Long document) {
		super("El trabajador con document " + document + " no fue encontrado.");
	}
}
