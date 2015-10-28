public void testInvoice_addLineItem_DO() {
      final int QUANTITY = 1;
      Product product = new Product("Dummy Product Name", getUniqueNumber());
      Invoice inv = new Invoice( new DummyCustomer() );
      LineItem expItem = new LineItem(inv, product, QUANTITY);
      // Exercise
      inv.addItemQuantity(product, QUANTITY);
      // Verify
      List lineItems = inv.getLineItems();
      assertEquals("number of items", lineItems.size(), 1);
      LineItem actual = (LineItem)lineItems.get(0);
      assertLineItemsEqual("", expItem, actual);
   }
