package es.remoran.dev.springboot2blog.repo;

import es.remoran.dev.springboot2blog.model.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserRepository extends ElasticsearchRepository<User, String> {

    User findByUsername(String username);
}
