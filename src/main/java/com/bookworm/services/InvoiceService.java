package com.bookworm.services;


import java.util.List;
import java.util.Optional;

import com.bookworm.entities.Invoice;

public interface InvoiceService {

	List<Invoice> getAllInvoice();
	
	void addInvoice(Invoice invoice);

	void deleteByInvoiceId(long id);

	Optional<Invoice> getById(long id);
	

}
