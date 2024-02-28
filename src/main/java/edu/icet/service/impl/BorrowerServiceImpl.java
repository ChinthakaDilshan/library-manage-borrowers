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
    public void setup(){
        this.mapper=new ModelMapper();
    }

    @Override
    public void addBorrower(Borrower borrower) {
        BorrowerEntity entity = mapper.map(borrower, BorrowerEntity.class);
        repository.save(entity);
    }

    @Override
    public List<BorrowerEntity> getBorrowers() {
        return (List<BorrowerEntity>) repository.findAll();
    }

    @Override
    public boolean deleteBorrower(Long id) {
        if(repository.existsById(id)){
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Borrower getBorrowerByUserName(String userName) {
      return mapper.map(repository.findByuserName(userName),Borrower.class);
    }

    @Override
    public Boolean isExistsUser(String userName) {
        repository.existsByUserName(userName);
        return null;
    }

//    @Override
//    public Borrower getBorrowerById(Long id) {
//        Optional<BorrowerEntity> byId = repository.findById(id);
//        return mapper.map(byId, Borrower.class);
//    }
}
