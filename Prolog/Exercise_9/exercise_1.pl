
% % ----------------------------------
% toList([],[]).

% toList([[]|Xs],R2):- toList(Xs,R2).
% toList([[Element|Ys]|Xs],Result_List):-
%     compound(Element),
%     Element =.. [Type|Parameters],
%     reverse(Parameters,Parameters1),
%     append([Type],Parameters1,List),
%     append([List],Ys,New_Ys),
%     toList([Element|New_Ys],R1),
%     toList(Xs,R2),
%     append([R1],R2,Result_List).

% toList([Element|Xs],Head_List,Tail_List,Result_List):-
%     var(Element),
    
%     toList(Xs,Result_List).
% toList([Element|Xs],Head_List,Tail_List,Result_List):-
%     toList(Xs,Result_List),
%     atomic(Element).
% toList([Element|Xs],Head_List,Tail_List,Result_List):-
%     toList(Xs,Result_List),
%     compound(Element),
%     Element =.. [Type|Parameters],
%     reverse(Parameters,Parameters1),
%     append([Type],Parameters1,List),
%     append([List],Xs,New_Xs),


% reverseArgs(Init_Element,Result):-
%     compound(Init_Element),
%     Init_Element =.. Init_List,
%     toList(Init_List,Result_List).
% reverseArgs(Element,Result):- 
%     reverseArgs(Element,Result).

reverseArgs(Element,Result):-
    compound(Element),
    Element =.. [Type|Parameters],
    reverseArgsList(Type,Parameters,Result).

reverseArgs(Element,Result):-
    var(Element),
    writeln(2-Element),
    true.

reverseArgs(Element,Result):-
    atomic(Element),
    writeln(3-Element),
    true.

reverseArgsList(Type,[],Result):- 
    writeln('['),
    writeln(1-Type).

reverseArgsList(Type,[T|Ts],Result):-
    % writeln(4-[T|Ts]),
    reverseArgsList(Type,Ts,XTR),
    reverseArgs(T,XR).
    % append([T],XR,TempList),
    

% p(a, q(f(Z,Y),Y,b), X)
% [p,a,[q,[f,Z,Y],Y,b],X]


trans([],[]).
trans([[]|Xs],XsR):- writeln(1-Xs),trans(Xs,XsR).
trans([[Y|Ys]|Xs],Result):- trans([Y|Ys],XR), trans(Xs,XsR).
trans([X|Xs],Result):- trans(Xs,Result).


test([],T,[]):- reverse(T,T_R), Element =.. T_R.
test([[Type|Ys]|Xs],T,R):- test(Xs,T,R),append([Type],[],T1),test(Ys,T1,R),append([]).
test([X|Xs],T,R):- test(Xs,T1,R),append([X],T,T1).











% [p,X,[q,b,Y,[f,Y,Z]],a]