package guru.springframework.reactivemongo.repositories;

import guru.springframework.reactivemongo.domain.Beer;
import guru.springframework.reactivemongo.domain.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface BeerRepository extends ReactiveMongoRepository<Beer, String> {
}
