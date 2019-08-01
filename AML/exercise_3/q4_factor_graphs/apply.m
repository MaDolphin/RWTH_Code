close all;
clc;
if ~exist('bnt','dir')
    url = 'https://github.com/bayesnet/bnt.git';
    cmd = ['git clone ' url];
    system(cmd, '-echo');
end
  addpath(genpath('./bnt'));
  
accident;
