// GOOD
List lineItems = invoice.getLineItems();
// (guard assertion:)
assertEquals("number of items", lineItems.size(), 1);
// ... proceed as before
