package guru.springframework.reactivemongo.config.service;

import guru.springframework.reactivemongo.model.BeerDTO;
import reactor.core.publisher.Mono;

public interface BeerService {
    Mono<BeerDTO> saveBeer(Mono<BeerDTO> beerDTO);

    Mono<BeerDTO> getById(String beerId);
}
