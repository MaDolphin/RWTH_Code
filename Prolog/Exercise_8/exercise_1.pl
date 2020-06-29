if_then_else(Cond,Then,_):- Cond,!,Then.
if_then_else(_,_,Else):- Else.
and(X, Y):- if_then_else(X,if_then_else(Y,true,false),false).