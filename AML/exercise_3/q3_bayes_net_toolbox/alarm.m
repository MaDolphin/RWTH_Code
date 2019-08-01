function [] = alarm()

% % Add the necessary paths for the Bayes Net Toolbox
%   addpath(genpathKPM(pwd));

  % Set up the DAG
  % Create the Bayes network
  N = 5; 
  dag = zeros(N,N);
  names = {'Burglary', 'Earthquake', 'Alarm', 'John calls', ['Mary ' ...
                      'calls']};
  B = 1; E = 2; A = 3; J = 4; M = 5;
  dag([B E], A) = 1;
  dag(A, [J M]) = 1;
  discrete_nodes = 1:N;
  node_sizes = 2*ones(1,N);
  bnet = mk_bnet(dag, node_sizes, 'discrete', discrete_nodes, 'names', ...
                 names);

  % Show the Bayes net
  draw_graph(bnet.dag, names);

  % Add the probability distributions
  bnet.CPD{B} = tabular_CPD(bnet, B, 'CPT', [0.999 0.001]);
  bnet.CPD{E} = tabular_CPD(bnet, E, 'CPT', [0.998 0.002]);
  bnet.CPD{A} = tabular_CPD(bnet, A, 'CPT', [0.999 0.06 0.71 0.05 ...
                      0.001 0.94 0.29 0.95]);
  bnet.CPD{J} = tabular_CPD(bnet, J, 'CPT', [0.95 0.10 0.05 0.90]);
  bnet.CPD{M} = tabular_CPD(bnet, M, 'CPT', [0.99 0.30 0.01 0.70]);

  % Create a junction-tree inference engine
  engine = jtree_inf_engine(bnet);

  % Create evidence that John calls
  evidence = cell(1,N);
  evidence{J} = 2;
  [engine,~] = enter_evidence(engine, evidence);

  % Get the marginal probability for a burglary
  marginal = marginal_nodes(engine, B);

  % Report
  fprintf('If John calls, probability of burglary = %2.2f\n', ...
          marginal.T(2));

  % Create evidence of a burglary
  evidence = cell(1,N);
  evidence{B} = 2;
  [engine,~] = enter_evidence(engine, evidence);

  % Get the marginal probability for John calling
  marginal = marginal_nodes(engine, J);

  % Report
  fprintf(['If there is a burglary, probability that John calls = ' ...
           '%2.2f\n'], marginal.T(2));
  

  % Create evidence of John & Mary calling, but no earthquake
  evidence = cell(1,N);
  evidence{J} = 2;
  evidence{M} = 2;
  evidence{E} = 1;
  [engine,~] = enter_evidence(engine, evidence);

  % Get the marginal probability for a burglary
  marginal = marginal_nodes(engine, B);

  % Report
  fprintf(['If John & Mary call, and there is no earthquake, probability ' ...
           'of burglary = %2.2f\n'], marginal.T(2));
  
end
