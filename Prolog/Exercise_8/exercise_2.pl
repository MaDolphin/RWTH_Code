
% a)
exactlyOne([]).
exactlyOne([X|Xs]) :- \+ member(X, Xs), exactlyOne(Xs).

% b)
count(_, [], 0).
count(X, [X|T], N) :- !, count(X, T, N1), N is N1 + 1.
count(X, [_|T], N) :- count(X, T, N).

atMost(_,[]).
atMost(N,[X|Xs]):- count(X,[X|Xs],Num), Num =< N, atMost(N,Xs).