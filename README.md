# wushaowei-A2-final-ready

 Day 1 – Project Setup & Base Classes

Completed tasks:

Set up project directory structure and created the src folder.

Implemented the foundational object-oriented classes:

Person

Employee (inherits from Person)

Visitor (inherits from Person with additional attributes)

Designed and created the RideInterface defining required behaviours:

Queue operations

Ride history operations

Sorting

Run cycle functionality

Outcome:

Established the inheritance hierarchy.

Defined clear interfaces for later implementation.

Built the structural foundation of the entire assignment.

 Day 2 – Queue System & Ride History (Part 3 + Part 4A)

Completed tasks:

Created the initial version of the Ride class.

Implemented Queue functionality using LinkedList:

addVisitorToQueue()

removeVisitorFromQueue()

printQueue()

Added Ride history collection using LinkedList.

Implemented all required Part 4A methods:

addVisitorToHistory()

checkVisitorFromHistory()

numberOfVisitors()

printRideHistory() (using an Iterator — required for marks)

Added demonstration code in:

partThree()

partFourA()

Outcome:

Fully functional queue and history tracking system.

Successful use of LinkedList and Iterator as required in the brief.

Completed Part 3 and Part 4A of the assignment.

 Day 3 – Sorting & Run-One-Cycle (Part 4B + Part 5)

Completed tasks:

Implemented a custom Comparator class (VisitorComparator) using two instance variables for comparison (age + name).

Added sorting functionality to the Ride class:

sortRideHistory() (using Collections.sort with a Comparator)

Implemented ride cycle simulation:

runOneCycle() removes a visitor from the queue and adds them to the ride history.

Updated AssignmentTwo to include:

partFourB() for sorting demonstration

partFive() for cycle demonstration

Outcome:

Achieved complete support for sorted ride history (Part 4B).

Successfully demonstrated a full ride cycle (Part 5).

Strengthened object-oriented logic with practical use of Comparator.

 Day 4 – HashMap + File I/O (Part 6 + Part 7)

Completed tasks:

Added a HashMap<String, Visitor> to improve visitor lookup efficiency.

Implemented Part 6 methods:

addVisitorToMap()

searchVisitorByName()

Implemented Part 7 File I/O:

saveRideHistoryToFile(String filename) using BufferedWriter

Exported ride history to a .txt / .csv file

Added demonstration code in:

partSix()

Outcome:

Fully implemented Part 6 and Part 7 of the assignment.

Completed final features required by the brief.

Produced a fully functioning, end-to-end amusement ride management program.


How to compile and run (at the project root)：

javac -d out src/*.java
java -cp out AssignmentTwo