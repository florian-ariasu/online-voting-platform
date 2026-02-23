# Online Voting Platform

An object-oriented Java project implementing a voting platform with full election lifecycle management — covering electoral districts, candidates, voters, vote casting, and stage-based election control.

---

## Academic Transparency & AI Disclosure

This repository contains a university assignment submitted for academic evaluation.

**Status:** Developed and submitted during the active grading period for university credit.

**AI Usage:**
- **Initial Submission:** The original implementation submitted for grading was developed entirely without AI assistance.
- **Post-Submission Fixes:** After receiving test results, 5 failing tests were debugged and fixed using Cursor AI for educational purposes, applied after the academic deadline and not affecting the graded submission.

**Academic Integrity:** The submitted version was original work. AI assistance was only used post-deadline to understand edge cases and testing requirements.

---

## Classes

- **Alegeri:** Main election class containing election data and configuration.
- **Circumscriptie:** Represents electoral districts.
- **Persoana (abstract):** Base class for all persons in the system.
- **Candidat:** Extends `Persoana` to represent candidates.
- **Votant:** Extends `Persoana` to represent voters.
- **Vot:** Represents a cast vote.
- **FunctiiAuxiliare:** Utility methods for common operations.
- **ManagerGeneralAlegeri:** Core application manager class handling election logic.
- **StagiuAlegeri (enum):** Declares all 3 stages of the election process.

---

## Features

### Data Structures

- **HashMap\<\>:** Used for efficient command parsing and data retrieval.
- **ArrayList\<\>:** Used for maintaining ordered collections of voters, candidates, and votes.

### Design Patterns & OOP

- **Manager Pattern:** `ManagerGeneralAlegeri` avoids creating redundant `Alegeri` instances when handling errors from assignment requirements.
- **Abstraction:** `Persoana` is abstract — instances are only created as `Votant` or `Candidat`, never as generic objects.
- **Inheritance:** `Votant` and `Candidat` extend `Persoana` to share common attributes while adding role-specific functionality.
- **Enum Usage:** `StagiuAlegeri` enum avoids passing stage types as `String` arguments, improving type safety.
- **Encapsulation:** Class fields are private/protected with appropriate getters and setters.

### Command Routing

- Commands are read line by line and stored in a `HashMap<>`, allowing duplicates since commands may repeat for error testing.
- A `switch` statement handles clean, readable command routing.
- Exit command (18) directly exits the `Run()` method.

### Code Quality

- No inline comments — variable and method names are self-documenting.
- Consistent Romanian naming convention throughout.
- Standard Java formatting conventions applied.

---

## Observations & Potential Improvements

### Test Suite Limitations

- The test suite does not account for result ordering — all sorting by CNP or vote count is currently redundant because `contains()` is used.
- **Proposed fix:** Write results as blocks rather than sequentially to preserve order.

### Fraudulent Voter Detection

- Current logic may incorrectly flag clumsy voters (who attempt to vote twice) as fraudulent, even though their first vote isn't counted.
- **Improvement needed:** Better distinction between genuine fraud (second vote attempt) and accidental double submission.

---

## Running the Project

This project uses **Gradle** for dependency management and build automation. The Gradle Wrapper is included — no manual installation needed.

### Build

```bash
./gradlew build        # Linux / macOS
gradlew.bat build      # Windows
```

IntelliJ IDEA will recognize this as a Gradle project automatically via the included `settings.gradle` file.

---

## Development Notes

This is a 1st-year OOP course assignment, submitted for academic credit. The initial implementation was completed independently. Post-deadline fixes for 5 failing tests were applied using Cursor AI for learning purposes.

---

## License

This project is licensed under the MIT License. See the [LICENSE](./LICENSE) file for details.
