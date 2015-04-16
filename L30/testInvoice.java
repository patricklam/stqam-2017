// Meszaros, p115
public void testInvoice_addLineItem7() {
  LineItem expItem = new LineItem(...);
  inv.addItemQuantity(product, QUANTITY);
  List lineItems = inv.getLineItems();
  LineItem actual = (LineItem) lineItems.get(0);
  assertEquals(expItem.getInv(), actual.getInv());
  assertEquals(expItem.getProd(), actual.getProd());
  assertEquals(expItem.getQuantity(),
               actual.getQuantity());
}
