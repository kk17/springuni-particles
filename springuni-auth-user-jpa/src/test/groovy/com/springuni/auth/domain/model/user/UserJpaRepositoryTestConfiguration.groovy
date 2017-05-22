package com.springuni.auth.domain.model.user

import org.hibernate.cfg.AvailableSettings
import org.springframework.context.annotation.Configuration

/**
 * Created by lcsontos on 5/5/17.
 */
@Configuration
class UserJpaRepositoryTestConfiguration extends UserJpaRepositoryConfiguration {

  protected void customizeJpaPropertyMap(Map<String, String> jpaPropertyMap) {
    jpaPropertyMap.put(AvailableSettings.HBM2DDL_AUTO, "create")
  }

  protected Optional<String> getJdbcUrl() {
    return Optional.of("jdbc:h2:mem:test")
  }

}
