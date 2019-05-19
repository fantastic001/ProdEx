import odspy

doc = odspy.ODSDocument("Requirements.ods")

for row in doc.rows[1:]:
    val = row[0].value
    print("*** TODO Planning: %s - 1h" % val)
    print("*** TODO Implementation: %s - 2h" % val)
    print("*** TODO Testing: %s - 1h" % val)
