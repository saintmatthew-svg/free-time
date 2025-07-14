import unittest
import functionpractice 
class TestCubeFunction(unittest.TestCase):
    
    def test_that_cube_function_exists(self):
        functionpractice.get_cube(3)
        
    def test_that_cube_function_return_correct_value(self):
        actual = functionpractice.get_cube(3)
        result = 27
        self.assertEqual(actual, result)
        actual = functionpractice.get_cube(5)
        result = 125
        self.assertEqual(actual, result)
        
    def test_that_cube_function_return_negative_value_with_negative_parameter(self):
        actual = functionpractice.get_cube(-3)
        result = -27
        self.assertEqual(actual, result)
        
    def test_that_cube_function_returns_invalid_data_with_invalid_input(self):
        actual = functionpractice.get_cube('a')
        result = 'invalid data'
        self.assertEqual(actual, result)
        
    def test_that_cube_function_return_decimal_value(self):
        actual = functionpractice.get_cube(3.24)
        result = 34.01
        self.assertEqual(actual, result)
    