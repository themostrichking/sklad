package wh.service.reference;

import wh.entity.reference.AbstractReference;
import wh.service.EntityService;

public interface ReferenceService<T extends AbstractReference> extends EntityService<T> {
    T getByName(String name);
}
