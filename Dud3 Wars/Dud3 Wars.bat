@echo off
color f0
set p=5
set e=5
title Dud3 Wars
:start
if %p%==0 goto pdie
if %p%==-1 goto pdie
if %p%==-2 goto pdie
if %p%==-3 goto pdie
if %e%==0 goto edie
if %e%==-1 goto edie
if %e%==-2 goto edie
if %e%==-3 goto edie
SET /a _rand=(%RANDOM%*2/32768)
mode con:cols=32 lines=14
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\/      +/I\
echo.        / \        / \ 
echo.   
echo.     
echo................................
echo   A for attack D for defend
echo.
echo        Your health: %p%
echo       Enemy health: %e%
set /p udefine=
if %udefine%==a goto a
if %udefine%==d goto d
if %udefine%==e goto eatk
:a
if %_rand%==1 goto pmiss
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\/      +/I\
echo.        / \        / \ 
echo.   
echo.      
echo................................
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.           O        O
echo.          /I\/    +/I\
echo.          / \      / \ 
echo.   
echo.        
echo................................
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.             O      O
echo.            /I\/  +/I\
echo.            / \    / \ 
echo.   
echo.        
echo................................
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.              O     O
echo.             /I\/ +/I\
echo.             / \   / \ 
echo.   
echo.       
echo................................
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.              O     O
echo.             /I\--+/I\
echo.             / \   / \ 
echo.   
echo.        
echo................................
ping localhost -n 2 >nul
set /a e=%e%-2
goto setedrop
if %edrop%==1 goto endrop
:randinp
if %edrop%==1 goto endrop
cls
echo           Dud3 Wars
echo................................
echo.              O     O
echo.             /I\/ +/I\
echo.             / \   / \ 
echo.   
echo.        
echo................................
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.            O       O
echo.           /I\/   +/I\
echo.           / \     / \ 
echo.   
echo.       
echo................................
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.          O         O
echo.         /I\/     +/I\
echo.         / \       / \ 
echo.   
echo.       
echo................................
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\/      +/I\
echo.        / \        / \ 
echo.   
echo.        
echo................................
echo        You dealt 2 dmg!
pause>null
cls
goto eatk
:pmiss
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\/      +/I\
echo.        / \        / \ 
echo.   
echo.     
echo................................
echo           You missed!
pause>null
cls
goto eatk
cls
:pmiss2
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\/      +/I\
echo.        / \        / \ 
echo.   
echo.     
echo................................
echo           You missed!
pause>null
cls
goto start
:emiss
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\/      +/I\
echo.        / \        / \ 
echo.   
echo.     
echo................................
echo          Enemy Missed!
pause>null
cls
goto start
:d
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\\      +/I\
echo.        / \        / \ 
echo.   
echo.     
echo................................
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\\    +  /I\
echo.        / \        / \ 
echo.   
echo.     
echo................................
echo          Enemy's turn
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\\  +    /I\
echo.        / \        / \ 
echo.   
echo.     
echo................................
echo          Enemy's turn
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\\+      /I\
echo.        / \        / \ 
echo.   
echo.     
echo................................
echo          Enemy's turn
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.        O           O
echo.       /I\\+       /I\
echo.       / \         / \ 
echo.   
echo.     
echo................................
echo          Enemy's turn
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\\+      /I\
echo.        / \        / \ 
echo.   
echo.     
echo................................
echo          Enemy's turn
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\\  +    /I\
echo.        / \        / \ 
echo.   
echo.     
echo................................
echo          Enemy's turn
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\\    +  /I\
echo.        / \        / \ 
echo.   
echo.     
echo................................
echo          Enemy's turn
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\\      +/I\
echo.        / \        / \ 
echo.   
echo.     
echo................................
echo          Enemy's turn
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\/      +/I\
echo.        / \        / \ 
echo.   
echo.     
echo................................
echo          Enemy's turn
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O         *O*
echo.        /I\/      +/I\
echo.        / \        / \ 
echo.   
echo.     
echo................................
echo          Enemy's turn
set /a p=%p%-1
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\/      +/I\
echo.        / \        / \ 
echo.   
echo.     
echo................................
echo         Enemy is Dazed!
pause>null
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\/      +/I\
echo.        / \        / \ 
echo.   
echo.     
echo................................
echo     You get a free attack!
pause>null
goto getrand
:blockrand
if %_rand%==1 goto pmiss2
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\/      +/I\
echo.        / \        / \ 
echo.   
echo.      
echo................................
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.           O        O
echo.          /I\/    +/I\
echo.          / \      / \ 
echo.   
echo.        
echo................................
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.             O      O
echo.            /I\/  +/I\
echo.            / \    / \ 
echo.   
echo.        
echo................................
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.              O     O
echo.             /I\/ +/I\
echo.             / \   / \ 
echo.   
echo.       
echo................................
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.              O     O
echo.             /I\--+/I\
echo.             / \   / \ 
echo.   
echo.        
echo................................
ping localhost -n 2 >nul
set /a e=%e%-2
cls
echo           Dud3 Wars
echo................................
echo.              O     O
echo.             /I\/ +/I\
echo.             / \   / \ 
echo.   
echo.        
echo................................
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.            O       O
echo.           /I\/   +/I\
echo.           / \     / \ 
echo.   
echo.       
echo................................
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.          O         O
echo.         /I\/     +/I\
echo.         / \       / \ 
echo.   
echo.       
echo................................
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\/      +/I\
echo.        / \        / \ 
echo.   
echo.        
echo................................
echo        You dealt 2 dmg!
pause>null
cls
goto start
cls
:eatk
SET /a emiss=(%RANDOM%*2/32768)
if %emiss%==1 goto emiss
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\/      +/I\
echo.        / \        / \ 
echo.   
echo.        
echo................................
echo          Enemy's turn
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\/      +\I\
echo.        / \        / \ 
echo.   
echo.        
echo................................
echo          Enemy's turn
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\/    +  /I\
echo.        / \        / \ 
echo.   
echo.        
echo................................
echo          Enemy's turn
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\/  +    /I\
echo.        / \        / \ 
echo.   
echo.        
echo................................
echo          Enemy's turn
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\/+      /I\
echo.        / \        / \ 
echo.   
echo.       
echo................................
echo          Enemy's turn
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.        O           O
echo.       /I\/+       /I\
echo.       / \         / \ 
echo.   
echo.       
echo................................
echo          Enemy's turn
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\/+      /I\
echo.        / \        / \ 
echo.   
echo.       
echo................................
echo          Enemy's turn
set /a p=%p%-2
ping localhost -n 2 >nul
SET /a randdrop=(%RANDOM%*3/32768)
if %randdrop%==1 goto pdrop
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\/  +    /I\
echo.        / \        / \ 
echo.   
echo.     
echo................................
echo          Enemy's turn
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\/    +  /I\
echo.        / \        / \ 
echo.   
echo.     
echo................................
echo          Enemy's turn
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\/      +/I\
echo.        / \        / \ 
echo.   
echo.     
echo................................
echo          Enemy's turn
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\/      +/I\
echo.        / \        / \ 
echo.   
echo.    
echo................................
echo        You took 2 dmg!
pause>null
cls
goto start
cls
:pdrop
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.       //I\+       /I\
echo.        / \        / \ 
echo.   
echo.       
echo................................
echo          Enemy's turn
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\+       /I\
echo.     /  / \        / \ 
echo.   
echo.       
echo................................
echo          Enemy's turn
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\  +     /I\
echo.   _    / \        / \ 
echo.   
echo.       
echo................................
echo          Enemy's turn
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\     +  /I\
echo.   _    / \        / \ 
echo.   
echo.       
echo................................
echo          Enemy's turn
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\       +/I\
echo.   _    / \        / \ 
echo.   
echo.        
echo................................
echo          Enemy's turn
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\       +/I\
echo.   _    / \        / \ 
echo.   
echo.       
echo................................
echo         You took 2 dmg!
pause>null
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\       +/I\
echo.   _    / \        / \ 
echo.   
echo.      
echo................................
echo    You dropped your weapon!
pause>null
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\       +/I\
echo.   _    / \        / \ 
echo.   
echo.        
echo................................
echo         Retrieve it!
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.       O            O
echo.      /I\         +/I\
echo.   _  / \          / \ 
echo.   
echo.        
echo................................
echo         Retrieve it!
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.       O            O
echo.      /I\         +/I\
echo.   _  / \          / \ 
echo.   
echo.        
echo................................
echo         Retrieve it!
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.                    O
echo.      O           +/I\
echo.   _ /I\           / \ 
echo.     / \
echo.     
echo................................
echo         Retrieve it!
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.                    O
echo.      O           +/I\
echo.    \/I\           / \ 
echo.     / \
echo.      
echo................................
echo         Retrieve it!
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.                    O
echo.      O           +/I\
echo.     /I\/          / \ 
echo.     / \
echo.       
echo................................
echo         Retrieve it!
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.       O            O
echo.      /I\/        +/I\
echo.      / \          / \ 
echo.   
echo.       
echo................................
echo         Retrieve it!
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\/      +/I\
echo.        / \        / \ 
echo. 
echo.      
echo................................
echo        Got Your Sword!
pause>null
cls
goto start
cls
:endrop
cls
echo           Dud3 Wars
echo................................
echo.              O     O+
echo.             /I\/  /I\
echo.             / \   / \ 
echo.   
echo.        
echo................................
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.            O       O  
echo.           /I\/    /I\ +
echo.           / \     / \ 
echo.   
echo.        
echo................................
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.          O         O  
echo.         /I\/      /I\   
echo.         / \       / \    +
echo.   
echo.        
echo................................
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\/       /I\
echo.        / \        / \    +
echo.   
echo.    
echo................................
echo   Enemy dropped his weapon!
pause>null
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\/       /I\
echo.        / \        / \    +
echo.   
echo.    
echo................................
echo      He Must Retrieve it!
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O            O
echo.        /I\/         /I\
echo.        / \          / \  +
echo.   
echo.    
echo................................
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O              O
echo.        /I\/           /I\
echo.        / \            / \+
echo.   
echo.    
echo................................
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O              
echo.        /I\/            O
echo.        / \            /I\+
echo.                       / \
echo.    
echo................................
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O              
echo.        /I\/            O
echo.        / \           +/I\
echo.                       / \
echo.    
echo................................
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O              O
echo.        /I\/          +/I\
echo.        / \            / \
echo.   
echo.    
echo................................
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O            O
echo.        /I\/        +/I\
echo.        / \          / \  
echo.   
echo.    
echo................................
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\/      +/I\
echo.        / \        / \    
echo.   
echo.    
echo................................
ping localhost -n 2 >nul
cls
goto start
cls
:getrand
SET /a _rand=(%RANDOM%*2/32768)
goto blockrand
cls
:setedrop
SET /a edrop=(%RANDOM%*3/32768)
goto randinp
:pdie
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\/      +/I\
echo.        / \        / \ 
echo.   
echo.     
echo................................
echo         You died!
pause>null
cls
echo           Dud3 Wars
echo................................
echo.                    O
echo.                  +/I\
echo.        / \        / \ 
echo.   
echo.     
echo................................
echo         You died!
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.                    O
echo.         O        +/I\
echo.        / \        / \ 
echo.   
echo.     
echo................................
echo         You died!
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        !!!       +/I\
echo.       /   \       / \ 
echo.   
echo.     
echo................................
echo         You died!
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.                    O
echo.         O        +/I\
echo.        / \        / \ 
echo.   
echo.     
echo................................
echo         You died!
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.                    O
echo.                  +/I\
echo.        / \        / \ 
echo.   
echo.     
echo................................
echo         You died!
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.                    O
echo.                  +/I\
echo.                   / \ 
echo.   
echo.     
echo................................
echo         You died!
ping localhost -n 2 >nul
cls
goto end
:edie
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\/      +/I\
echo.        / \        / \ 
echo.   
echo.     
echo................................
echo         Enemy died!
pause>null
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\/      +/I\
echo.        / \        / \ 
echo.   
echo.     
echo................................
echo         Enemy died!
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O         
echo.        /I\/      
echo.        / \        / \ 
echo.   
echo.     
echo................................
echo         Enemy died!
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O         
echo.        /I\/        O
echo.        / \        / \ 
echo.   
echo.     
echo................................
echo         Enemy died!
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O          O
echo.        /I\/       !!!
echo.        / \       /   \ 
echo.   
echo.     
echo................................
echo         Enemy died!
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O         
echo.        /I\/        O
echo.        / \        / \ 
echo.   
echo.     
echo................................
echo         Enemy died!
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O         
echo.        /I\/      
echo.        / \        / \ 
echo.   
echo.     
echo................................
echo         Enemy died!
ping localhost -n 2 >nul
cls
echo           Dud3 Wars
echo................................
echo.         O         
echo.        /I\/      
echo.        / \        
echo.   
echo.     
echo................................
echo         Enemy died!
ping localhost -n 2 >nul
cls
goto win
:win
set /a score=%p%-%e%
cls
echo................................
echo.  \   /   ____          
echo.   \ /   !    !  !    !
echo.    !    !    !  !    !
echo.    !    !____!  !____!
echo.                .____
echo. \        /  O  !    !
echo.  \  /\  /   !  !    !
echo.   \/  \/    !  !    !
echo.     You scored %score%   
echo................................
pause>null
cls
:end
cls
echo           Dud3 Wars
echo................................
echo.              
echo.              
echo.            
echo.          Game Over  
echo.              
echo.              
echo................................
pause>null
cls