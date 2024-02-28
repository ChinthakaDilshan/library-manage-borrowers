package edu.icet.service;

import edu.icet.dto.Borrower;
import edu.icet.entity.BorrowerEntity;

import java.util.List;

public interface BorrowerService {
    void addBorrower(Borrower borrower);
    List<BorrowerEntity> getBorrowers();
    boolean deleteBorrower(Long id);
    Borrower getBorrowerByUserName(String userName);

    Boolean isExistsUser(String userName);
}

