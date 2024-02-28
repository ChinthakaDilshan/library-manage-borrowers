package edu.icet.service;

import edu.icet.dto.Borrower;
import java.util.List;

public interface BorrowerService {
    void addBorrower(Borrower borrower);
    List<Borrower> getBorrowers();
    boolean deleteBorrower(Long id);
    Borrower getBorrowerById(Long id);
}
