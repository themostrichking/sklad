package wh.service.document;

import java.util.Date;

import wh.entity.document.AbstractDocument;
import wh.service.EntityService;

public interface DocumentService extends EntityService<AbstractDocument> {
    AbstractDocument getByDate(Date date);
}
