package edu.icet.controller;

import edu.icet.dto.Borrower;
import edu.icet.entity.BorrowerEntity;
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

    @PostMapping("/add-borrower")
    @ResponseStatus(HttpStatus.CREATED)
    public void addBorrower(@RequestBody Borrower borrower){
        service.addBorrower(borrower);
    }


    @GetMapping("/get-all-borrowers")
    public List<BorrowerEntity> getBorrowers(){
        return service.getBorrowers();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteBorrower(@PathVariable Long id){
        return (service.deleteBorrower(id)) ?
                ResponseEntity.ok("Borrower Deleted Successfully...") :
                ResponseEntity.notFound().build();
    }

    @GetMapping("find-by-borrower-name/{userName}")
    public Borrower getBorrowerById(@PathVariable String userName){
        return service.getBorrowerByUserName(userName);
    }

    @GetMapping("/is-exist-borrower/{userName}")
    public Boolean isExistsUser(@PathVariable String userName){
        return service.isExistsUser(userName);
    }

}
