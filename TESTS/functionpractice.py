def get_cube(number):
    if type(number) == str:
        return 'invalid data'
    return round((number ** 3), 2)