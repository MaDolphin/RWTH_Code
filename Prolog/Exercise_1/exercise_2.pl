robot(wall_e).
robot(otto).
robot(c3po).
robot(r2d2). 
robot(android(looks_like_a_human)). 
robot(android(looks_like_a_machine)).

can_walk(c3po). 
can_drive(r2d2). 
can_drive(wall_e). 
same_story(c3po,r2d2). 
same_story(wall_e,otto).

can_move(X) :- can_walk(X).
can_move(X) :- can_drive(X).
same_story(X,Y):- robot(X), robot(Y), same_story(Y,X).