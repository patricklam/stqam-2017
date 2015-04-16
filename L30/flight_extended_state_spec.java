// Meszaros, p. 471
// extended state specification
public void testRemoveFlightLogging_NSC() {
 // setup:
 FlightDto expectedFlightDto=createARegisteredFlight();
 FlightManagementFacade=new FlightManagementFacadeImpl();
 // exercise:
 facade.removeFlight(expectedFlightDto.getFlightNo());
 // verify:
 assertFalse("flight still exists after being removed",
             facade.flightExists(expectedFlightDto, getFlightNo()));
}
