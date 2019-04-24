package lt.vu.auth;

import org.apache.deltaspike.security.api.authorization.Secures;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class Authorizer {

    @Inject
    private AuthenticatedUserHolder authenticatedUserHolder;

    @Secures
    @UserLoggedInValidity
    public boolean tikrinamArPrisijunges() throws Exception {
        return authenticatedUserHolder.isAuthenticated();
    }

    @Secures
    @AdministratorValidity
    public boolean tikrinamArAdminas() throws Exception {
        return authenticatedUserHolder.isAdmin();
    }
}
