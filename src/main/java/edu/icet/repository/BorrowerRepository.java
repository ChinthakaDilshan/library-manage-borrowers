package edu.icet.repository;

import edu.icet.entity.BorrowerEntity;
import org.springframework.data.repository.CrudRepository;

public interface BorrowerRepository extends CrudRepository<BorrowerEntity,Long> {
    public BorrowerEntity findByuserName(String userName);

    Boolean existsByUserName(String userName);
}
