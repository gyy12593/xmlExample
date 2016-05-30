grammar Rule4Containment;

prog : description4instances;
description4instances : example4class+
			;
example4class : className CONTAINS number4class className '$'
			  ;
className : ALPHAS*;
number4class : DIGIT|INT;

ALPHAS : [a-zA-Z_];
CONTAINS : 'contains';
DIGIT : [0-9] ;
INT : [1-9][0-9]+;
WS  :   [ \t\n\r]+ -> skip ;