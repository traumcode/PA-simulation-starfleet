# PA-simulation-starfleet

Starfleet Control
In this exercise you will have to plan and implement an application that can be used to control a fleet of Spacecrafts. Pay attention to encapsulation, and have at least one abstract class.

Each Spacecraft has a unique registration code and a name that is set when they are built. Spacecrafts also store the year in which they were built, and they can tell other ships their type, which can be Space Station, Cargo Ship and Discovery Ship.

Space stations are immobile, but they are able to generate a list of all other Spacecraft of a given type, currently in space. Each of them also have a dock where maximum two mobile spacecrafts at a time can be docked in.

Cargo ships and Discovery ships are mobile vessels, meaning they can fly around in space. Their maximum speed stat shows how many times the speed of light (c) they can reach. 

Cargo ships have a maximum speed of 150c while Discovery ships can reach up to 450c, however the ships built before 2150 lose 30 units of speed and the ones build after 2200 gain an extra 15.

Each cargo ship carries 3 types of cargo: Food, Medicine and Weapons. They can have 0 - 5 pieces of each and their first shipment is determined randomly at construction.
All mobile ships know about all Space stations in space that have available docking slots. They have the ability to dock into any one of them.

When cargo ships dock into a space station they announce their registration code and the cargo they carry, then pick up a new shipment. Each time a Discovery ship docks into a station they save a log with their time of docking and the registration code of the Space station they docked into.
