# 1672. Richest Customer Wealth.

You are given an `m x n` integer grid accounts where accounts`[i][j]` is the amount of money the `i`<sup>`th`</sup> customer has in the `j`<sup>`th`</sup> bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

## Example 1:

> Input: accounts = [[1,2,3],[3,2,1]]<br>
> Output: 6<br>
> Explanation:<br>
> 1st customer has wealth = 1 + 2 + 3 = 6<br>
> 2nd customer has wealth = 3 + 2 + 1 = 6<br>
> Both customers are considered the richest with a wealth of 6 each, so return 6.<br>

## Constraints:

* `m == accounts.length`
* `n == accounts[i].length`
* `1 <= m, n <= 50`
* `1 <= accounts[i][j] <= 100`