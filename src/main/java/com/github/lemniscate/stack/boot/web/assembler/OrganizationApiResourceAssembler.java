package com.github.lemniscate.stack.boot.web.assembler;

import com.github.lemniscate.lib.sra.mapping.AbstractApiResourceAssembler;
import com.github.lemniscate.stack.boot.model.Organization;
import org.springframework.hateoas.Link;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class OrganizationApiResourceAssembler extends AbstractApiResourceAssembler<Organization> {

    @Override
    protected void doAddLinks(Collection<Link> links, Organization entity) {
        links.add( new Link("homepage", "http://organization.com"));
    }

}