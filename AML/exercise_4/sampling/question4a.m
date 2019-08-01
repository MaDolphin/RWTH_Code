function  demo4a()


mu = 0;
sigma = 1;
Nsamples = 50000;
x = zeros(Nsamples,1);
h = 1;                  % Standard deviation of the Gaussian proposal.
targetArgs = {mu, sigma};
proposalArgs = {h};

xinit = rand(1,1); % initial state

[x, naccept] = MH(@target, @proposal, xinit, Nsamples,   targetArgs, proposalArgs);

% plot the histogram of samples
N_bins = 50;
Ns = [3000 5000 8000 Nsamples];
figure;
gauss = zeros(max(size(linspace(-3,3,1000))), 1);
for i=1:4
    hold on;
  subplot(2,2,i)
  x_t = linspace(-3,3,1000);
  for j = 1:max(size(x_t));
    gauss(j) = target(x_t(j), mu, sigma);
  end

  [b,a] = hist(x(2000:Ns(i)), N_bins);
  measure = a(2)-a(1); % bin width.
  area = sum(b*measure);
  bar(a,b/(area),'y')
  hold on;
  plot(x_t, gauss, 'linewidth', 2);
  
  axis([-3 3 0 0.5])
  text(3,.1,sprintf('N=%d', Ns(i)))
end

end


function xp = proposal(x, h)
xp = random('unif', x-(h/2), x+(h/2));
end

function p = target(x, mus, sigmas)
p = normpdf(x, mus, sigmas);
end

% function p = proposalProb(x, xprime, h)
% p = random('unif', xprime-(h/2), xprime+(h/2));
% end