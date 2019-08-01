function randNr = createBadRand(n)


randNr = [];

for i = 1:n
 randNr = [randNr, badRand];
end

hist(randNr, 8);
end