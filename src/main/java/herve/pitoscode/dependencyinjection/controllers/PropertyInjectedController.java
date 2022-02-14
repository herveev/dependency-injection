package herve.pitoscode.dependencyinjection.controllers;

import herve.pitoscode.dependencyinjection.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService  greetingService;

    public String getGreeting(){
         return  greetingService.sayGreeting();
    }
}
