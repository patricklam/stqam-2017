// Meszaros, p115
public void testInvoice_addLineItem8() {
  LineItem expItem = new LineItem(...);
  inv.addItemQuantity(product, QUANTITY);
  List lineItems = inv.getLineItems();
  LineItem actual = (LineItem) lineItems.get(0);
  assertEquals("Item", expItem, actual);
}
