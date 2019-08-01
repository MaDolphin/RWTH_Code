function y = badRand()
u = rand;
if(u < 0.7)
    y = rand / 2;
else
    y = 0.5 + rand/2;
end

end

