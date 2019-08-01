function [p] = gaussian(mu, sigma, x)
    factor = 1/(sigma*sqrt(2*pi));
    p = factor * exp(-0.5*((x-mu)/sigma)^2);
end