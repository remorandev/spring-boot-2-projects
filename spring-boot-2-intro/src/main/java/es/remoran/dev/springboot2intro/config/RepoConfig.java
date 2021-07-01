package es.remoran.dev.springboot2intro.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/***
 * La auditoría de la base de datos significa rastrear y registrar eventos
 * relacionados con entidades persistentes, o simplemente control de versiones de entidades.
 * Inspirados en los disparadores de SQL, los eventos son operaciones de inserción, actualización y eliminación en entidades.
 *
 * Anotaciones: @PrePersist  @PreUpdate @PreRemove
 */
@Configuration
@EnableJpaAuditing
public class RepoConfig {
}
