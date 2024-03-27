## Pre-condition

Buy:

| Shares |    Cost | Trade Date |
|-------:|--------:|-----------:|
|    100 |   7,000 | 2024-02-01 |
|    200 |  14,200 | 2024-02-02 |
|    500 | 300,000 | 2024-02-10 |

## Scenario #1
**Give**

Shares need to sell: 7,00 Shares

**When**

Cost Method = A

**Then**

Sell once, and cost is:

`average cost = shares need to sell / sum up all shares * sum up all cost` 

## Scenario #2
**Give**

Shares need to sell: 7,00 Shares

**When**

Cost Method = I

**Then**

Sell per trades:

Sell: 100 shares, 7,000 cost

Sell: 200 shares, 14,200 cost

Sell: 400 shares, 400/500 * 30,000 = 24,000 cost

