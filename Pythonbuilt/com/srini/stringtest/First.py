'''
Created on 08-Feb-2015

@author: srinivasan
'''
import string
print string.ascii_letters

# format
sub = "python string!"
s = 'hello {0}'
print s.format(sub)

# Calculating the min and max from dictionary
prices = {
'ACME': 45.23,
'AAPL': 612.78,
'IBM': 205.55,
'HPQ': 37.20,
'FB': 10.75
}
print min(zip(prices.values(), prices.keys()))
print max(zip(prices.values(), prices.keys()))
# soreted based on values
print sorted(zip(prices.values(), prices.keys()))
print 'asdasd'
