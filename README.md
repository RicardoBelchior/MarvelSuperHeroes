# Marvel SuperHeroes

Sample app reading from the official [Marvel API](https://developer.marvel.com/), containing the following features:
- A list of all possible superheroes in the Marvel Multiverse
- Search the superheroes by their name
- See the full detailed page of the selected superhero with its respective comics.

This app uses a package structure following clean architecture concepts:
- data: Include Repositories, local and remote data sources
- domain: Include the model objects and (if needed) use case classes
- ui: Activities/Fragments/Views and ViewModels for the character/comic screens

The app uses [Retrofit](https://square.github.io/retrofit/) for accessing the Marvel API, 
[Room](https://developer.android.com/training/data-storage/room) for local storage and the 
[Paging library](https://developer.android.com/topic/libraries/architecture/paging/v3-overview) for 
scrolling through all the characters available in the API. Communication between layers is done 
using [Coroutines and Kotlin Flow](https://kotlinlang.org/docs/coroutines-guide.html). 
Dependency injection is handled with [Dagger Hilt](https://developer.android.com/training/dependency-injection/hilt-android).

The project includes a few unit and Espresso tests (`test/` and `androidTest/` using 
[Mockk](https://mockk.io/), [Barista](https://github.com/AdevintaSpain/Barista) as helper libraries. 
The dependencies on the Espresso tests are replaced using Hilt.

## Screenshots

- [Image #1](screenshots/img_1.png)
- [Image #2](screenshots/img_2.png)
- [Image #3](screenshots/img_3.png)
- [Image #4](screenshots/img_4.png)
- [Image #5](screenshots/img_5.png)
