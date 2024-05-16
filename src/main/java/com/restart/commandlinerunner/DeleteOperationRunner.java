package com.restart.commandlinerunner;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.restart.entity.Invoice;
import com.restart.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class DeleteOperationRunner implements CommandLineRunner {

     @Autowired
     InvoiceRepository repo;

     @Override 
     public void run(String... args) throws Exception {

         //Remove a record where id=2 using deleteById() method
         repo.deleteById(2);

         //Retrive all records using findAll() method
         List<Invoice> invoices = repo.findAll();
         invoices.forEach(System.out::println);
      }
}