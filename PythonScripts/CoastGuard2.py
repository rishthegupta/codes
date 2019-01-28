s_ip = input()
x,y,z = map(int, s_ip.split(","))


boat_coor=[]
for i in range(z):   
    s_ip = input()
    boat_coor.append(tuple(map(int, s_ip.split(","))))

def min_dist(bpt, p, q):
    from_this_boat = abs(bpt[0]-p) + abs(bpt[1]-q)
    return from_this_boat

def not_uncontrollable(p, q):
    min_dis_boat = []
    for boat_point_index in range(z):
        min_dis_boat.append(min_dist(boat_coor[boat_point_index], p, q))
    return len(min_dis_boat) != len(set(min_dis_boat))

n = 0
ans = []
for i in range(x):
    for j in range(y):
        if not_uncontrollable(i, j):
            n += 1
            t = (i,j)
            ans.append(t)
        else:
            pass

print(n)
