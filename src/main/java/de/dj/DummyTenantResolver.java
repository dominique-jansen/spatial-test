package de.dj;

import io.quarkus.hibernate.orm.PersistenceUnitExtension;
import io.quarkus.hibernate.orm.runtime.tenant.TenantResolver;
import jakarta.enterprise.context.RequestScoped;

@RequestScoped
@PersistenceUnitExtension
public class DummyTenantResolver implements TenantResolver {

    @Override
    public String getDefaultTenantId() {
        return "spatial-test2";
    }

    @Override
    public String resolveTenantId() {
        return "spatial-test";
    }

}
