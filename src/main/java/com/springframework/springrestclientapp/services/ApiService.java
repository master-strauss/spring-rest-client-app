package com.springframework.springrestclientapp.services;

/* cucul created on 18/10/2021 inside the package - com.springframework.springrestclientapp.services */

import com.springframework.api.domain.User;
import org.springframework.web.reactive.function.client.ClientResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);

    Flux<User> getUsers(Mono<Integer> limit);
}