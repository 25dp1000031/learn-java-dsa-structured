def maxBottlesDrunk(numBottles: int, numExchange: int) -> int:        
    empty = numBottles
    BottlesDrank = numBottles
    
    while empty >= numExchange:
        BottlesDrank += 1
        empty += 1 
        numExchange += 1
        empty -= numExchange
        
    return BottlesDrank 
    
print(maxBottlesDrunk(13,6))