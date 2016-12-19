// Meszaros, p116
static void assertLineItemsEqual(String msg, LineItem exp, LineItem act) {
  assertEquals(msg+" Inv", expItem.getInv(),
               actual.getInv());
  assertEquals(msg+" Prod", expItem.getProd(),
               actual.getProd());
  assertEquals(msg+" Qty", expItem.getQuantity(),
               actual.getQuantity());
}
