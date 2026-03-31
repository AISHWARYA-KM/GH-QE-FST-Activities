import pytest

@pytest.mark.operations
def testaddition():
    a=10
    b=20
    sum=a+b

    assert sum==30

def test_subtraction():
    a=30
    b=15
    diff=a-b

    assert diff==15

@pytest.mark.operations
def test_multiply():
    a=3
    b=5
    mul=a*b

    assert mul==10

def testdivision():
    a=30
    b=15
    div=a/b

    assert div==15
