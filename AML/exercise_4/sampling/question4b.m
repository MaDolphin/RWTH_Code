function question4b()

weights = [0.3 0.7];
mus = [0 10];
sigmas = [2 2];
Nsamples = 50000;
x = zeros(Nsamples,1);
sigma_prop = 10;

% Standard deviation of the Gaussian proposal.
targetArgs = {weights, mus, sigmas};
proposalArgs = {sigma_prop};
seed = 1; randn('state', seed); rand('state', seed);
xinit = 20*rand(1,1); % initial state
[x, naccept] = MH(@target, @proposal, xinit, Nsamples, targetArgs, proposalArgs);

N_bins = 50;
Ns = [3000 5000 8000 Nsamples];
figure;
gauss = zeros(max(size(linspace(-10,20,1000))), 1);
for i=1:4
  hold on;
  subplot(2,2,i)
  x_t = linspace(-10,20,1000);
  for j = 1:max(size(x_t));
    gauss(j) = GaussMix(0, sqrt(2), 10, sqrt(2), x_t(j), weights(1), weights(2));
  end

  [b,a] = hist(x(2000:Ns(i)), N_bins);
  measure = a(10)-a(9); % bin width.
  area = sum(b*measure);
  bar(a,b/(area),'r')

  hold on;
  plot(x_t, gauss, 'linewidth', 2);
  
  axis([-10 20 0 .25])
  text(14,.1,sprintf('N=%d', Ns(i)))
end

end

function [res] = compute1DGaussian(mu, sigma, x)
    factor = 1/(sigma*sqrt(2*pi));
    res = factor * exp(-0.5*((x-mu)/sigma)^2);
end


function [result] = GaussMix(mu1, sigma1, mu2, sigma2, x, weight1, weight2)
    result = weight1*compute1DGaussian(mu1, sigma1, x) + weight2*compute1DGaussian(mu2, sigma2, x);
end

function xp = proposal(x, sigma_prop)
    xp = x + sigma_prop*randn(1,1);
end

function p = mogProb(x, mixWeights, mu, sigma)
    K = length(mixWeights);
    N = length(x);
    p = zeros(N,1);
    for k=1:K
      p = p + mixWeights(k)*mvnpdf(x(:), mu(k), sigma(k));
    end
end

function p = target(x, mixWeights, mus, sigmas)
    p = mogProb(x, mixWeights, mus, sigmas);
end


function p = proposalProb(x, xprime, sigma_prop)
p = normpdf(x, xprime, sigma_prop);
end