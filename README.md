Quick app to demostrate the following:

The architecture that I have used is MVP, so that it is easier to test.

The Mainsview defines the interface that provides the functionality for this app. We can use this to guide the TDD. So, first, we create a test called, GameIsOver, which fails. We then write the code for it until it passes and then refactor the code, as required.

I have used interfaces ( e.g. for the activity , we present instead, to the presenter, an activityView), since, this is more fully testable, easily extensible, complies with best object-oriented practices ( SOLID ). Explanation: If we pass an instance of the activity through to the presenter, then the presenter then knows about the activity, then if the activity is complicated, and if we write a test for the presenter, then we have to write a mock version of the activity, which is difficult to do, so, we give the presenter an interface, then the presenter doesn’t know who implements the interface, and doesn’t care , and the test doesn’t care either, but the test can control and examine the view, to check if certain things have passed/failed.

This architecture facilitates TDD. Why because in TDD we follow 3 steps, 1) Write a failing test, 2) write code to pass that test, 3) refactor. Since, we use interfaces, which is our contract, the interfaces don’t change. The contract , of how to use the code doesn’t change. Hence, it won’t break the tests, when we refactor the code. The internals of the code is hidden from the tests.

We inject dependencies into the Presenter. Dependency Injection is a form of Dependency Inversion ( SOLID ).

We use mockito to write some unit tests; the structure is there for a good portion of the app to be unit tested.

There may be some functions that I have kept, but are unused ( currently ). Due to time constraints, otherwise, I may refactor the interface, Mainsview.

Again, due to time constraints, otherwise I would have built the UI aspect.

Note: This is the same as TPB2, except that I have used the new features of Dagger 2: the activity knows quite a bit about how it’s initialized with the dependencies. This violates the core principle of dependency injection known as Inversion of Control: The client delegates the responsibility of providing its dependencies to external code (the injector). The client code does not need to know about the injecting code.
