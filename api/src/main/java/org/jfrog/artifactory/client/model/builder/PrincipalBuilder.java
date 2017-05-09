package org.jfrog.artifactory.client.model.builder;

import org.jfrog.artifactory.client.model.Principal;
import org.jfrog.artifactory.client.model.Privilege;

import java.util.List;

/**
 * @author Alix Lourme
 * @since 2.1.1
 */
public interface PrincipalBuilder {

    PrincipalBuilder name(String name);

    PrincipalBuilder privileges(Privilege... privileges);

    PrincipalBuilder privileges(List<Privilege> privileges);

    Principal build();
}