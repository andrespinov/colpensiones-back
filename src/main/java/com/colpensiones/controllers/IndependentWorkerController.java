package com.colpensiones.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.colpensiones.domain.models.IndependentWorker;
import com.colpensiones.domain.repositories.IndependentWorkerRepository;

@RestController
public class IndependentWorkerController {
	private final IndependentWorkerRepository repository;

	IndependentWorkerController(IndependentWorkerRepository repository) {
		this.repository = repository;
	}
	
	  // Aggregate root
	
	  @GetMapping("/independent-worker")
	  List<IndependentWorker> all() {
	    return repository.findAll();
	  }
	
	  @PostMapping("/independent-worker")
	  IndependentWorker newIndependentWorker(@RequestBody IndependentWorker newWorker) {
	    return repository.save(newWorker);
	  }

	  @PutMapping("/independent-worker/{document}")
	  IndependentWorker replaceIndependentWorker(@RequestBody IndependentWorker modifiedWorker,@PathVariable Long document) {
	
	    return repository.findById(document)
	      .map(worker -> {
	    	  worker.setApproved(modifiedWorker.isApproved());
	        return repository.save(worker);
	      })
	      .orElseGet(() -> {
	        return null;
	      });
	  }
}
