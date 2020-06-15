p(X,X,s(Y)) :- p(X,Y,a),q(s(X),Y).
p(0,s(0),a).
q(0,0).
q(s(X),s(Y)) :- q(X,Y).
