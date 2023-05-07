> SUMMARY: In Java, `switch` statement[*] acts as a **generalized goto** - where the cases are interpreted as labels, not blocks, and the switch and break statements explicitly change control flow - as in C. It is thus characterized by **fallthrough** feature.
> 
> [*] as opposed to switch expression in Java

Semantically, there are two main forms of switch statements.

* The first form are **structured switches**, as in Pascal, where exactly one branch is taken, and the cases are treated as separate, exclusive blocks. This functions as a generalized if–then–else [conditional](https://en.wikipedia.org/wiki/Conditional_(computer_programming) "Conditional (computer programming)"), here with any number of branches, not just two.
* The second form are unstructured switches, as in C, where the cases are treated as labels within a single block, and the switch functions as a **generalized goto** (but forward-only). This distinction is referred to as the treatment of **fallthrough**, which is elaborated below.

##### fallthrough

but this can cause bugs due to unintentional fallthrough if the programmer forgets to insert the `break` statement. This is thus seen by many as a language wart, and warned against in some lint tools. 

**Syntactically, the cases are interpreted as labels, not blocks, and the 
switch and break statements explicitly change control flow.**

In some cases languages provide optional fallthrough. For example, [Perl](https://en.wikipedia.org/wiki/Perl "Perl") does not fall through by default, but a case may explicitly do so using a `continue` keyword. This prevents unintentional fallthrough but allows it when desired. Similarly, [Bash](https://en.wikipedia.org/wiki/Bash_(Unix_shell) "Bash (Unix shell)") defaults to not falling through when terminated with `;;`, but allow fallthrough[[3]](https://en.wikipedia.org/wiki/Switch_statement#cite_note-3) with `;&` or `;;&` instead.

[Switch statement - Wikipedia](https://en.wikipedia.org/wiki/Switch_statement)

The current design of Java's `switch` statement follows 
closely languages such as C and C++, and supports fall through semantics
 by default. Whilst **this traditional control flow is often useful for 
writing low-level code (such as parsers for binary encodings)**, as `switch` is used in higher-level contexts, its **error-prone** nature starts to 
outweigh its flexibility. For example, in the following code, the many `break` statements make it unnecessarily **verbose**, and this visual noise often masks hard to debug errors, where missing `break` statements would mean accidental fall through.

Design implications of Java’s switch statements and switch expressions https://blogs.oracle.com/javamagazine/post/java-switch-statements-expressions
