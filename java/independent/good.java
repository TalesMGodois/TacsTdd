@Test
public void isNoLongerAvailableAfterCheckout() {
    theTrialHolding.checkOut(TODAY);

    assertFalse(theTrialHolding.isAvailable());
}

@Test
public void isAvailableAfterCheckin() {
    theTrialHolding.checkOut(TODAY);

    theTrialHolding.checkIn(TOMORROW, BranchTestData.ROCKRIMMON_BRANCH);


    assertTrue(theTrialHolding.isAvailable());
}