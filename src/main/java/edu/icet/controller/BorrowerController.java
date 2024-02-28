package edu.icet.controller;

import edu.icet.dto.Borrower;
import edu.icet.service.BorrowerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/borrower")
@RequiredArgsConstructor
public class BorrowerController {
    final BorrowerService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addBorrower(@RequestBody Borrower borrower){
        service.addBorrower(borrower);
    }


    @GetMapping("/get")
    public List<Borrower> getBorrowers(){
        return service.getBorrowers();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteBorrower(@PathVariable Long id){
        return (service.deleteBorrower(id)) ?
                ResponseEntity.ok("Borrower Deleted Successfully...") :
                ResponseEntity.notFound().build();
    }

    @GetMapping("search/{id}")
    public Borrower getBorrowerById(@PathVariable Long id){
        return service.getBorrowerById(id);
    }
}
