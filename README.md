<img width="1915" height="982" alt="Screenshot 2026-04-15 at 1 21 25 AM" src="https://github.com/user-attachments/assets/fda37da4-3fb0-4590-acfc-6ef3ecbed484" />
# Da Best Theater Reservation Kiosk

This is my JavaFX kiosk simulation for managing a movie theater reservations. Made as part of my Year Up LTCA curriculum.

## Purpose(ish)? LOL

Kind of simulates a POS-style reservation terminal where the user can enter their name, pick a date, select a movie, and choose the number of tickets. On submission, it displays a formatted confirmation message as of April 14.

This was inspired by real systems that I've taken inspiration from such as Toast POS.

## Tech Used

- Java 26
- JavaFX 21 (FXML + CSS)
- Maven

## What I Learned

- How `initialize()` works in JavaFX controllers and why it's useful for pre-loading data
- Building user-defined classes (`MovieOptions`) to group related data together instead of using raw strings
- Wiring FXML to a controller with `@FXML` and `fx:id`
- Separating business logic (`TheaterReservation`) from UI logic (`HelloController`)
- Debugging source version mismatches across three different places (pom.xml, Project Structure, Modules)
- Translating HTML/CSS mental models into JavaFX equivalents (`input` → `TextField`, `placeholder` → `promptText`, `select` → `ComboBox`)
- How data flows from UI → controller → output using `getText()` and `setText()`
- Why `@FXML` annotations are required to wire fields to the view
- The difference between `void` methods and methods that return values
- Defensive programming — checking `names.length` before accessing array indexes to avoid crashes
- Overriding `toString()` on a custom class to control how it displays in a UI component

## For Future Refactors

- `formatDate()` has no input validation — if the user types a date without slashes, it will crash. I will need to check in at a later date to add a length check before accessing the split array for further exploration.
- Empty field validation on form submit — currently there are check if fields are left blank before confirming a reservation.
- Movie list is hardcoded — in a real app this would be a database call or perhaps I can use a API like IMDB.

## Potential Future Exploration

- **IMDB API** — pull real movie data, posters, and ratings instead of hardcoding
- **PostgreSQL / AWS RDS** — store reservations in a real database and retrieve them (Helps me learn AWS)
- **JavaFX SceneBuilder** — No clue what this is but Claude said it might be worth exploring.
- **Multiple screens** — add a confirmation screen after booking, or an admin view to see all reservations
- **Input validation** — regex for date format, number-only check for ticket count.
- **Ticket pricing logic** — calculate total price based on tickets × movie price and display it

## Acknowledgements
Thank you to my LTCA Instructor Matt for introducing me to JavaFX and encouraging me to explore in this direction.
