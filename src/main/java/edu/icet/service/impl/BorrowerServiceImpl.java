package edu.icet.service.impl;

import edu.icet.dto.Borrower;
import edu.icet.entity.BorrowerEntity;
import edu.icet.repository.BorrowerRepository;
import edu.icet.service.BorrowerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class BorrowerServiceImpl implements BorrowerService {
    final BorrowerRepository repository;
      ModelMapper mapper;

    @Bean
    public ModelMapper setup(){
        return new ModelMapper();
    }
    @Override
    public void addBorrower(Borrower borrower) {
        BorrowerEntity entity = mapper.map(borrower, BorrowerEntity.class);
        repository.save(entity);
    }

    @Override
    public List<Borrower> getBorrowers() {
        return null;
    }

    @Override
    public boolean deleteBorrower(Long id) {
        return false;
    }

    @Override
    public Borrower getBorrowerById(Long id) {
        return null;
    }
}
