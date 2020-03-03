#!/usr/bin/python
import sys
import pymysql

def get_item(barcode: int):
    # setup
    db = pymysql.connect(
            host='localhost',
            user='read_only',
            password='password',
            db="expired")
    cursor = db.cursor()

    # search it for barcode
    cursor.execute("query", barcode)
    data = cursor.fetchone()
    print("Result: ", data)

    # return formated data if able
    db.close()
    return data

get_item(sys.argv[1])
