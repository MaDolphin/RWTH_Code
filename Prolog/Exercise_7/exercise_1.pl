% a) Implement a predicate lists_not_equal/2 which compares two lists of our form. The predicate should evaluate to true iﬀ the list given in the ﬁrst argument is not identical to the list given in the second argument.

lists_equal([], []).
lists_equal([H1|T1], [H2|T2]):- H1 = H2 , lists_equal(T1, T2).
lists_not_equal(X, Y) :- \+ lists_equal(X, Y).

% b) Implement a predicate not_member/2 for lists of our form which yields true iﬀ the ﬁrst argument does not appear in the list given in the second argument.

not_member(_, []).
not_member(X, [H|T]) :- X \= H, not_member(X, T).

% c) Implement a precicate remove_duplicates/2 where the list in the second argument results from removing all duplicates from the list given in the ﬁrst argument, i.e., iﬀ the second list contains all elements that appear in the ﬁrst list (in the same order), but for each element one removes all of its occurrences except the last one. For example, the query remove_duplicates([[],[[]],[]],XS) returns the only answer XS = [[[]], []].

remove_duplicates([],[]).
remove_duplicates([H|T], List) :- member(H, T), remove_duplicates(T, List).
remove_duplicates([H|T], [H|T1]) :- not_member(H, T), remove_duplicates(T, T1).

% d) The lists in this and in the following subexercises are meant to represent sets, i.e., unordered lists without duplicates. Implement a predicate setify/2 where the list in the second argument results from removing all duplicates from the list given in the ﬁrst argument, regarding not only the top level of the list, but also all of its sublists recursively.


setify([H|T], Set):- remove_duplicates([H|T],List), setify(List,Set).



% e) Implement a predicate insert/3 which yields the answer true iﬀ the third argument is a list that arises from inserting the ﬁrst argument anywhere in the list given in the second argument.

app([],Ys,Ys).
app([X|Xs],Ys,[X|Zs]) :- app(Xs,Ys,Zs).

add_elem_in_list(E, L, R) :- app([E], L, R).

insert(X,Y,Xs):- add_elem_in_list(X, [], R), app(R,Y,Xs).
insert(X,Y,Xs):- add_elem_in_list(X, [], R), app(Y,R,Xs).

% f) Implement a predicate sublist/2 which has two lists as arguments and yields the answer true iﬀ whenever an element occurs n times in the ﬁrst list, then it also occurs at least n times in the second list.

% sublist(S,R) :- insert(S,_,R).
% sublist(S,Z):- insert(_,S,X), append(X,_,Z).

suffix(X,Y):- insert(_,X,Y). 
prefix(X,Y):- insert(X,_,Y).
sublist(X,Y):- suffix(X,Z),prefix(Z,Y).


% g) Implement a predicate shrink/2 which removes all occurrences of the empty set ([]) from the list in the ﬁrst argument to obtain the list in the second argument.

delMember(_, [], []).
delMember(X, [X|Xs], Y) :- !, delMember(X, Xs, Y).
delMember(X, [T|Xs], Y) :- !, delMember(X, Xs, Y2), append([T], Y2, Y).




















