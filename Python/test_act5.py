import pytest
@pytest.fixture

def testsum(num_list):
    sum=0
    for n in num_list:
        sum+=n
    assert sum ==40