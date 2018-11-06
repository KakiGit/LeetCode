import re

nums = {
    'Karl': '123',
    'Bob': '123567',
    'Alice': '1234568',
    'Peter': '125',
    'John': '123'
}
## if two people can have the same number
keys = list(nums.keys())
regs = [re.compile(nums[x]) for x in nums]
indicator = 0
names = []
for name, num in nums.items():
    i=-1
    for reg in regs:
        i+=1
        result = reg.match(num)
        if(result!=None):
            if(num!=result.group()):
                if(name not in names):
                    indicator+=1
                    names.append(name)
            else:
                if(name!=keys[i]):
                    if(name not in names):
                        indicator+=1
                        names.append(name)            

if(names!=[]):
    print(names,'lead to inconsistency')
    print("Number of inconsistency:",indicator)

