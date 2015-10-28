@Test
public void testAvailability() {
    theTrialHolding.checkOut(TODAY);
    assertFalse(theTrialHolding.isAvailable());

    theTrialHolding.checkIn(TOMORROW, BranchTestData.ROCKRIMMON_BRANCH);
    assertTrue(theTrialHolding.isAvailable());
}