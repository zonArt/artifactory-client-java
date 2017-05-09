package org.jfrog.artifactory.client.model.builder.impl

import org.jfrog.artifactory.client.model.Principal
import org.jfrog.artifactory.client.model.Principals
import org.jfrog.artifactory.client.model.builder.PrincipalsBuilder
import org.jfrog.artifactory.client.model.impl.PrincipalsImpl

/**
 * @author Alix Lourme
 * @since > v2.1
 */
class PrincipalsBuilderImpl implements PrincipalsBuilder {

    private List<Principal> users
    private List<Principal> groups

    private PrincipalsBuilderImpl() {
    }

    @Override
    PrincipalsBuilder users(Principal... users) {
        this.users = Arrays.asList(users)
        this
    }

    @Override
    PrincipalsBuilder users(List<Principal> users) {
        this.users = users
        this
    }

    @Override
    PrincipalsBuilder groups(Principal... groups) {
        this.groups = Arrays.asList(groups)
        this
    }

    @Override
    PrincipalsBuilder groups(List<Principal> groups) {
        this.groups = groups
        this
    }

    Principals build() {
        PrincipalsImpl ps = new PrincipalsImpl()
        ps.setPrincipals(users, groups)
        return ps
    }
}