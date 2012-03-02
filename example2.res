main:                                                           
        ENTER   vars(3)         temps(4)                        
        MOV     0               var(0,0)                        
        MOV     var(0,0)        var(0,1)                        
        INTADD  var(0,1)        var(0,0)        #0              
        MOV     #0              var(0,2)                        
        INTADD  var(0,2)        var(0,1)        #3              
        INTADD  #3              var(0,0)        #2              
        INTADD  #2              1               #1              
        MOV     #1              var(0,2)                        
        RETURN                                                  

