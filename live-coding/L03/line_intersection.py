class LineSegment:
    def __init__(self, x1, x2):
        self.x1 = x1; self.x2 = x2;

# this code was found by Michael Thiessen on stackoverflow:
# http://stackoverflow.com/questions/306316/determine-if-two-rectangles-overlap-each-other?rq=1
def intersect(a, b):
    return (a.x1 < b.x2) & (a.x2 > b.x1);
