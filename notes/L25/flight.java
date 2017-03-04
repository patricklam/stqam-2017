// Meszaros, p. 471
// not self-checking
public void testRemoveFlightLogging_NSC() {
 // setup:
 FlightDto expectedFlightDto=createRegisteredFlight();
 FlightMgmtFacade=new FlightMgmtFacadeImpl();
 // exercise:
 facade.removeFlight(expectedFlightDto.getFlightNo());
 // verify:
 // have not found a way to verify the outcome yet
 //  Log contains record of Flight removal
}
