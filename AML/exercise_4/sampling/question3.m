function [] = question3()
close all; 
clc; 

it = 1000;  % # of iterations
mu1 = 0;
mu2 = 10;
sigma1 = 2;
sigma2 = 2;

muprop = 3;
sigmaprop = 10;

weight1 = 0.3;
weight2 = 0.7;

% visualization 
x = -20:0.1:20;
    
gauss1 = [];
gauss2 = [];

gaussTarget = [];
gaussprop = [];

for i = 1:max(size(x))
   gauss1 = [gauss1 , gaussian(mu1, sigma1, x(i))]; 
   gauss2 = [gauss2 , gaussian(mu2, sigma2, x(i))]; 
   gaussprop = [gaussprop , gaussian(muprop, sigmaprop, x(i))]; 
   gaussTarget = [gaussTarget , gaussian(3, 1, x(i))]; 
end

newgauss = gauss1.*weight1 + gauss2.*weight2;

plot(x, newgauss, 'b-'); hold on;
plot(x, gaussprop, 'r-');
plot(x, sqrt(x)/100, 'm-');


% importance sampling 
qzSamples = zeros(it, 1);
pSamples = zeros(it,1);
sum = 0;

for i = 1:it   
    qz = random('norm', muprop, sqrt(sigmaprop));
    qzSamples(i)=qz;
    qzValue = compute1DGaussian(muprop, sigmaprop, qz);
    pSamples(i) = GaussMix(mu1, sigma1, mu2, sigma2, qz, weight1, weight2);
    sum = sum + (pSamples(i) / qzValue)*targetfunc(qz);
end

sum = sum / it;
expectation = sum
figure;
hist(qzSamples, 20);
% figure;
% hist(pSamples, 20);
end

function [res] = compute1DGaussian(mu, sigma, x)
    factor = 1/(sigma*sqrt(2*pi));
    res = factor * exp(-0.5*((x-mu)/sigma)^2);
end

function[res] = targetfunc(x)
    if x > 0    
        res = (1/100)*sqrt(x);
    else
        res = 0;
    end
end

function [result] = GaussMix(mu1, sigma1, mu2, sigma2, x, weight1, weight2)
    result = weight1*compute1DGaussian(mu1, sigma1, x) + weight2*compute1DGaussian(mu2, sigma2, x);
end