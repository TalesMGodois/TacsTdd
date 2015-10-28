public class Main{
    @Test
    public void addCustomer() {
        assertThat(customerStore.retrieve(ACME_ID), is(null));
        customerStore.add(new Customer(ACME_ID));
        //Todo
    }
}