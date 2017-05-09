package org.jfrog.artifactory.client.model.builder;

import org.jfrog.artifactory.client.model.PermissionTarget;
import org.jfrog.artifactory.client.model.Principals;

import java.util.List;

/**
 * @author jbaruch
 * @since 26/11/12
 */
public interface PermissionTargetBuilder {

    PermissionTargetBuilder name(String name);

    PermissionTargetBuilder includesPattern(String includesPattern);

    PermissionTargetBuilder excludesPattern(String excludesPattern);

    PermissionTargetBuilder repositories(String... repositories);

    PermissionTargetBuilder repositories(List<String> repositories);

    PermissionTargetBuilder principals(Principals principals);

    PermissionTarget build();
}
