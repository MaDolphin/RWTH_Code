function []=accident()

% Add the necessary paths for the Bayes Net Toolbox
addpath(genpathKPM(pwd));

% Define the number of labels for all variables
numLabelsW = 2;
numLabelsD = 2;
numLabelsS = 2;
numLabelsT = 2;
numLabelsJ = 2;

% Define the CPTs
CPT_W = [0.5 0.5];
CPT_D = [0.6 0.4];
CPT_SW = [0.7 0.3;0.1 0.9];
CPT_JS = [0.5 0.5;0.1 0.9];
CPT_TDS = zeros(2,2,2);
CPT_TDS(1,1,1) = 0.9;
CPT_TDS(2,1,1) = 0.5;
CPT_TDS(1,2,1) = 0.5;
CPT_TDS(2,2,1) = 0.1;
CPT_TDS(1,1,2) = 0.1;
CPT_TDS(2,1,2) = 0.5;
CPT_TDS(1,2,2) = 0.5;
CPT_TDS(2,2,2) = 0.9;

% Set the number of nodes and factors
numNodes = 5;
numFactors = 5;

% Define the matrix containing the graph (nodes of the graph)
myGraph = zeros(numNodes, numFactors);

% Define the hidden variables
W = 1;
D = 2;
S = 3;
T = 4;

% W = 'winter';
% D = 'Drunk';
% S = 'slick_road';
% T = 'tom';
% J = 'jerry';

% Define the observed variables
J = 5;

% Define the factor nodes
factorA = 1;
factorB = 2;
factorC = 3;
factorD = 4;
factorE = 5;

% Create types of factors
factors = cell(1,numFactors);

% Define the factors (Conditional Probability Tables)
factors{factorA} = tabular_kernel(numLabelsW, CPT_W);
factors{factorB} = tabular_kernel(numLabelsD, CPT_D);
factors{factorC} = tabular_kernel([numLabelsS numLabelsW], CPT_SW);
factors{factorD} = tabular_kernel([numLabelsJ numLabelsS], CPT_JS);
factors{factorE} = tabular_kernel([numLabelsT numLabelsD numLabelsS], CPT_TDS);

% Define the connection of the hidden variables to the factor nodes
myGraph(W,factorA) = 1;
myGraph(W,factorC) = 1;
myGraph(D,factorB) = 1;
myGraph(D,factorE) = 1;
myGraph(S,factorC) = 1;
myGraph(S,factorD) = 1;
myGraph(S,factorE) = 1;
myGraph(T,factorE) = 1;
myGraph(J,factorD) = 1;

% Define the size of the nodes
sizeNodes = 2*ones(1,numNodes);

% Define the factor graph
myFactorGraph = mk_fgraph(myGraph, sizeNodes, factors);
draw_graph(myGraph);

% Create the belief propagation engine
myEngine = belprop_fg_inf_engine(myFactorGraph);


% Enter evidence
myEvidence = cell(1,numNodes);
myEvidence{J} = 1;
myEngine = enter_evidence(myEngine, myEvidence);

% Compute the marginals for all the nodes
resultNodes = cell(1,numNodes);
for i=1:numNodes
	resultNodes{i} = marginal_nodes(myEngine, i);
	resultNodes{i}.T
end

