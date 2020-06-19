% a)

:- op(800,xfx,/\).

list_length([], 0).
list_length([_|Xs], L):- list_length(Xs,N), L is N+1.

/\([],[]).
/\([H1|T1],[H2|T2]):- 
    list_length([H1|T1],N1), list_length([H2|T2],N2), N1 =:= N2,
    0 is mod(H2,H1),
    /\(T1,T2).

% b)

:- op(400,yfx,^^).
:- use_module(library(arithmetic)).
:- arithmetic_function('^^'/2).

^^(T1,1,Z):- Z is T1 ^ 1.
^^(T1,T2,T3):- T1 >= 0, T2 >= 0, Y is T2 - 1, ^^(T1,Y,Z), T3 is Z ^ T1.

% c)

do_list(N, L) :- do_list1(N, [], L).
do_list1(0, L, L) :- !.
do_list1(N, R, L) :- N > 0, N1 is N-1, do_list1(N1, [N|R], L).

delete(Element,[Element|Tail],Tail).
delete(Element,[Head|Tail],[Head|Tail1]) :- delete(Element,Tail,Tail1).

find_powerSym(_,[],List,R):- member(R,List).
find_powerSym(X,[H|T],List,R):- X^^H =:= H^^X, find_powerSym(X,T,List,R).
find_powerSym(X,[H|T],List,R):- X^^H =\= H^^X, delete(H,List,List1), find_powerSym(X,T,List1,R).
powerSym(X,R):- do_list(X,List),find_powerSym(X,List,List,R).