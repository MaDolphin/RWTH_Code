expression(S):- expression(S,[]).
expression(S,R):- number(S,R).
expression(S,R):- variable(S,R).
expression(S,R):- 
    bracketL(S,S1),expression(S1,S2),bracketR(S2,S3),
    operator(S3,S4),
    bracketL(S4,S5),expression(S5,S6),bracketR(S6,R).
number(N,R):- digit(N,R).
number(N,R):- digit(N,N1), number(N1,R).
digit([1|R],R).
digit([2|R],R).
digit([3|R],R).
bracketL(['('|R],R).
bracketR([')'|R],R).
operator(['+'|R],R).
operator(['-'|R],R).
operator(['*'|R],R).
variable(['X'|R],R).
variable(['Y'|R],R).
variable(['Z'|R],R).