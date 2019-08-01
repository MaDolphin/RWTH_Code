function [] = question2a()
close all; 
clc
    % rejection sampling

    nIterations = 10000;
    nSamplesA = [];
    nSamplesR = [];

    for i = 1:nIterations
        x = rand;
        s = 2*rand;
        if(s < 2*(x^2))
            nSamplesA = [nSamplesA, x];
        else
            nSamplesR = [nSamplesR, x];
        end
    end

    hist(nSamplesA, 20);
    figure;
    hist(nSamplesR, 20);
    
    ratio = size(nSamplesA) / size(nSamplesR)
end