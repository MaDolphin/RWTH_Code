
% fun([],[]):-
%     write(1),nl.

% fun([[]|Xs],Result_List):-
%     write(2),nl,
%     fun(Xs,Result_List).

% fun([var(Element)|Xs],Result_List):-
%     write(3),nl,
%     fun(Xs,Result_List).

% fun([Element|Xs],Result_List):-
%     atomic(Element),
%     write(4),nl,
%     fun(Xs,Result_List).

% fun([[Element|Ys]|Xs],Result_List):- 
%     compound(Element),
%     write(5),nl,
%     Element =.. [H|Element_To_List],
%     reverse(Element_To_List,Element_To_List1),
%     append([H],Element_To_List1,List),
%     fun(List,R_List),
%     fun(Xs,Xs_List),
%     append([R_List],Xs_List,Result_List).

% reverseArgs(Init_Element,Result_List):- 
%     compound(Init_Element),
%     Init_Element =.. Init_List,
%     fun(Init_List,Result_List).

% % ----------------------------------
toList([],[]).

toList([[]|Xs],R2):- toList(Xs,R2).
toList([[Element|Ys]|Xs],Result_List):-
    compound(Element),
    Element =.. [Type|Parameters],
    reverse(Parameters,Parameters1),
    append([Type],Parameters1,List),
    append([List],Ys,New_Ys),
    toList([Element|New_Ys],R1),
    toList(Xs,R2),
    append([R1],R2,Result_List).

toList([Element|Xs],Head_List,Tail_List,Result_List):-
    var(Element),
    
    toList(Xs,Result_List).
toList([Element|Xs],Head_List,Tail_List,Result_List):-
    toList(Xs,Result_List),
    atomic(Element).
toList([Element|Xs],Head_List,Tail_List,Result_List):-
    toList(Xs,Result_List),
    compound(Element),
    Element =.. [Type|Parameters],
    reverse(Parameters,Parameters1),
    append([Type],Parameters1,List),
    append([List],Xs,New_Xs),


reverseArgs(Init_Element,Result):-
    compound(Init_Element),
    Init_Element =.. Init_List,
    toList(Init_List,Result_List).