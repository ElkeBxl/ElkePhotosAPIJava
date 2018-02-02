# Java API for my photo portfolio

## Scope

To be used in http://elke.photos/project365. Currently the site uses a JSON file to get all its data.
I'm planning to change it so that it uses an API to retrieve its data.
In this repository I'm creating a first version of that API where I move the reading of the JSON file out of my Angular code and into a backend.
In the future I will further improve it by adding a database to avoid having to manage a JSON file.
But via this API I can already isolate everything so that the website is not impacted when I would migrate to the use of a database.

## Technologies used

* Java 8
* Spring Boot
* JSON (parsing via Jackson)