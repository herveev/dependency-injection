package herve.pitoscode.dependencyinjection.controllers;

import herve.pitoscode.dependencyinjection.services.GreetingService;

public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String getGreeting(){
        return greetingService.sayGreeting();
    }
}
