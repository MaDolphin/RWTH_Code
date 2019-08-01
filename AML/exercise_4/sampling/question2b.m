function question2b
% sampling - the transformation method
% we observe that the cumulative function is F(x) = 2/3 * x^3; 
% In such cases it is easy to use the inverse of F to 
% perform sampling by starting from a uniform distribution.

n = 10000;
samples = zeros(n,1);
for i = 1:n
    u = rand;
    samples(i)= ((3/2)*u)^(1/3);
end

hist(samples, 20);
hold on;

end