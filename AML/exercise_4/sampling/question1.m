function [] = question1()
    n = 10000;
    randNr = createBadRand(n);
    newRand = [];
    for i = 1: max(size(randNr))
        if(randNr(i) < 0.5)
            newRand = [newRand, randNr(i)*2];
        else
            newRand = [newRand, 2*(randNr(i) - 0.5)];
        end
    end
    figure; hist(newRand);
end