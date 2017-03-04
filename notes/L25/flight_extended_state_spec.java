// Meszaros, p. 471
// extended state specification
public void testRemoveFlightLogging_NSC() {
 // setup:
 FlightDto expectedFlightDto=createRegisteredFlight();
 FlightMgmtFacade=new FlightMgmtFacadeImpl();
 // exercise:
 facade.removeFlight(expectedFlightDto.getFlightNo());
 // verify:
 assertFalse("flight still exists after removed",
             facade.flightExists(expectedFlightDto, getFlightNo()));
}
