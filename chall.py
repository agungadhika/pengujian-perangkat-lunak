#!/usr/bin/python2
#Source : https://leancrew.com/all-this/2009/01/leap-year-and-the-zune/
def isLeapYear(y):
  leap = False
  if y % 4  == 0:
    leap = True;
    if y % 100 == 0:
      leap = True if y % 400 == 0 else False
  return leap

def getYear(days):
  year = 1980
  while days > 365:
    if isLeapYear(year):
      if days > 366: #karena operator nya salah harusnya >= 
        days -= 366 #ini tidak berjalan
        year += 1 #ini tidak berjalan
    else:
      days -=365
      year += 1
  return year

# We'll test on:
# Jan 01, 1980 
# Dec 30, 1980
# Jan 01, 1981 
# Dec 31, 1981
# Jan 01, 1982
# Jan 01, 2009
# Dec 31, 1980
# Dec 31, 2008
testDays = [1, 365, 366+1, 366+365, 366+365+1, 10593+1, 366, 10593]
for d in testDays:
  print "%5d: %4d" %(d, getYear(d))
