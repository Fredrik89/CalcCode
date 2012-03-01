p:                                                              
        ENTER   vars(3)         temps(10)                       
        JMPT    var(0,1)        end                             
        JMPF    arg(2)          end                             
        JMP     end                                             
        INTADD  2               3               #0              
        INTSUB  2               3               #1              
        INTMUL  2               3               #2              
        INTDIV  2               3               #3              
        INTEQ   2               3               #4              
        INTNE   2               3               #5              
        INTLT   2               3               #6              
        INTLE   2               3               #7              
        INTGT   2               3               #8              
        INTGE   2               3               #9              
end:                                                            
        CALL    p2              levels(1)                       
        RETURN                                                  

