:- use_module(library(sldnfdraw)).

% :- if(current_predicate(use_rendering/1)).
% :- use_rendering(sldnf).
% :- endif.

:- sldnf.

:- begin_program.

if_then_else(Cond,Then,_):- Cond, Then.
if_then_else(_,_,Else):- Else.

and(X, Y):- if_then_else(X,if_then_else(Y,true,false),false).

% f(X,0):- X<3, !. 
% f(X,1):- 3=<X, X<6, !. 
% f(X,2):- 6=<X.

:-end_program.

:-begin_query.

and(true,false).
% f(1,Y),0<Y.

:-end_query.

