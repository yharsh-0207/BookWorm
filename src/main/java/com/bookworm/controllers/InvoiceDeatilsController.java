package com.bookworm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookworm.entities.InvoiceDetail;
import com.bookworm.services.InvoiceDetailService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/invoiceDetails")
public class InvoiceDeatilsController {
	@Autowired
	private InvoiceDetailService service;
	
	@PostMapping("/add")
	public void setInvoiceDetails(@RequestBody InvoiceDetail invdtl) {
		service.setInvoiceDetails(invdtl);
	}

}
