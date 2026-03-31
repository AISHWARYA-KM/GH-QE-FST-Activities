import pytest
@pytest.fixture

def num_list():
    int_list=[20,10,10]
    return int_list

def testsum(num_list):
    sum=0
    for n in num_list:
        sum+=n
    assert sum ==40

