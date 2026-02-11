# Online Voting Platform

> [!IMPORTANT]
> This is the first project assignment for the Object-Oriented Programming (OOP) course (2nd year, 1st semester).
- This implementation was developed and **submitted for academic credit** during the active course period.
- The initial implementation was **completed independently** without AI assistance.
- **5 failing tests** were fixed with **AI assistance (Cursor)** after the submission deadline for learning purposes.
- Final version successfully passes all tests.

## ⚠️ Academic Transparency & AI Disclosure

This repository contains a university assignment that was submitted for academic evaluation.

- **Status:** This code was developed and **submitted during the active grading period** for university credit.
- **AI Usage:** 
  - **Initial Submission:** The original implementation that was submitted for grading was developed **entirely without AI assistance**.
  - **Post-Submission Fixes:** After receiving test results, **5 failing tests** were debugged and fixed using **Cursor AI** for educational purposes.
  - The AI-assisted fixes were applied **after the academic deadline** and did not affect the graded submission.
- **Learning Approach:** The project served as hands-on practice with Java OOP principles. Post-deadline AI assistance was used as a learning tool to understand why certain test cases failed.
- **Academic Integrity:** The submitted version was original work. AI assistance was only used after grading to improve understanding of edge cases and testing requirements.

---

## Classes

For this project I have implemented the following classes:

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

### Classes and Design Patterns

- **Manager Pattern:** Used a `ManagerGeneralAlegeri` class to avoid creating redundant `Alegeri` instances when handling errors from the assignment requirements.
- **Abstraction:** `Persoana` is an **abstract** class because instances are only created as `Votant` or `Candidat`, never as generic `Persoana` objects.
- **Inheritance:** `Votant` and `Candidat` extend `Persoana` to share common person attributes while adding role-specific functionality.
- **Enum Usage:** Defined `StagiuAlegeri` enum to avoid passing stage type as `String` arguments, improving type safety.

### Reading Data

- Commands are read line by line and stored in a `HashMap<>`.
- The HashMap allows duplicate values since commands may repeat for error testing purposes.
- Data is extracted by iterating through the HashMap and processing command values.

### Method Calling

- Used a `switch` statement for clean, readable command routing.
- Code is formatted based on which method needs to be called.
- Exit command (18) directly exits the `Run()` method.

### OOP Principles

- **Encapsulation:** Class fields are private/protected with appropriate getters and setters.
- **Abstraction:** Implemented via the abstract `Persoana` class.
- **Inheritance:** Extended base functionality into specialized subclasses (`Votant`, `Candidat`).

### Code Quality

- **No Comments:** Code is kept clean without inline comments.
- **Consistent Naming:** All variables, methods, and classes use Romanian naming in a single language.
- **Descriptive Names:** Variable and method names are self-documenting, eliminating the need for clarifying comments.
- **Java Conventions:** Followed standard Java formatting conventions for consistency.

---

## Observations and Potential Improvements

### AppTest.java Limitations

- The test suite could be improved as it does not account for result ordering.
- All sorting by CNP or number of votes is currently **redundant** because the `contains()` method is used.
- **Proposed Solution:** Results could be written as blocks instead of sequentially to preserve order.

### Fraudulent Voter Detection

- Current implementation may incorrectly categorize clumsy voters (who attempt to vote twice) as fraudulent, even though their first vote isn't counted.
- **Improvement Needed:** Implement better logic to distinguish between genuine fraudulent voters (at their second vote) and those making mistakes.

---

## Running the Project

This project uses **Gradle** for dependency management and build automation.

> [!NOTE]
> You do not need to install Gradle manually, as the project includes the Gradle Wrapper (`gradlew`).

The project includes a `settings.gradle` file for build configuration.

### Building the Project

To download dependencies and compile the project:

```bash
./gradlew build  # Windows users: gradlew.bat build
```

### Gradle Integration with IntelliJ IDEA

> [!TIP]
> - The project includes the **Gradle Wrapper** (`gradle/wrapper` directory)
- IntelliJ IDEA recognizes this as a Gradle project automatically
- No additional plugins required
- Access Gradle tasks directly from the IDE sidebar

---

## Test Fixes — 8 October 2024

I fixed five previously failing unit tests in this project after the submission deadline for educational purposes.

### What Changed

- Fixed five failing unit tests that surfaced during automated test runs.
- Addressed root causes in application logic and edge-case handling.
- Test assertions now match the corrected behavior.
- No breaking API changes were introduced.
- Fixes are targeted and restore expected behavior.

---

## License

This project is licensed under the MIT License. See the [LICENSE](./LICENSE) file for details.
