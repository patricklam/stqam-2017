# run this test as 'python line-intersection-test.py'

from line_intersection import *
import unittest

class TestIntersection(unittest.TestCase):
    def test_aAbB(self):
        a = LineSegment(0,2)
        b = LineSegment(3,7)
        self.assertFalse(intersect(a,b))
        self.assertFalse(intersect(b,a))

    def test_abAB(self):
        a = LineSegment(0,4)
        b = LineSegment(3,7)
        self.assertTrue(intersect(a,b))
        self.assertTrue(intersect(b,a))

    def test_abBA(self):
        a = LineSegment(0,4)
        b = LineSegment(1,2)
        self.assertTrue(intersect(a,b))
        self.assertTrue(intersect(b,a))

    def test_equality(self):
        a = LineSegment(0,2)
        b = LineSegment(2,4)
        self.assertTrue(intersect(a,b))        # A = b
        self.assertTrue(intersect(b,a))        # B = a
        a = LineSegment(2,2)
        b = LineSegment(0,4)
        self.assertTrue(intersect(a,b))        # a = A
        self.assertTrue(intersect(b,a))        # b = B
        a = LineSegment(0,2)
        b = LineSegment(0,4)
        self.assertTrue(intersect(a,b))        # a = b
        self.assertTrue(intersect(b,a))        # b = a

if __name__ == '__main__':
    unittest.main()
