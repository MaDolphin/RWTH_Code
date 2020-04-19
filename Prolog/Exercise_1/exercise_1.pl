evolvedFrom(cat, miacis).
evolvedFrom(hyena, miacis).
evolvedFrom(weasel, miacis).
evolvedFrom(cynodictis, miacis).

evolvedFrom(raccoon, cynodictis).
evolvedFrom(bear, cynodictis).
evolvedFrom(tomarctus, cynodictis).

evolvedFrom(fox, tomarctus).
evolvedFrom(wolf, tomarctus).

% Q(a)
evolvedFromSameCreature(A,B) :- evolvedFrom(A,C), evolvedFrom(B,C).

% Q(b)
descendsFrom(A,C) :- evolvedFrom(A,C).
descendsFrom(A,C) :- evolvedFrom(A,B), descendsFrom(B,C). 

% Q(c) Result
/*

?- evolvedFrom(X,tomarctus).
X = fox ;
X = wolf.

?- evolvedFromSameCreature(raccoon,X).
X = raccoon ;
X = bear ;
X = tomarctus.

?- descendsFrom(wolf,X).
X = tomarctus ;
X = cynodictis ;
X = miacis.

*/
