grammar Rule;

prog : express4Data+;
express4Data : attAndTypeName?  DATE Style4generate? '$'             # printDate      //日期，默认是1990.1.1到现在之间取值
			| attAndTypeName?  ip Style4generate?	'$'              # printIP       //一定范围内的ip
			| attAndTypeName?  id Style4generate?   '$'              # printId        //id 可以是字母或者数字开头的串，必须有数字
			| attAndTypeName?  ENUM	Style4generate?   '$'          # printEnum  	 //枚举  
			| attAndTypeName?  relationship Style4generate?  '$'     # printAttribute //关联关系
			| attAndTypeName?  limitedInteger Style4generate? '$'    #printInteger    //一定范围内的整数
			| attAndTypeName?  value4Attribute Style4generate? '$'    #printValue    //可填写取值的属性描述 例如sex（man,woman）    position(professor,lecturer,Assistant)
			;
attAndTypeName:attName typeName;
attName :  ALPHAS* '$';
typeName :  ALPHAS* '$';
id :  ALPHAS* '[' chooseD '^' DIGIT ']'        #process4Id1//生成的ID的数字位有0到9位
	| ALPHAS* '[' chooseD '^' INT ']'          #process4Id2//生成的ID的数字位有10位以上
	;
chooseD : '[' DIGIT '-' DIGIT ']'              #ChooseDigit
	;
relationship : className '.' attributeName '=' className '.' attributeName   #process4relationship;
className : ALPHAS+;
attributeName : ALPHAS+;	 
limitedInteger : INTEGER  number4Integer number4Integer         #process4limitedInteger1
				;
number4Integer : DIGIT | INT; 
ip : 'IP' range4Ip+    #process4Ip; //'IP' [startIp,endIp]+
range4Ip : '['startIp ',' endIp ']'   #process4Range4Ip;   
number4Ip : DIGIT | INT; 
startIp : number4Ip '.' number4Ip '.' number4Ip '.' number4Ip   
		;
endIp	: number4Ip '.' number4Ip '.' number4Ip '.' number4Ip 
		;
value4Attribute : attributeName '(' values ')'         #process4value4Attribute
				;
values : value* ALPHAS*     #process4values
		;
value : ALPHAS* ',';
		
DATE : 'DATE'  ;	//大写
ENUM : 'ENUM'  ;
fragment 
Random : 'RANDOM';//随机生成
fragment             
Cycle : 'CYCLE';  //循环生成
fragment 
Traversal : 'TRAVERSAL';//遍历生成
fragment 
Boundary : 'BOUNDARY';//边界值生成
fragment 
Complex : 'COMPLEX';//多个属性之间需要复合的全覆盖产生
Style4generate : Random|Cycle|Traversal|Boundary|Complex;	//枚举类型取值方式
INTEGER : 'INTEGER' ;

ALPHAS : [a-zA-Z_];
DIGIT : [0-9] ;
INT : [1-9][0-9]+;
WS  :   [ \t\n\r]+ -> skip ;
	