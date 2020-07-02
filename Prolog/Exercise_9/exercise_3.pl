% a
rev(L,R):- revDiff(L, R-[]).
revDiff([], A - A).
revDiff([H|T], C - A):-revDiff(T, C - [H|A]).

% b
palindrome(L):- palindromeDiff(L).
palindromeDiff(L):- rev(L,L).
