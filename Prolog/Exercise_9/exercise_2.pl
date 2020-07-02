q(24).
q(6).
p(X) :- q(X).

findPred(Element,Q):- 
    Element =.. [Type|Parameters],
    length(Parameters, Int),
    functor(Q,Type,Int).

:- dynamic count/2.
init([]).
init([X|Xs]):-
    init(Xs),
    assertz(count(X,0)),
    count(X,N),
    retract(count(X,_)),!,
    N1 is N + 1,
    assertz(count(X,N1)).
inc(List):- init(List), retract(count(_,0)),!.

solveH(true,[]):-!.
solveH(Query,List):-
    clause(Query,Body),
    solveH(Body,NewList),
    findPred(Query,Query1),
    findPred(Body,Body1),
    clause(Query1,Body1),
    unifiable(Query,Query1,_),
    append([Query1:-Body1],NewList,List).

solve(Query):-
    solveH(Query,List),inc(List).
