grammar Rule;

prog : express4Data+;
express4Data : attAndTypeName?  isList? DATE Style4generate? SEPARATOR             # printDate      //日期，默认是1990.1.1到现在之间取值
			 | attAndTypeName?  isList? ip Style4generate?	SEPARATOR             # printIP       //一定范围内的ip
			 | attAndTypeName?  isList? id Style4generate?   SEPARATOR              # printId        //id 可以是字母或者数字开头的串，必须有数字
			 | attAndTypeName?  isList? ENUM	Style4generate?   SEPARATOR          # printEnum  	 //枚举  
			 | attAndTypeName?  isList? relationship   Style4generate?  SEPARATOR     # printAttribute //有关联的数据
			 | attAndTypeName?  isList? limitedInteger Style4generate? SEPARATOR    # 	printInteger    //一定范围内的整数
			 | attAndTypeName?  isList? value4Attribute Style4generate? SEPARATOR    # printValue    //可填写取值的属性描述 例如sex（man,woman）    position(professor,lecturer,Assistant)  
			 | attAndTypeName?  isList? ASSOCIATION Style4generate? SEPARATOR    # printAssociationAtt    //关联关系处理
			
			;
attAndTypeName:classN attName ;
classN : Alphas* SEPARATOR;
attName :  Alphas* SEPARATOR;
isList : LIST number
       ;//默认值 的取值规则？？用户可以修改
id :  Alphas* '[' chooseD '^' number ']'       
	;
chooseD : '[' digit '-' digit ']'             
	;
relationship : className '.' attributeName '=' className '.' attributeName   
             ;
className : Alphas+
          ;
attributeName : Alphas+
              ;	 
limitedInteger : INTEGER  integerScope+        //number区分，（）(] integerScope+ 实数
				; 
integerScope : character4Start startNumber ',' endNumber character4End
			 ;
character4Start : '['|'(';
character4End : ']'|')';
startNumber : number;
endNumber : number;
ip : 'IP' range4Ip+    
   ; 
range4Ip : '['startIp ',' endIp ']'   
		 ;   
number4Ip : numberBelow255
		  ; 
startIp : number4Ip '.' number4Ip '.' number4Ip '.' number4Ip   
		;
endIp	: number4Ip '.' number4Ip '.' number4Ip '.' number4Ip 
		;
value4Attribute : attributeName '(' values ')'         
				;
values : value* Alphas*    
		;
value : Alphas* ',';
//数字的语法整理
zero           : Zero;
digit          : Zero | Number1To9 ;
numberBelow255 : digit | Number10To255;
number         : numberBelow255 | NumberAfter255 ;


		
DATE : 'DATE'  ;	//大写
ENUM : 'ENUM'  ;
LIST : 'LIST' ;
ASSOCIATION : 'ASSOCIATION' ;
SEPARATOR : '$' ;//考虑对于$的符号的使用
fragment 
RANDOM : 'RANDOM';//随机生成
fragment             
CYCLE : 'CYCLE';  //循环生成
fragment 
TRAVERSAL : 'TRAVERSAL';//遍历生成
fragment 
BOUNDARY : 'BOUNDARY';//边界值生成
fragment 
COMPLEX : 'COMPLEX';//多个属性之间需要复合的全覆盖产生
Style4generate : RANDOM|CYCLE|TRAVERSAL|BOUNDARY|COMPLEX;	//取值方式
INTEGER : 'INTEGER' ;


Alphas : [a-zA-Z_];
Zero : [0];
Number1To9 : [1-9] ;
Number10To255 : [1-9][0-9]
		      | [1][0-9][0-9]
		      | [2][0-4][0-9]
		      | [2][5][0-5]
		      ;
NumberAfter255 : [2][5][6-9]
               | [2][6-9][0-9]
               | [3-9][0-9][0-9]
			   | [1-9][0-9][0-9][0-9]+
			   ;
WS  : [ \t\n\r]+ -> skip ;
	