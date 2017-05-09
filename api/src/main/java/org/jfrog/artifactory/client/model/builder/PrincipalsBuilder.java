package org.jfrog.artifactory.client.model.builder;

import org.jfrog.artifactory.client.model.Principal;
import org.jfrog.artifactory.client.model.Principals;

import java.util.List;

/**
 * @author Alix Lourme
 * @since 2.1.1
 */
public interface PrincipalsBuilder {

    PrincipalsBuilder users(Principal... users);

    PrincipalsBuilder users(List<Principal> users);

    PrincipalsBuilder groups(Principal... groups);

    PrincipalsBuilder groups(List<Principal> groups);

    Principals build();
}