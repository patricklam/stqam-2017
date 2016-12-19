// BAD
List lineItems = invoice.getLineItems();
if (lineItems.size() == 1) {
  // ...
} else {
  fail("Invoice should have exactly 1 line item");
}
