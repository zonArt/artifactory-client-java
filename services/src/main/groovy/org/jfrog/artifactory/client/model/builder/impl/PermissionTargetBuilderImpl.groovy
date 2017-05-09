package org.jfrog.artifactory.client.model.builder.impl

import org.jfrog.artifactory.client.model.PermissionTarget
import org.jfrog.artifactory.client.model.Principals
import org.jfrog.artifactory.client.model.builder.PermissionTargetBuilder
import org.jfrog.artifactory.client.model.impl.PermissionTargetImpl

/**
 * @author jbaruch
 * @since 26/11/12
 */
class PermissionTargetBuilderImpl implements PermissionTargetBuilder {

    private String name
    private String includesPattern
    private String excludesPattern
    private List<String> repositories
    private Principals principals

    @Override
    PermissionTargetBuilder name(String name) {
        this.name = name
        this
    }

    @Override
    PermissionTargetBuilder includesPattern(String includesPattern) {
        this.includesPattern = includesPattern
        this
    }

    @Override
    PermissionTargetBuilder excludesPattern(String excludesPattern) {
        this.excludesPattern = excludesPattern
        this
    }

    @Override
    PermissionTargetBuilder repositories(String... repositories) {
        this.repositories = Arrays.asList(repositories)
        this
    }

    @Override
    PermissionTargetBuilder repositories(List<String> repositories) {
        this.repositories = repositories
        this
    }


    @Override
    PermissionTargetBuilder principals(Principals principals) {
        this.principals = principals
        this
    }

    @Override
    PermissionTarget build() {
        return new PermissionTargetImpl(name, includesPattern, excludesPattern, repositories, principals)
    }
}
