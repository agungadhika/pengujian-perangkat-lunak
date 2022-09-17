#!/usr/bin/python2

def daysInYear(y):
  if (y % 4 == 0 and y % 100 != 0) or y % 400 == 0:
    return 366
  else:
    return 365

def getYear(days):
  year = 1980
  days -= daysInYear(year)
  while days > 0:
    year += 1
    days -= daysInYear(year)
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
