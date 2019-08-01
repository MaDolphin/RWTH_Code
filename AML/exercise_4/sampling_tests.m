
z = rand(10000,1);

lambda = 0.5;

trans = - (1 / lambda) .* log(1-z);

close all;

figure; hist(z);
figure; hist(trans);
