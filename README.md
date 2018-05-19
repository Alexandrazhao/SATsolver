# Project Description

> In computer science, the [Boolean satisfiability problem](https://en.wikipedia.org/wiki/Boolean_satisfiability_problem) (sometimes called propositional satisfiability problem and abbreviated as SATISFIABILITY or SAT) is the problem of determining if there exists an interpretation that satisfies a given Boolean formula. In other words, it asks whether the variables of a given Boolean formula can be consistently replaced by the values TRUE or FALSE in such a way that the formula evaluates to TRUE. If this is the case, the formula is called satisfiable. On the other hand, if no such assignment exists, the function expressed by the formula is FALSE for all possible variable assignments and the formula is unsatisfiable. For example, the formula "a AND NOT b" is satisfiable because one can find the values a = TRUE and b = FALSE, which make (a AND NOT b) = TRUE. In contrast, "a AND NOT a" is unsatisfiable. 

> SAT is the first problem that was proven to be [NP-complete](https://en.wikipedia.org/wiki/NP-completeness).

# Project Features

  - uses the [Davis-Putnam](https://en.wikipedia.org/wiki/Davis%E2%80%93Putnam_algorithm) (DP) algorithm
  - reads from the command line the name of a file then reads the input formula within the file. 
    Input files have following format (see test txt files):
     - Optional comment lines at the beginning of the file start with the character ‘c’.
     - The first data line has the format “p cnf number-of-variables number-of clauses”. Variables are numbered starting at    1. 
     - The specification of the clauses follows, one clause per line. A clause line ends with a ‘0’. A clause is specified by writing             the numbers of the literals that occur in it. Note that the negated variable number i is specified as –i; thus, the clause (not-           x12 or x3 or x41) is specified in this file format as –12 3 41 0.
  - times the length of computation
  - multiplates many 1D and 2D arrays along with linkedlists
  - Prints to the command line a satisfying assignment for input formula (if one exists). If no satisfying assignment exists, reports that     the input formula is unsatisfiable.
