# Job test

Expected working hours: 2

This job test assignment is defined in Technicaltask.pdf 

My focus is to build a simple __maven__ app based on the names and reactions 
expected from the assignment. I will emphasize division of implementation via 
__composite design pattern__ and deselect low level programmatic details - 
to direct conversation over to structural issues. 

I use test-driven development (TDD) as the software development process. 

## Test, and run from target 
````
$> mvn clean test
$> mvn package 
$> java -jar ./target/formatter-0.0.1.jar left 15
````

