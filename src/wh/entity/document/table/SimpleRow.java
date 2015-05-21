package wh.entity.document.table;

import wh.entity.document.AbstractDocument;
import wh.entity.reference.InventoryItem;

public class SimpleRow<T extends AbstractDocument> extends AbstractTableRow<AbstractDocument> {

    public SimpleRow(T doc) {
        super(doc);
    }

    private static final long serialVersionUID = 1L;
    private InventoryItem inventoryItem;
    private Long quantity;
    private byte quantityFractionalLength;
    private Long price;
    private byte priceFractionalLength;//0 or 2
    private Long sum;
    private byte sumFractionalLength;//0 or 2

    

}
