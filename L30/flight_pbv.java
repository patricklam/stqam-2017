// Meszaros, p. 472
// procedural behaviour verification
public void testRemoveFlightLogging_PBV() {
 // fixture setup:
 FlightDto expectedFlightDto=createARegisteredFlight();
 FlightManagementFacade=new FlightManagementFacadeImpl();
 // test double setup:
 AuditLogSpy logSpy = new AuditLogSpy();
 facade.setAuditLog(logSpy);
 // exercise:
 facade.removeFlight(expectedFlightDto.getFlightNo());
 // verify:
 assertEquals("number of calls",
              1, logSpy.getNumberOfCalls());
 // ...
 assertEquals("detail",
              expectedFlightDto.getFlightNumber(),
              logSpy.getDetail());
}
