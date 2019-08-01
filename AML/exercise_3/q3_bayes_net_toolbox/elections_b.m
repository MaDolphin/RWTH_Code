function []=elections1b()

% Add the necessary paths for the Bayes Net Toolbox
addpath(genpathKPM(pwd));

% Set up the DAG
% Create the Bayes network
N = 4; 
dag = zeros(N,N);
names = {'E', 'P', 'SE', 'SH'};
E = 1; P = 2; SE = 3; SH = 4;
dag(E, [SE SH]) = 1;
dag(P, [SE SH]) = 1;
discrete_nodes = 1:N;
node_sizes = 3*ones(1,N); 
node_sizes(E) = 2;
bnet = mk_bnet(dag, node_sizes, 'discrete', discrete_nodes, 'names', names);

% Show the Bayes net
figure;
draw_graph(bnet.dag, names);

% Add the probability distributions
bnet.CPD{E} = tabular_CPD(bnet, E, 'CPT', [0.5 0.5]);
bnet.CPD{P} = tabular_CPD(bnet, P, 'CPT', [1/3 1/3 1/3]);
bnet.CPD{SE} = tabular_CPD(bnet, SE, 'CPT', [0.89 1/3 0.89 0.15 0.98 0.2 0.1 1/3 0.1 0.15 0.1 0 0.01 1/3 0.01 0.7 0.01 0.8]);
bnet.CPD{SH} = tabular_CPD(bnet, SH, 'CPT', [0.89 0.05 0.89 1/3 0.98 0.2 0.1 0.15 0.1 1/3 0.1 0 0.01 0.8 0.01 1/3 0.01 0.8]);

% Create a junction-tree inference engine
engine = jtree_inf_engine(bnet);

% Create evidence
evidence = cell(1,N);
evidence{E} = 2;
evidence{SE} = 3;
evidence{SH} = 2;
[engine,~] = enter_evidence(engine, evidence);

% Get the marginal probability for a burglary
marg = marginal_nodes(engine, P);

% Report
fprintf('If E=T, SE = high and SH = mod\n');
fprintf('\tThe probability of candidate being in party A = %f\n', marg.T(1));
fprintf('\tThe probability of candidate being in party B = %f\n', marg.T(2));
fprintf('\tThe probability of candidate being in party C = %f\n', marg.T(3));

end