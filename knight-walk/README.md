## Knight Walk

Given a square chessboard of N x N size, the position of Knight and position of a target is given. We need to find out the minimum steps a Knight will take to reach the target position.

![knight directions](https://github.com/itsbibeksaini/CompetativeProblems/blob/main/knight-walk/knightDirections.png)

As shown in above diagram we can see that knight can walk in eight directions. This is a unweighted graph therefore we use BFS to iterate over all the 8 directions in which knight can make move.
