import unittest
import classpractice 
class ClassFunctionPractice(unittest.TestCase):
    
    def test_that_check_if_dollar_amount_exists(self):
        classpractice.get_amount(10)
    
    def that_take_dollar_amount_and_returns_amount_in_naira(self):
        amount = classpractice.get_amount(10)
        result = 15500
        self.assertEqual(amount, result)
