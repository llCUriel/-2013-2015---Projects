from tkinter import *
import math
import random
import threading
import time
import math
import pyvisgraph as vg

nFigures = 0
pointsFile = 'puntos'
coloursFile = 'colores'
nedges = []
points = []

#Punto inicial
x1 = 400
y1 = 550
#Punto final
x2 = 1200
y2 = 87

def obtainPointsList(name):
    npoints =[]
    points = open(name).readlines()
    for i in points:
        iList = list(i.rstrip().split(','))
        newList = []
        for j in iList:
            newList.append(int(j))
        npoints.append(newList)
    return npoints

def obtainRandomFigure(initialX, initialY):
    finalFigure = []
    points = obtainPointsList(pointsFile)
    nFigure = random.randrange(len(points))
    temporalFigure = points[nFigure]
    cnt = 0
    newPoint = 0
    nedges.append(len(temporalFigure)/2)
    for i in temporalFigure:
        if cnt % 2 == 0:
            newPoint = i+initialX
        else:
            newPoint = i+initialY
        finalFigure.append(newPoint)
        cnt+=1
    return finalFigure

def obtainRandomColour():
     coloursList = open(coloursFile).readlines()
     return str(coloursList[random.randrange(len(coloursList))]).rstrip()

def obtainRandomFigures():
    Figures = []
    s = 80
    p = 10
    m = 60
    ssize = 60
    for j in range(0,120*9,s):
        for k in range(0,120*5,s):
            x = s + p + j
            y = p + k
            points = obtainRandomFigure(x,y)
            Figures.append(points)
    return Figures

def obtainXListAndYList(Figures):
    cnt = 0
    pointsX = []
    pointsY = []
    for figure in Figures:
        for value in figure:
            if cnt % 2 == 0:
                pointsX.append(value)
            else:
                pointsY.append(value)
            cnt+=1
    return pointsX, pointsY

def drawRandomFigures(c,Figures):
    for i in Figures:
        c.create_polygon(i, outline = 'khaki',fill = obtainRandomColour(), width = 2)

def obtainEucledianDistance(x1,y1,x2,y2):
    a = x2-x1
    b = y2-y1
    a*=a
    b*=b
    value = a + b
    return math.sqrt(value)


def drawRectSegmentsCircleCenterToVertexes(c,circleX, circleY, pointsX, pointsY,segments):
    nSegments = len(pointsX)
    cost = 0
    list = []
    for i in range(nSegments):
        x2 = pointsX[i]
        y2 = pointsY[i]

        v1 = [circleX,circleY]
        v2 = [x2,y2]

        for j in segments:
            u1 = j[0]
            u2 = j[-1]
            flag = seg_intersection(v1,v2,u1,u2)

            if(flag):
                break

        if(not flag):
            newList = []
            cost = obtainEucledianDistance(circleX, circleY, x2, y2)
            newList.append(cost)
            newList.append((x2,y2))
            list.append(newList)
            c.create_line(circleX,circleY,x2,y2, width=0.1, fill="white")
    return list

def drawVisibilityGraph(c,pointsX, pointsY,segments):
    n = len(pointsX)

    v1,v2,u1,u2 = [],[],[],[]

    for i in range(3):
        x1 = pointsX[i]-1
        y1 = pointsY[i]

        v1 = [x1,y1]
        for j in range(n):
            x2 = pointsX[j]
            y2 = pointsY[j]
            v2 = [x2,y2]
            for k in segments:
                u1 = k[0]
                u2 = k[-1]
                flag = seg_intersection(v1,v2,u1,u2)
                if(flag):
                    break
            if(not flag):
                c.create_line(x1,y1,x2,y2, width = 0.9, fill="green")

def drawCircles(pointsX, pointsY, c):
    n = len(pointsX)
    for i in range(n):
        x = pointsX[i]
        y = pointsY[i]
        c.create_oval(x-4,y-4,x+4,y+4, fill="yellow")



def obtainFiguresSegments(Figures):
    temporalList = []
    cnt = 0
    segments = []
    for figure in Figures:
        tList = []
        cntX = 0
        n = len(figure)/2
        for i in range(n):
            try:
                x = figure[cntX]
                y = figure[cntX+1]
                cntX+=2
                tList.append([x,y])
            except:
                cntX = 0
        temporalList.append(tList)

    for i in temporalList:
        for j in range(len(i)):
            points = []
            if j < len(i)-1:
                points.append(i[j])
                points.append(i[j+1])
            else:
                points.append(i[-1])
                points.append(i[0])
            segments.append(points)

    return segments


def obtainTriangleArea(a,b,c):
    return (b[0]-a[0])*(c[1]-a[1])-(c[0]-a[0])*(b[1]-a[1])

def side_p_to_seg(v1,v2,p):
    area = obtainTriangleArea(v1,v2,p)
    if area > 0 :
        side = "left"
    elif area < 0 :
        side = "right"
    else:
        side = "col"
    return side

def seg_intersection(u1,u2,v1,v2):
    if (side_p_to_seg(u1,u2,v1) == "col" or side_p_to_seg(u1,u2,v2) == "col" or side_p_to_seg(v1,v2,u1) == "col" or side_p_to_seg(v1,v2,u2) == "col"):
        return False
    elif (((side_p_to_seg(u1,u2,v1) == "left" and side_p_to_seg(u1,u2,v2) == "right") or (side_p_to_seg(u1,u2,v1) == "right" and side_p_to_seg(u1,u2,v2) == "left"))and ((side_p_to_seg(v1,v2,u1) == "right" and side_p_to_seg(v1,v2,u2) == "left") or (side_p_to_seg(v1,v2,u1) == "left" and side_p_to_seg(v1,v2,u2) == "right"))):
         return True
    else:
         return False


def determineBestWay(list):
    temporalList = []
    for i in list:
        temporalList.append(i)
    temporalList.sort()
    return temporalList[0]

def testApp():

    segments2 = [] # figures
    root = Tk()
    root.geometry("1270x650")
    c = Canvas(root, bg ="black",height=700, width=1400)

    Figures = obtainRandomFigures()

    drawRandomFigures(c,Figures)
    pointsX, pointsY = obtainXListAndYList(Figures)

    c.create_oval(x1-5,y1-5,x1+5,y1+5, fill="red")
    c.create_oval(x2-5,y2-5,x2+5,y2+5, fill="green")
    drawCircles(pointsX, pointsY, c)

    polys= []
    for list in Figures:
        tmpList = []
        for i in range(0,len(list),2):
            x = list[i]
            y = list[i+1]
            newPoint = vg.Point(x,y)
            tmpList.append(newPoint)
        polys.append(tmpList)

    g = vg.VisGraph()
    g.build(polys)
    shortest = g.shortest_path(vg.Point(x1,y1), vg.Point(x2, y2))
    cnt = 0
    for n in range(len(shortest)):
        try:
            c.create_line(shortest[n].x,shortest[n].y,shortest[n+1].x,shortest[n+1].y, width = 0.9, fill="green")
        except:
            pass

    #hilo1 = threading.Thread(target=avanzarPunto, args=(shortest,c,))
    #hilo1.start()
    c.pack()

    root.mainloop()
def avanzarPunto(shortest,c):
    while(True):
        for n in range(len(shortest)):
            x =  shortest[n].x
            y =  shortest[n].y
            while(x,y != shortest[n+1].x, shortest[n+1].y):

                if(shortest[n].y == shortest[n+1].y):
                    x = x + 1
                elif(shortest[n].y < shortest[n+1].y):
                    x = x + 1
                    y = y + 1
                elif(shortest[n].y > shortest[n+1].y):
                    x = x + 1
                    y = y - 1

                c.create_oval(x-5,y-5,x+5,y+5, fill="red")
                time.sleep(0.02)


    print(shortest)
testApp()
