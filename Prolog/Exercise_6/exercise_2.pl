path(X, X, Y).

path(X, Y, s(Z)):- edge(X, A), path(A, Y, Z).
path(X, Y, Z) :- eps(X, A), path(A, Y, Z).

edge(a, b). 
edge(b, a). 
edge(c, d). 
edge(d, b).

eps(b, c).

% swipl -s /Users/hhk/Documents/GitHub/Code/Prolog/Exercise_1/exercise_1.pl