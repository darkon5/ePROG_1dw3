@echo off
title supah git script
color 0a
cls
n:
echo.
git add -A
git commit -a -m "auto-upload" && git push
pause
echo.
goto n
pause