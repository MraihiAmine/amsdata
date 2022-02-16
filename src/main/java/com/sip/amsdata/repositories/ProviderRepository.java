package com.sip.amsdata.repositories;

//import java.util.List;
import com.sip.amsdata.entities.Provider;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProviderRepository extends CrudRepository<Provider, Long> {
}
