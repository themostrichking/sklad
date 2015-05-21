package wh.entity.document.table;

import wh.entity.Entity;
import wh.entity.document.AbstractDocument;

public abstract class AbstractTableRow<T extends AbstractDocument> extends Entity {

    public AbstractTableRow(T doc) {
        super();
        this.doc = doc;
    }

    private static final long serialVersionUID = 1L;
    private T doc;

    /**
     * @return the document containing the table of the current row
     */
    public T getDoc() {
        return doc;
    }
}
