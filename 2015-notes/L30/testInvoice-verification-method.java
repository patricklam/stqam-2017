// Meszaros, p117
static void assertInvoiceContainsOnlyThisLineItem(Invoice inv, LineItem exp) {
  List lineItems = inv.getLineItems();
  assertEquals("number of items", lineItems.size(), 1);
  LineItem actual = (LineItem)lineItems.get(0);
  assertLineItemsEqual("", expItem, actual);
}
