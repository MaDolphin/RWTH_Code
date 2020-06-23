
edge(_,_).

list_length([], 0).
list_length([_|Xs], L):- list_length(Xs,N), L is N+1.

my_write([]):-!.
my_write([X|Xs]):- write(X),write('.'),nl,my_write(Xs).

remove_duplicates([],[]).
remove_duplicates([H|T], List) :- member(H, T), remove_duplicates(T, List).
remove_duplicates([H|T], [H|T1]) :- \+ member(H, T), remove_duplicates(T, T1).

tc(Inputfile,Outputfile):-
    see(Inputfile),tell(Outputfile),
    transform([]),
    seen,told.

transform(List) :- 
    read(Stream),tran_to_list(Stream,List).

tran_to_list(end_of_file,List):- 
    proc(List,List,[],List).

tran_to_list(Stream,List):- 
    append([Stream],List,List1),
    transform(List1).

proc([],_,[],Result_list):-
    my_write(Result_list),halt.

proc([edge(X,Y)|Old_list],[edge(Y,Z)|T],New_list,Result_list):-
    append([edge(X,Z)],Result_list,Result_list1),
    remove_duplicates(Result_list1,Result_list2),
    append([edge(X,Z)],New_list,New_list1),
    remove_duplicates(New_list1,New_list2),
    proc([edge(X,Y)|Old_list],T,New_list2,Result_list2).

proc([edge(X,Y)|Old_list],[_|T],New_list,Result_list):-
    proc([edge(X,Y)|Old_list],T,New_list,Result_list).

proc([_|T],[],New_list,Result_list):-
    append(T,New_list,New_list1),
    proc(New_list1,Result_list,[],Result_list).