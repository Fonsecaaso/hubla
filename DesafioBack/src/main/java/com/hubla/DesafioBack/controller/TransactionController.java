package com.hubla.DesafioBack.controller;

import com.hubla.DesafioBack.entity.UploadRequest;
import com.hubla.DesafioBack.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    @Autowired
    TransactionService transactionService;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public ResponseEntity<?> postText(@RequestBody UploadRequest req){
        return transactionService.processTransactions(req);
    }
}
