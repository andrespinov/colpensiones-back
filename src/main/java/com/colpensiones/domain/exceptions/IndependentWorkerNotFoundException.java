package com.colpensiones.domain.exceptions;

public class IndependentWorkerNotFoundException extends RuntimeException {

	IndependentWorkerNotFoundException(Long document) {
		super("El trabajador con document " + document + " no fue encontrado.");
	}
}
