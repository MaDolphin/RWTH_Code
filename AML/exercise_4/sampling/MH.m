function [samples, naccept] = MH(target, proposal, xinit, Nsamples, targetArgs, proposalArgs, proposalProb)

if nargin < 5, targetArgs = {}; end
if nargin < 6, proposalArgs = {}; end
if nargin < 7, proposalProb = []; end
d = length(xinit);

samples = zeros(Nsamples, d);
x = xinit(:)';
naccept = 0;
pOld = feval(target, x, targetArgs{:});

burn_in_phase = 1;
for t=1:Nsamples
  if burn_in_phase > 0 && t == 2000
      % start over -- throw away the previous samples
      t = 1;
      burn_in_phase = 0;
  end
  
  xprime = feval(proposal, x, proposalArgs{:});

  pNew = feval(target, xprime, targetArgs{:});
  alpha = pNew / pOld+eps;
  if ~isempty(proposalProb)
    qnumer = feval(proposalProb, x, xprime, proposalArgs{:}); % q(x|x’)
    qdenom = feval(proposalProb, xprime, x, proposalArgs{:}); % q(x’|x)
    alpha = alpha * (qnumer/qdenom);
  end
  r = min(1, alpha);
  u = rand(1,1);
  if u < r
    x = xprime;
    naccept = naccept + 1;
    pOld = pNew;
  end
  samples(t,:) = x;
end
end




